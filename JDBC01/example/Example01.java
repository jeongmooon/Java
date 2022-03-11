package JDBC01.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example01 {

	public static void main(String[] args) throws Exception {
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String driver ="oracle.jdbc.driver.OracleDriver";
		Connection con =null;
		Statement stmt =null;
		
		String sql ="CREATE TABLE member(\r\n"
				+ "	no number,\r\n"
				+ "	id VARCHAR2(10),\r\n"
				+ "	pwd VARCHAR2(10)\r\n"
				+ ")";
		
		try {
			Class.forName(driver);
		
			con = DriverManager.getConnection(url,"scott","tiger");
		
			stmt=con.createStatement();			
			System.out.println(":: QUERY 전송 결과"+stmt.executeUpdate(sql) );
			
			}catch(ClassNotFoundException e){
				System.out.println("\n ClassNotFoundException 발생\n"+e.getMessage());
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("\n JDBC SQLException 발생 :"+e.getErrorCode());
				e.printStackTrace();
			} catch(Exception e){
				System.out.println("\n Exception 발생"+e.getMessage());
				e.printStackTrace();
			} finally {
				try {
					if(stmt !=null) stmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					System.out.println("\n Exception 발생 :"+e.getErrorCode());
					e.printStackTrace();
				}
			}//finally
		
	}

}
