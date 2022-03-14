package jw04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserPoolDao {
	//Field
	//private String dburl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//private String dbuser = "scott";
	//private String dbpwd ="tiger";
	
	//Constructor
	public UserPoolDao() {
	}
	
	public void getUser(UserVO userVO) {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 1�ܰ� connection
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			
			//==> OracleConnectionPool�� ���� Connection �ν��Ͻ� GET
			con = OracleConnectionPool.getInstance().getConnection();
			
			// 2�ܰ� Statement
			pstmt = con.prepareStatement("SELECT id,pwd FROM users WHERE id =? AND pwd=?");
			pstmt.setString(1, userVO.getId());
			pstmt.setString(2, userVO.getPwd());
			
			// 3�ܰ� resultSet
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("db���� Ȯ�� �� id,pwd ==> "+userVO.getId()+" : "+userVO.getPwd());
				// Data�� ������ �ٸ�
				userVO.setActive(true);
			} else {
				System.out.println("db�� <"+userVO.getId()+">�� �ش��ϴ� �ڷᰡ �����ϴ�.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e2) {
				}				
			}
			if(pstmt !=null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

}

