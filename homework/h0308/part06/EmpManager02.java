package h0308.part06;

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
	public void printEmployee(String city, int lo, int hi) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		
		try {
			conn = DriverManager.getConnection(dburl,"hr","hr");
			String query ="SELECT last_name, department_name\r\n"
					+ "FROM employees a, departments b, locations c\r\n"
					+ "WHERE a.department_id=b.department_id AND b.location_id=c.location_id\r\n"
					+ "AND salary BETWEEN ? AND ? AND LOWER(c.city) LIKE LOWER(?)";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, lo);
			pstmt.setInt(2, hi);
			pstmt.setString(3, city);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String lastName = rs.getString(1);
				String departmentName = rs.getString(2);
				
				System.out.println(lastName+" "+departmentName);
			}
		}catch (SQLException e) {
			System.out.println("SQLException 발생"+e.getErrorCode());
		}catch (Exception e) {
			System.out.println("기타Exception 발생 :"+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(conn !=null) conn.close();
				if(pstmt !=null) pstmt.close();
				if(rs !=null) rs.close();
			} catch (SQLException e2) {
				System.out.println("SQLException"+e2.getErrorCode());
				e2.printStackTrace();
			}			
		}		
	}
	
	public static void main(String[] args) throws SQLException {
		new EmpManager().printEmployee("South San Francisco", 7000, 10000);

	}
}
