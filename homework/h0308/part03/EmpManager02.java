package h0308.part03;

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
			System.out.println("ClassNotFound Exception 惯积");
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String name, int salary) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(url,"hr","hr");
			
			String query ="SELECT employee_id, first_name, salary\r\n"
					+ "FROM employees\r\n"
					+ "WHERE salary >= ? AND LOWER(first_name) like LOWER('%?%')";			
						
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1,salary);
			pstmt.setString(2,name);
			rs = pstmt.executeQuery();

			while(rs.next()){
				int employeeId = rs.getInt(1);
				String firstName = rs.getString(2);
				int salary1 = rs.getInt(3);
				
				System.out.println(employeeId+" "+firstName+" "+salary1);
			}
		} catch(SQLException e) {
			System.out.println("\n JDBC SQLException 惯积 :"+e.getErrorCode());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("\n Exception 惯积"+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(con != null)con.close();
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				
			} catch (SQLException e2) {
				System.out.println("\n JDBC SQLException 惯积 :"+e2.getErrorCode());
				e2.printStackTrace();
			}			
		}		
		
	}
	
	public static void main(String[] args) throws SQLException {
		new EmpManager().printEmployee("al", 4000);

	}

}
