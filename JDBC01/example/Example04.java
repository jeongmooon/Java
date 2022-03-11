package JDBC01.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example04 {
	public static void main(String[] args) throws Exception {
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver ="oracle.jdbc.driver.OracleDriver";
		Connection con =null;
		Statement stmt =null;
		PreparedStatement pstmt =null;
		
		String sql ="select * from member";		
		
		try {
			Class.forName(driver);		
			
			con = DriverManager.getConnection(url,"scott","tiger");
			
			//stmt
			//stmt =con.createStatement();
			//ResultSet rs = stmt.executeQuery(sql);
			
			//preparedtmt
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			

			while(rs.next()){
				int no = rs.getInt(1);
				String id = rs.getString(2);
				String pwd = rs.getString(3);				
				System.out.println("ȸ������ =>\t��ȣ :"+no+"\t id: "+id+"\t pwd : "+pwd);
			}
			
		} catch(ClassNotFoundException e) {
			System.out.println("\n ClassNotFound Exception �߻�\n");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("\n JDBC SQLException �߻� :"+e.getErrorCode());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("\n Exception �߻�"+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(pstmt !=null) pstmt.close();
				if(stmt !=null) stmt.close();
				if(con != null) con.close();
			} catch(Exception e) {
				System.out.println("\n Exception �߻� :"+e.getMessage());
				e.printStackTrace();
			}			
		}
	}//main
}
