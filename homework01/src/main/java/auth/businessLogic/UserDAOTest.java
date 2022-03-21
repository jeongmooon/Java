package auth.businessLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAOTest {

	public UserDAOTest() {
	}
	
	public void addUserTest(UserVO userVO) {
		Connection con =null;
		PreparedStatement pstmt = null;
		System.out.println("userDao start");
		//System.out.println(userVO);
		try {
			
			InitialContext ic = new InitialContext();
			DataSource ds =(DataSource)ic.lookup("java:comp/env/jdbc/ora");
			
			con = ds.getConnection();
			
			String sql = "INSERT INTO S_TEST VALUES (?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userVO.getId()); 
			pstmt.setString(2, userVO.getPasswd());
			pstmt.setString(3, userVO.getJob());
			pstmt.setString(4, userVO.getName());			
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println(userVO.getName()+" 회원가입 완료");
				userVO.setActive(true);
			} else {
				System.out.println("회원가입 실패");
			}
			System.out.println("userDao end");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {			
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
