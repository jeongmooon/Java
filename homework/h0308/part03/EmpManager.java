package h0308.part03;

import java.sql.Connection;
import java.sql.DriverManager;
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
	
	public void printEmployee(String name, int salary) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con = DriverManager.getConnection(url,"hr","hr");
		
		String query ="SELECT employee_id, first_name, salary\r\n"
				+ "FROM employees\r\n"
				+ "WHERE salary >= "+salary+" AND LOWER(first_name) like LOWER('%"+name+"%')";
		
		ResultSet rs = con.createStatement().executeQuery(query); 

		while(rs.next()){
			int employeeId = rs.getInt(1);
			String firstName = rs.getString(2);
			int salary1 = rs.getInt(3);
			
			System.out.println(employeeId+" "+firstName+" "+salary1);
		}
		
		rs.close();
		con.close();
	}
	
	public static void main(String[] args) throws SQLException {
		new EmpManager().printEmployee("al", 4000);

	}

}
