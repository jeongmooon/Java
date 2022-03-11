package JDBC01.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) throws Exception {
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String driver ="oracle.jdbc.driver.OracleDriver";
		Connection con =null;
		Statement stmt =null;
		Scanner keyboard =null;
		
		try {
			Class.forName(driver);		
			
			con = DriverManager.getConnection(url,"scott","tiger");
			keyboard = new Scanner(System.in);
			
			System.out.println("=======번호,아이디,pwd순으로 입력하세요======");
			String result = keyboard.nextLine();
			System.out.println(result);
			
			int no = Integer.parseInt(result.split(",")[0]); 
			String id = result.split(",")[1];
			String pwd = result.split(",")[2];			
					
			/*
			//statement			 
			String sql ="INSERT INTO member VALUES("+no+",'"+id+"','"+pwd+"')";
			stmt = con.createStatement();			
			int i = stmt.executeUpdate(sql);
			*/
			
			//PreparedStatement
			String sql = "INSERT INTO member VALUES(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,no);
			pstmt.setString(2,id);
			pstmt.setString(3,pwd);
			int i = pstmt.executeUpdate();
			
			System.out.println("insert check :"+i+"개의 행이 만들어 졌습니다.");
			
		} catch(ClassNotFoundException e) {
			System.out.println("\n ClassNotFound Exception 발생\n");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("\n JDBC SQLException 발생 :"+e.getErrorCode());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("\n Exception 발생"+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				keyboard.close();
				if(stmt !=null) stmt.close();
				if(con != null) con.close();
			} catch(Exception e) {
				System.out.println("\n Exception 발생 :"+e.getMessage());
				e.printStackTrace();
			}			
		}
	}//main
}//class
