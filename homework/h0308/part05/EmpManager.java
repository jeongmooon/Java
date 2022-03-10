package h0308.part05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpManager {
	static {
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound Exception 발생");
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String deptId) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url,"hr","hr");
			
			String query ="SELECT a.employee_id,a.department_id,a.salary, AVGSAL\r\n"
					+ "FROM employees a, (SELECT department_name NAME, MIN(salary) MINSAL, MAX(salary) MAXSAL, AVG(salary) AVGSAL\r\n"
					+ "FROM employees a, departments b\r\n"
					+ "WHERE a.department_id=b.department_id\r\n"
					+ "GROUP BY department_name)b, departments c\r\n"
					+ "WHERE a.department_id=c.department_id AND c.department_name=NAME AND a.department_id=?"
					+ "ORDER BY a.employee_id";
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, deptId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int employeeId = rs.getInt(1);
				int departmentId = rs.getInt(2);
				int salary = rs.getInt(3);
				int avgSalary = rs.getInt(4);
				
				System.out.println(employeeId+" "+departmentId+" "+salary+" "+avgSalary);
			}
			
		} catch (SQLException e) {
			System.out.println("\n JDBC SQLException 발생 :"+e.getErrorCode());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("\n 기타Exception 발생 :"+e.getMessage());
			e.printStackTrace();
		}
		finally {
			try {
				if(con !=null)con.close();
				if(pstmt !=null) pstmt.close();
				if(rs !=null)rs.close();
			} catch (SQLException e2) {
				System.out.println("\n JDBC SQLException 발생 :"+e2.getErrorCode());
				e2.printStackTrace();
			}			
		}		
		
	}
	
	public static void main(String[] args) throws SQLException {
		
		Scanner keyboard = null;
		try {
			keyboard = new Scanner(System.in);
			String deptId = keyboard.nextLine();		
			new EmpManager().printEmployee(deptId);			
			
		}catch (IllegalArgumentException e) {
			System.out.println("keyboard인자 errorr?"+e.getMessage());
			e.getStackTrace();
		} finally {
			try {
				if(keyboard !=null)keyboard.close();
			} catch (Exception e2) {
				System.out.println("keyboard errorr?"+e2.getMessage());
			}				
		}			
	}
}
