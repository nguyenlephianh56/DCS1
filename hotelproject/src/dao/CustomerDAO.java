package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Customer;

public class CustomerDAO implements DAOInterface<Customer> {

	@Override
	public int insert(Customer t) {
		int result = 0;
		try {
			Connection conn = JDBCUtil.getConnection();

			String sql = "INSERT INTO customer (cID, fullName, age, gender, phoneNumber, idCard) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setString(1, t.getcID());
			prst.setString(2, t.getFullName());
			prst.setInt(3, t.getAge());
			prst.setString(4, t.getGender());
			prst.setString(5, t.getPhoneNumber());
			prst.setString(6, t.getIdCard());

			result = prst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int update(Customer t) {
		int result = 0;
		try {
			Connection conn = JDBCUtil.getConnection();

			String sql = "UPDATE customer SET fullName = ?, age =? , gender= ?, phoneNumber= ?, idCard= ?"
					+ "WHERE cID = ?";
			PreparedStatement prst = conn.prepareStatement(sql);

			prst.setString(1, t.getFullName());
			prst.setInt(2, t.getAge());
			prst.setString(3, t.getGender());
			prst.setString(4, t.getPhoneNumber());
			prst.setString(5, t.getIdCard());
			prst.setString(6, t.getcID());

			result = prst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public int delete(Customer t) {
		int result = 0;
		try {
			Connection conn = JDBCUtil.getConnection();

			String sql = "DELETE FROM customer "
					+ "WHERE cID = ?";
			PreparedStatement prst = conn.prepareStatement(sql);

			prst.setString(1, t.getcID());

			result = prst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public ArrayList<Customer> selectAll() {
		ArrayList<Customer> customers = new ArrayList<>();
		try {
			Connection conn = JDBCUtil.getConnection();

			String sql = "SELECT * FROM customer";
			PreparedStatement prst = conn.prepareStatement(sql);

			ResultSet rst = prst.executeQuery();
			
			while (rst.next()) {
				String cID = rst.getString("cID");
				String fullName = rst.getString("fullName");
				int age = rst.getInt("age");
				String gender = rst.getString("gender");
				String phoneNumber = rst.getString("phoneNumber");
				String idCard = rst.getString("idCard");
				
				Customer customer = new Customer(cID, fullName, age, gender, phoneNumber, idCard);
				customers.add(customer);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return customers;
	}

	@Override
	public Customer selectById(Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Customer> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<Customer> searchByCondition(String condition, String keyword) {
		ArrayList<Customer> customers = new ArrayList<>();
		try {
			Connection conn = JDBCUtil.getConnection();
			
			String collumn = "";
			if(condition.equals("Mã")) {
				collumn = "cID";
			} else if(condition.equals("Tên")) {
				collumn = "fullName";
			} else if(condition.equals("Tuổi")) {
				collumn = "age";
			} else if(condition.equals("Giới Tính")) {
				collumn = "gender";
			} else if(condition.equals("SĐT")) {
				collumn = "phoneNumber";
			}else if(condition.equals("CCCD")) {
				collumn = "idCard";
			}
			
			String sql = "SELECT * FROM customer Where " + collumn + " LIKE ?";
			PreparedStatement prst = conn.prepareStatement(sql);

			prst.setString(1,"%" +keyword+ "%");
			ResultSet rst = prst.executeQuery();
			
			while (rst.next()) {
				String cID = rst.getString("cID");
				String fullName = rst.getString("fullName");
				int age = rst.getInt("age");
				String gender = rst.getString("gender");
				String phoneNumber = rst.getString("phoneNumber");
				String idCard = rst.getString("idCard");
				
				Customer customer = new Customer(cID, fullName, age, gender, phoneNumber, idCard);
				customers.add(customer);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return customers;
	}

}
