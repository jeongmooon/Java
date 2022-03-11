package JDBC01.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) throws Exception {
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver ="oracle.jdbc.driver.OracleDriver";
		Connection con =null;
		Statement stmt =null;
		Scanner keyboard = null;
		PreparedStatement pstmt =null;
		
		try {
			keyboard = new Scanner(System.in);
			
			System.out.println("=======������ ��ȣ�� �Է��ϼ���======");
			int no = keyboard.nextInt();			
			
			Class.forName(driver);		
			con = DriverManager.getConnection(url,"scott","tiger");
			
			/*
			String sql ="DELETE FROM member WHERE no="+no+"";
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			*/
			
			String sql = "DELETE FROM member WHERE no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int i = pstmt.executeUpdate();			
			System.out.println("delete check :"+i+"���� ���� �����Ǿ����ϴ�.");
			
		} catch(ClassNotFoundException e) {
			System.out.println("\n ClassNotFound Exception �߻�\n");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("\n JDBC SQLException �߻� :"+e.getErrorCode());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("\n Exception �߻�"+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(keyboard !=null) keyboard.close();
				if(stmt !=null) stmt.close();
				if(pstmt !=null) pstmt.close();
				if(con != null) con.close();
			} catch(Exception e) {
				System.out.println("\n Exception �߻� :"+e.getMessage());
				e.printStackTrace();
			}			
		}
	}//main	
}
