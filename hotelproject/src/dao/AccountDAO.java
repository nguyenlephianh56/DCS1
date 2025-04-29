package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.JDBCUtil;
import util.HashUtil;

public class AccountDAO {
	public int register(String account, String password) {
		int result = 0;
		
		try {
			Connection conn = JDBCUtil.getConnection();
			String sql = "INSERT INTO account(account, password) VALUES (?, ?)";
			
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setString(1, account);
			prst.setString(2, HashUtil.hashPassword(password));
			
			result = prst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean isAccountExist(String account) {
	    boolean exists = false;
	    String sql = "SELECT * FROM account WHERE account = ?";
	    
	    try (Connection conn = JDBCUtil.getConnection();
	         PreparedStatement prst = conn.prepareStatement(sql)) {
	        
	        prst.setString(1, account);
	        ResultSet rs = prst.executeQuery();
	        
	        if (rs.next()) {
	            exists = true;
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return exists;
	}
	
	
	public boolean checkLogin(String account, String password) {
		try {
			Connection conn = JDBCUtil.getConnection();
			
			String sql = "SELECT * FROM account WHERE account = ? AND password = ?";
			
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setString(1, account);
			prst.setString(2, HashUtil.hashPassword(password));
			ResultSet rst = prst.executeQuery();
			
			return rst.next();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
}
