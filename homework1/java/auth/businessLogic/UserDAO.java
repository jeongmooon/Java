package auth.businessLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO {
	
	//Constructor
	public UserDAO() {
	}
	
	public void addUser(UserVO userVO) {
		Connection con =null;
		PreparedStatement pstmt = null;
		System.out.println("userDao start");
		//System.out.println(userVO);
		try {
			
			InitialContext ic = new InitialContext();
			DataSource ds =(DataSource)ic.lookup("java:comp/env/jdbc/ora");
			
			con = ds.getConnection();
			
			String sql = "INSERT INTO M_TEST VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			String[] info = userVO.getAll();
			
			for(int i=0; i<info.length; i++) {
				pstmt.setString(i+1,info[i]);
			}
			
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
	
	public UserVO findUser(String id) {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserVO uvo= new UserVO();
		System.out.println(id);
		try {			
			InitialContext ic = new InitialContext();
			DataSource ds =(DataSource)ic.lookup("java:comp/env/jdbc/ora");
			
			con = ds.getConnection();
			
			String sql = "select * from m_test where id = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			
//			while(rs.next()) {
//				for(int i=1; i<13; i++) {
//					info += i+":\""+rs.getString(i)+"\",";
//				}
//				info += "adress:\""+rs.getString(13)+"\"";
//			}
			while(rs.next()) {
				uvo.setName(rs.getString("name"));
				uvo.setId(rs.getString("id"));
				uvo.setPasswd(rs.getString("passwd"));
				uvo.setGender(rs.getString("gender"));
				uvo.setCal(rs.getString("cal"));
				uvo.setLuCal(rs.getString("luCal"));
				uvo.setEducation(rs.getString("education"));
				uvo.setJob(rs.getString("job"));
				uvo.setMerry(rs.getString("merry"));
				uvo.setChildnum(rs.getString("childnum"));
				uvo.setContactnum(rs.getString("contactnum"));
				uvo.setPhonenum(rs.getString("phonenum"));
				uvo.setAdress(rs.getString("adress"));
			}
			System.out.println(uvo);
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
		System.out.println("userDao end");
		return uvo;
	}

}
