package h0308.part02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpManager {
	static {
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printStatistics(int maxSalary) {

		System.out.println("=======================================");
		System.out.println("Max Salary : "+maxSalary);
		System.out.println("=======================================");
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user ="hr";
		String pwd = "hr";
			
		Connection con = null;
		ResultSet rs =null;
		PreparedStatement pstmt =null;
		
		try {
			con = DriverManager.getConnection(url,user,pwd);
			String query = "SELECT b.job_title ,AVG(a.salary)\r\n"
					+ "FROM employees a, jobs b\r\n"
					+ "WHERE a.job_id = b.job_id(+) AND salary >=?"
					+ "GROUP BY job_title\r\n"
					+ "ORDER BY AVG(a.salary) desc\r\n";
					
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1,maxSalary);
			rs = pstmt.executeQuery();			
			
			while(rs.next()){
			
				String jobTitle = rs.getString(1);
				int avgSal = rs.getInt(2);

				System.out.print("["+jobTitle+"]");
				System.out.println(" "+avgSal);
			}
			
		} catch(SQLException e) {
			System.out.println("\n JDBC SQLException 발생 :"+e.getErrorCode());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("\n Exception 발생"+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(con !=null) con.close();
				if(rs !=null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				System.out.println("\n JDBC SQLException 발생 :"+e.getErrorCode());
				e.printStackTrace();
			}			
			
		}		
	}
	
	public static void main(String[] args) throws SQLException {
		int maxSalary = 10000;
		new EmpStatistics().printStatistics(maxSalary);
		
		int maxSalary1 = 15000;
		new EmpStatistics().printStatistics(maxSalary1);
	}
}
