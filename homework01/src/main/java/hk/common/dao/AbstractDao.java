package hk.common.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import hk.common.util.DBUtil;

public class AbstractDao {

	public AbstractDao() {
		// TODO Auto-generated constructor stub
	}
	
	public Connection connect() {
		Connection con = null;
		try {
			con = DBUtil.getConnection();
		} catch (RuntimeException e) {
			throw e;
		}
		return con;
	}
	
	public void close(Connection con, PreparedStatement pStmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.close(con, pStmt);
	}
	
	public void close(Connection con, PreparedStatement pStmt) {
		if(pStmt !=null) {
			try {
				pStmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(con !=null) {
			try {
				pStmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
