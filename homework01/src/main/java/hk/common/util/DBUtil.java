package hk.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {

	public DBUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection(String driverClassName,String url,String id, String password) {
		Connection con =null;
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.getStackTrace();
			throw new RuntimeException("DB ���ӽ� ����>>>>"+e);
		}
		return con;
	}
	
	public static Connection getConnection() {
		Connection con =null;
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con==null) {
				con = getConnection("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@127.0.0.1:1521:xe",
						"scott","tiger");
			}
		}
		return con;
	}
}
