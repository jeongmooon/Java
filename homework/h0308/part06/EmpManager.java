package h0308.part06;

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
	public void printEmployee(String city, int lo, int hi) throws SQLException {
		String dburl = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = DriverManager.getConnection(dburl,"hr","hr");
		
		String query ="SELECT last_name, department_name\r\n"
				+ "FROM employees a, departments b, locations c\r\n"
				+ "WHERE a.department_id=b.department_id AND b.location_id=c.location_id\r\n"
				+ "AND salary BETWEEN "+lo+" AND "+hi+" AND LOWER(c.city) LIKE LOWER('"+city+"')";
		ResultSet rs = conn.createStatement().executeQuery(query);
		
		while(rs.next()) {
			String lastName = rs.getString(1);
			String departmentName = rs.getString(2);
			
			System.out.println(lastName+" "+departmentName);
		}
		conn.close();
		rs.close();
	}
	public static void main(String[] args) throws SQLException {
		new EmpManager().printEmployee("South San Francisco", 7000, 10000);

	}

}
