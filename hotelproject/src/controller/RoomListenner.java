package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.RoomDAO;

import model.Room;
import view.MainView;
import view.RoomView;




public class RoomListenner implements ActionListener{
	RoomView roomView;
	RoomDAO roomDAO;
	MainView mainView;
	
	

	public RoomListenner(RoomView roomView, RoomDAO roomDAO, MainView mainView) {
	    this.roomView = roomView;
	    this.roomDAO = roomDAO;
	    this.mainView = mainView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		try {
			if (src.equals("Thêm")) {
				insert();
				
			}else if (src.equals("Làm mới")) {
				roomView.updateTable();
				mainView.updateRoom();
			} else if(src.equals("Sửa")) {
				update();
			}else if (src.equals("Xóa")) {
				delete();
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}

	
	public void insert() {
		try {
			String rID = roomView.getTextRoom().getText();
			int floor = Integer.parseInt(roomView.getBoxFloor().getSelectedItem().toString());
			String roomType = roomView.getBoxRoomType().getSelectedItem().toString();
			String status = roomView.getBoxStatus().getSelectedItem().toString();
			String note = roomView.getTextNote().getText();
			
			if(rID.isEmpty()) {
				JOptionPane.showMessageDialog(roomView, "Vui lòng nhập số phòng!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			boolean exist = false;
			for (Room existRoom : roomDAO.selectAll()) {
				if (existRoom.getrID().equals(rID)) {
					exist = true;
					break;
				}
			}
			if (exist) {
				JOptionPane.showMessageDialog(roomView, "Phòng đã tồn tại!");
			}else {
				Room room = new Room(rID , roomType, floor, status, note);
				int result = roomDAO.insert(room);
				
				
				if (result > 0) {
					if (mainView == null) {
					    System.err.println("MainView is null!");
					} else {
					    mainView.updateRoom();
					}
					JOptionPane.showMessageDialog(roomView, "Đã thêm phòng!");

				}
			}
	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(roomView, "Invalid data!", "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	public void update() {
		try {
			String rID = roomView.getTextRoom().getText();
			int floor = Integer.parseInt(roomView.getBoxFloor().getSelectedItem().toString());
			String roomType = roomView.getBoxRoomType().getSelectedItem().toString();
			String status = roomView.getBoxStatus().getSelectedItem().toString();
			String note = roomView.getTextNote().getText();
			
			Room room = new Room(rID, roomType, floor, status, note);
			int result = roomDAO.update(room);
			
			if(result > 0) {
				JOptionPane.showMessageDialog(roomView, "Chỉnh sửa thành công!");
				roomView.updateTable();
				mainView.updateRoom();
				
			}else {
				JOptionPane.showMessageDialog(roomView, "Chỉnh sửa không thành công!");
			}
			
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(roomView, "Dữ liệu không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			
		}
	}
	public void delete() {
		try {
			String rId = roomView.getTextRoom().getText();
			
			if (rId.isEmpty()) {
	            JOptionPane.showMessageDialog(roomView, "Vui lòng nhập mã phòng để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	            return;
	        }
			int confirm = JOptionPane.showConfirmDialog(roomView, "Bạn có chắc chắn xóa phòng này không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
			if (confirm != JOptionPane.YES_OPTION) {
				return;
			}
			
			Room room = new Room(rId);
			int result = roomDAO.delete(room);
			
			if (result >0) {
				JOptionPane.showMessageDialog(roomView, "Xóa phòng thành công!");
				roomView.updateTable();
				mainView.updateRoom();
			}else {
				JOptionPane.showMessageDialog(roomView, "Xóa phòng thất bại! Mã phòng không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(roomView, "Đã xảy ra lỗi khi xóa phòng.", "Lỗi", JOptionPane.ERROR_MESSAGE);

		}
	}
	
	
}
