package h0308.part02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpStatistics {
	static {
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printStatistics(int maxSalary) throws SQLException{

		System.out.println("=======================================");
		System.out.println("Max Salary : "+maxSalary);
		System.out.println("=======================================");
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user ="hr";
		String pwd = "hr";
		
		Connection con = DriverManager.getConnection(url,user,pwd);
		
		String query ="SELECT b.job_title ,AVG(a.salary)\r\n"
				+ "FROM employees a, jobs b\r\n"
				+ "WHERE a.job_id = b.job_id(+) AND salary >= "+maxSalary+"\r\n"
				+ "GROUP BY job_title\r\n"
				+ "ORDER BY AVG(a.salary) desc\r\n";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query); 

		while(rs.next()){
		
			String jobTitle = rs.getString(1);
			int avgSal = rs.getInt(2);

			System.out.print("["+jobTitle+"]");
			System.out.println(" "+avgSal);
		}
		
		rs.close();
		stmt.close();
		con.close();
		
	}
	
	public static void main(String[] args) throws SQLException {
		int maxSalary = 10000;
		new EmpStatistics().printStatistics(maxSalary);
		
		int maxSalary1 = 15000;
		new EmpStatistics().printStatistics(maxSalary1);
	}
}
