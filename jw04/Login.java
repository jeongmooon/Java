package jw04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		
		PrintWriter out = res.getWriter();
		
		//Client Form Data ó��
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		//============================================================//
		//============JDBC ����========================================//
		//============================================================//
		//DBMS���� ������ id,pwd ó�� ���� ��������
		String fromDbId = null;
		String fromDbPwd = null;
		
		try {
			String dburl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbuser = "scott";
			String dbpwd = "tiger";
			
			// 1�ܰ� Connection
			String driver ="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dburl,dbuser,dbpwd);
			
			// 2�ܰ� PreparedStatement
			PreparedStatement pstmt = con.prepareStatement("SELECT id, pwd FROM useers Where id =?");
			pstmt.setString(1, id);
			
			// 3�ܰ� ResultSet
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				fromDbId = rs.getNString("id");
				fromDbPwd = rs.getString("pwd");
				//==> debug :: console Ȯ��
				System.out.println("db���� Ȯ�� �� id,pwd ==> : "+fromDbId+" : "+fromDbPwd);				
			} else {
				//==> debug :: consoleȮ��
				System.out.println("db�� client���� �Է��� <"+id+"> �� <"+pwd+">�� �����ϴ�.");
			}
			
			// ������ JDBC���� �ν��Ͻ� close
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("===> JDBC���� Exception�� �߻��� ��� <===");
			e.printStackTrace();
		}
		//============================================================//
		//============JDBC ����========================================//
		//============================================================//
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login ȭ��</h2>");
		
		// DBMS Data�� Client Form Data�� ȸ������ �Ǵ�
		if(fromDbId != null && fromDbPwd.equals(pwd)) {
			out.println(id+"�� ȯ���մϴ�.");
		} else {
			out.println("id,pwd�� Ȯ���ϼ���");
		}
		out.println("<p><p><a href='/edu/jw04/login.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
