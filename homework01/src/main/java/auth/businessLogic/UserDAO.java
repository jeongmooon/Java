package auth.businessLogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import hk.common.dao.AbstractDao;

public class UserDAO extends AbstractDao {
	
	//Constructor
	public UserDAO() {
	}
	
	public void addUser(UserVO userVO) {
		Connection con =null;
		PreparedStatement pstmt = null;
		System.out.println("userDao start");
		//System.out.println(userVO);
		try {
			
			con = this.connect();
			
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
			this.close(con, pstmt);
		}
	}
	
	public UserVO findUser(String id) {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserVO uvo= new UserVO();
		System.out.println(id);
		try {			
			con = this.connect();
			//System.out.println(id);
			String sql = "select * from m_test where id = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
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
				uvo.setAdress(rs.getString(13));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pstmt, rs);
		}
		System.out.println("userDao end");
		return uvo;
	}
	
	public void updateUser(UserVO userVO,String id, String passwd) {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		System.out.println("UserDAO updateUser 133번행"+userVO);
		try {			
			con = this.connect();
			
			String sql = "UPDATE M_TEST\r\n"
					+ "SET\r\n"
					+ "name =?,\r\n"
					+ "id =?,\r\n"
					+ "passwd=?,\r\n"
					+ "education=?,\r\n"
					+ "job=?,\r\n"
					+ "phonenum=?,\r\n"
					+ "adrees=?\r\n"
					+ "where id =? and passwd =?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userVO.getName());
			pstmt.setString(2, userVO.getId());
			pstmt.setString(3, userVO.getPasswd());
			pstmt.setString(4, userVO.getEducation());
			pstmt.setString(5, userVO.getJob());
			pstmt.setString(6, userVO.getPhonenum());
			pstmt.setString(7, userVO.getAdress());
			//System.out.println("UserDAO updateUser 159번행 "+userVO.getAdress());
			
			pstmt.setString(8, id);
			pstmt.setString(9, passwd);
			
			int a = pstmt.executeUpdate();
			
			if(a == 1) {
				System.out.println(userVO.getName()+"님 업데이트 성공");
			} else {
				System.out.println(userVO.getName()+"님 업데이트 실패 userDAO 문제");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pstmt, rs);
		}
		System.out.println("userDao end");
	}
}
