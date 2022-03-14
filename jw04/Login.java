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
		
		//Client Form Data 처리
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		//============================================================//
		//============JDBC 시작========================================//
		//============================================================//
		//DBMS에서 추출한 id,pwd 처리 위한 변수선언
		String fromDbId = null;
		String fromDbPwd = null;
		
		try {
			String dburl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbuser = "scott";
			String dbpwd = "tiger";
			
			// 1단계 Connection
			String driver ="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dburl,dbuser,dbpwd);
			
			// 2단계 PreparedStatement
			PreparedStatement pstmt = con.prepareStatement("SELECT id, pwd FROM useers Where id =?");
			pstmt.setString(1, id);
			
			// 3단계 ResultSet
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				fromDbId = rs.getNString("id");
				fromDbPwd = rs.getString("pwd");
				//==> debug :: console 확인
				System.out.println("db에서 확인 한 id,pwd ==> : "+fromDbId+" : "+fromDbPwd);				
			} else {
				//==> debug :: console확인
				System.out.println("db에 client에서 입력한 <"+id+"> 와 <"+pwd+">가 없습니다.");
			}
			
			// 각각의 JDBC관련 인스턴스 close
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("===> JDBC관련 Exception이 발생한 모양 <===");
			e.printStackTrace();
		}
		//============================================================//
		//============JDBC 종료========================================//
		//============================================================//
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2>Login 화면</h2>");
		
		// DBMS Data와 Client Form Data비교 회원유무 판단
		if(fromDbId != null && fromDbPwd.equals(pwd)) {
			out.println(id+"님 환영합니다.");
		} else {
			out.println("id,pwd를 확인하세요");
		}
		out.println("<p><p><a href='/edu/jw04/login.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
