package h0308.part07;

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
	public static void printEmployeeList(String cityName, String deptName) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, "hr", "hr");
			
			String query = "SELECT c.city, b.department_name, a.first_name, a.salary\r\n"
					+ "FROM employees a, departments b, locations c\r\n"
					+ "WHERE a.department_id=b.department_id(+) AND b.location_id=c.location_id(+)\r\n"
					+ "AND (LOWER(b.department_name) LIKE LOWER(?)) AND LOWER(c.city) LIKE LOWER(?)";			
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1,"%"+deptName+"%");
			pstmt.setString(2,"%"+cityName+"%");
			rs = pstmt.executeQuery();	
			
			while(rs.next()) {
				String City = rs.getString(1);
				String departmentName = rs.getString(2);
				String name = rs.getString(3);
				int salary = rs.getInt(4);
				
				System.out.println(City+" "+departmentName+" "+name+" "+salary);
			}
			
		}catch (SQLException e) {
			System.out.println("SQLException 발생"+e.getErrorCode());
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("기타Exception 발생 :"+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)rs.close();
			} catch (SQLException e2) {
				System.out.println("SQLException 발생"+e2.getErrorCode());
				e2.printStackTrace();
			}			
		}		
	}
	
	public static void main(String[] args) throws SQLException {
		printEmployeeList("lon","resources");
	}

}
