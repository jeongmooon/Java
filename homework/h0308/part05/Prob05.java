package h0308.part05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prob05 {

	public static void main(String[] args) throws SQLException {
		if(args.length != 1) {
			System.out.println("부서의 아이디를 입력하세요...");
			System.exit(1);
		}
		String dept_id = args[0];
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con = DriverManager.getConnection(url,"hr","hr");
		
		String query ="SELECT a.employee_id,a.department_id,a.salary, AVGSAL\r\n"
				+ "FROM employees a, (SELECT department_name NAME, MIN(salary) MINSAL, MAX(salary) MAXSAL, AVG(salary) AVGSAL\r\n"
				+ "FROM employees a, departments b\r\n"
				+ "WHERE a.department_id=b.department_id\r\n"
				+ "GROUP BY department_name)b, departments c\r\n"
				+ "WHERE a.department_id=c.department_id AND c.department_name=NAME AND a.department_id="+dept_id+"\r\n"
				+ "ORDER BY a.employee_id";
		ResultSet rs = con.createStatement().executeQuery(query);
		
		while(rs.next()) {
			int employeeId = rs.getInt(1);
			int departmentId = rs.getInt(2);
			int salary = rs.getInt(3);
			int avgSalary = rs.getInt(4);
			
			System.out.println(employeeId+" "+departmentId+" "+salary+" "+avgSalary);
		}
		
		con.close();
		rs.close();
	}

}
