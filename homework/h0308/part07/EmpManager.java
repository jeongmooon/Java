package h0308.part07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpManager {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
	}
	public static void printEmployeeList(String cityName, String deptName) throws SQLException {
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = DriverManager.getConnection(dbUrl, "hr", "hr");
		
		String query = "SELECT c.city, b.department_name, a.first_name, a.salary\r\n"
				+ "FROM employees a, departments b, locations c\r\n"
				+ "WHERE a.department_id=b.department_id(+) AND b.location_id=c.location_id(+) AND "
				+ "LOWER(b.department_name) LIKE LOWER('%"+deptName+"%') AND LOWER(c.city) LIKE LOWER('%"+cityName+"%')";
		
		ResultSet rs = conn.createStatement().executeQuery(query);
		
		while(rs.next()) {
			String City = rs.getString(1);
			String departmentName = rs.getString(2);
			String name = rs.getString(3);
			int salary = rs.getInt(4);
			
			System.out.println(City+" "+departmentName+" "+name+" "+salary);
		}
		
		conn.close();
		rs.close();
	}
	
	public static void main(String[] args) throws SQLException {
		printEmployeeList("lon","resources");
	}

}
