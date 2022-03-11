package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateJDBC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con =null;
		Statement stmt =null;
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. driver loading OK");
		}catch(ClassNotFoundException e){
			System.out.println("\n==> Driver Loading 시 Exception 발생\n");
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,"scott","tiger");
		} catch (SQLException e) {
			System.out.println("\n==> JDBC 절차 중 Exception 발생 :"+e.getErrorCode());
			e.printStackTrace();
		}
		
		try {
			stmt=con.createStatement();
			System.out.println("3. statement객체 생성완료");
		} catch (SQLException e) {
			System.out.println("\n==> JDBC 절차 중 Exception 발생 :"+e.getErrorCode());
			e.printStackTrace();
		}
		
		String createSql = 
				"CREATE TABLE firstJDBC"
		+		"(no number(3),"
		+ 		"name varchar2(20),"
		+ 		"email varchar2(30),"
		+ 		"address varchar2(50))";
		
		try {
			System.out.println(":: QUERY 전송 결과"+stmt.executeUpdate(createSql) );
			System.out.println("4.query 전송 완료");
		} catch (SQLException e) {
			System.out.println("\n==> JDBC 절차 중 Exception 발생 :"+e.getErrorCode());
			e.printStackTrace();
		}
		
		try {
			if(stmt !=null) stmt.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			System.out.println("\n==> JDBC 절차 중 Exception 발생 :"+e.getErrorCode());
			e.printStackTrace();
		}
	}

}
