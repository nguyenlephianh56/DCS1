package dao;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Room;

public class RoomDAO implements DAOInterface<Room> {

	@Override
	public int insert(Room t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Room t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Room t) {
		// TODO Auto-generated method stub
		return 0;
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
				
				Room room = new Room(rID, roomnNumber, roomType, floor, status);
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
