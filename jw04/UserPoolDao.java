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
			// 1단계 connection
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			
			//==> OracleConnectionPool로 부터 Connection 인스턴스 GET
			con = OracleConnectionPool.getInstance().getConnection();
			
			// 2단계 Statement
			pstmt = con.prepareStatement("SELECT id,pwd FROM users WHERE id =? AND pwd=?");
			pstmt.setString(1, userVO.getId());
			pstmt.setString(2, userVO.getPwd());
			
			// 3단계 resultSet
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("db에서 확인 한 id,pwd ==> "+userVO.getId()+" : "+userVO.getPwd());
				// Data가 존재한 다면
				userVO.setActive(true);
			} else {
				System.out.println("db에 <"+userVO.getId()+">에 해당하는 자료가 없습니다.");
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

