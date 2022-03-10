package h0308.part04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpManager02 {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound Exception 발생");
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String jobs[]) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		if(jobs.length !=2) {
			System.out.println("인자값 오류");
			return;
		}
		
		try {
			con = DriverManager.getConnection(url,"hr","hr");		
			
			String query ="SELECT employee_id, first_name, salary\r\n"
					+ "FROM employees a, jobs b\r\n"
					+ "WHERE a.job_id=b.job_id AND (LOWER(b.job_title) LIKE LOWER(?) OR LOWER(b.job_title) LIKE LOWER(?))";

			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, jobs[0]);
			pstmt.setString(2, jobs[1]);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int employeeId = rs.getInt(1);
				String firstName = rs.getString(2);
				int salary1 = rs.getInt(3);
				
				System.out.println(employeeId+" "+firstName+" "+salary1);
			}
		} catch(SQLException e) {
			System.out.println("\n JDBC SQLException 발생 :"+e.getErrorCode());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("\n Exception 발생"+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(con !=null)con.close();
				if(pstmt !=null)pstmt.close();
				if(rs !=null)rs.close();				
			} catch (SQLException e2) {
				System.out.println("\n JDBC SQLException 발생 :"+e2.getErrorCode());
				e2.printStackTrace();
			}
			
		}
		
		
		
	}
	public static void main(String[] args) throws SQLException {
		String[] jobs = {"Accountant","Stock Clerk"};
		new EmpManager().printEmployee(jobs);		

	}
}
