package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Room;

public class RoomDAO implements DAOInterface<Room> {

	public static RoomDAO getInstance() {
		return new RoomDAO();
	}
		
	@Override
	public int insert(Room t) {
			int result = 0;
			
			try {
				Connection conn = JDBCUtil.getConnection();
				
				String sql = "INSERT INTO room(rID, roomNumber,	roomType, floor, status, note) "
						+ "VALUES (?, ?, ?, ?,?, ?)" ;
				PreparedStatement prst = conn.prepareStatement(sql);
				prst.setString(1, t.getrID());
				prst.setInt(2, t.getRoomNumber());
				prst.setString(3, t.getRoomType());
				prst.setInt(4, t.getFloor());
				prst.setString(5, t.getStatus());
				prst.setString(6, t.getNote());
				
				result = prst.executeUpdate();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return result;
		}

	@Override
	public int update(Room t) {
		int result = 0;
		
		try {
			Connection conn = JDBCUtil.getConnection();
			
			String sql = "UPDATE room "
					+ "SET roomNumber =?,	roomType = ?, floor = ?, status = ?, note = ?"
					+ "WHERE rid = ? " ;
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setInt(1, t.getRoomNumber());
			prst.setString(2, t.getRoomType());
			prst.setInt(3, t.getFloor());
			prst.setString(4, t.getStatus());
			prst.setString(5, t.getNote());
			prst.setString(6, t.getrID());
			
			result = prst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int delete(Room t) {
		int result = 0;
		
		try {
			Connection conn = JDBCUtil.getConnection();
			
			String sql = "DELETE FROM room "
					+ "WHERE rid = ?" ;
			PreparedStatement prst = conn.prepareStatement(sql);
			prst.setString(1, t.getrID());
			
			
			result = prst.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	

	@Override
	public ArrayList<Room> selectAll() {
		ArrayList<Room> rooms = new ArrayList<Room>(); 
		try {
			Connection conn = JDBCUtil.getConnection();
			
			String sql = "Select * from room";
			PreparedStatement prst = conn.prepareStatement(sql);
			
			ResultSet rst = prst.executeQuery();
			
			while (rst.next()) {
				String rID = rst.getString("rID");
				int roomnNumber = rst.getInt("roomNumber");
				String roomType = rst.getString("roomType");
				int floor = rst.getInt("floor");
				String status = rst.getString("status");
				String note = rst.getString("note");
				
				Room room = new Room(rID, roomnNumber, roomType, floor, status, note);
				rooms.add(room);
				
//				JDBCUtil.closeConnection(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rooms;
		
	}

	@Override
	public Room selectById(Room t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Room> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
