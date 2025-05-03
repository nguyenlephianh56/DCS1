package view;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.JTable;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.RoomListenner;
import dao.RoomDAO;
import model.Room;

public class RoomView extends JFrame{

	private JFrame frame;
	
	private JTable table;
	private DefaultTableModel tableModel;
	private JTextField textRoom;
	
	private JComboBox boxFloor;
	private JComboBox boxRoomType;
	private JComboBox boxStatus;
	private JTextArea textNote;

	private RoomDAO roomDao;
	private MainView mainView;	


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RoomView window = new RoomView();
////					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	/**
	 * Create the application.
	 */
	public RoomView(MainView mainView, RoomDAO roomDao) {
	    this.mainView = mainView;
	    this.roomDao = roomDao;
	    initialize();
	}

	// Sửa constructor mặc định
	public RoomView() {
	    this.mainView = null;
	    this.roomDao = new RoomDAO();
	    initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void showWindow() {
	    frame.setVisible(true);
	    
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1059, 572);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		JLabel lblRoomManagement = new JLabel("Quản Lý Phòng");
		lblRoomManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoomManagement.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoomManagement.setBounds(106, 26, 165, 33);
		frame.getContentPane().add(lblRoomManagement);
		
		JLabel lblRoom = new JLabel("Phòng");
		lblRoom.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRoom.setBounds(10, 85, 56, 24);
		frame.getContentPane().add(lblRoom);
		
		textRoom = new JTextField();
		textRoom.setBounds(119, 88, 259, 24);
		frame.getContentPane().add(textRoom);
		textRoom.setColumns(10);
		
		boxFloor = new JComboBox();
		boxFloor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxFloor.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		boxFloor.setBounds(118, 122, 260, 24);
		frame.getContentPane().add(boxFloor);
		
		JLabel lblFloor = new JLabel("Tầng");
		lblFloor.setHorizontalAlignment(SwingConstants.LEFT);
		lblFloor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFloor.setBounds(10, 119, 56, 24);
		frame.getContentPane().add(lblFloor);
		
		JLabel lblRoomType = new JLabel("Loại Phòng");
		lblRoomType.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRoomType.setBounds(10, 156, 86, 24);
		frame.getContentPane().add(lblRoomType);
		
		boxRoomType = new JComboBox();
		boxRoomType.setModel(new DefaultComboBoxModel(new String[] {"Thường", "VIP", "Super VIP", "Tổng Thống"}));
		boxRoomType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxRoomType.setBounds(118, 159, 260, 24);
		frame.getContentPane().add(boxRoomType);
		
		JLabel lblStatus = new JLabel("Trạng Thái");
		lblStatus.setHorizontalAlignment(SwingConstants.LEFT);
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStatus.setBounds(10, 190, 86, 24);
		frame.getContentPane().add(lblStatus);
		
		boxStatus = new JComboBox();
		boxStatus.setModel(new DefaultComboBoxModel(new String[] {"Đang trống", "Đang dọn dẹp", "Đang sử dụng"}));
		boxStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxStatus.setBounds(118, 193, 260, 24);
		frame.getContentPane().add(boxStatus);
		
		JLabel lblNote = new JLabel("Ghi Chú");
		lblNote.setHorizontalAlignment(SwingConstants.LEFT);
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNote.setBounds(10, 224, 86, 24);
		frame.getContentPane().add(lblNote);
		
		textNote = new JTextArea();
		textNote.setBorder(new LineBorder(new Color(192, 192, 192)));
		textNote.setBackground(new Color(255, 255, 255));
		textNote.setForeground(new Color(0, 0, 0));
		textNote.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textNote.setBounds(119, 227, 259, 200);
		frame.getContentPane().add(textNote);
		
		//Gán hành động
		RoomListenner action = new RoomListenner(this, roomDao, mainView);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(174, 437, 204, 69);
		frame.getContentPane().add(panel);
		
		JButton btnAdd= new JButton("Thêm");
		btnAdd.setBounds(10, 10, 85, 21);
		btnAdd.addActionListener(action);
		
		JButton btnEdit = new JButton("Sửa");
		btnEdit.setBounds(105, 10, 85, 21);
		btnEdit.addActionListener(action);
		
		
		JButton btnRefresh  = new JButton("Làm mới");
		btnRefresh.setBounds(105, 41, 85, 21);
		btnRefresh.addActionListener(action);
		
		panel.setLayout(null);
		panel.add(btnAdd);
		panel.add(btnEdit);
		
		JButton btnDelete = new JButton("Xóa");
		btnDelete.setBounds(10, 41, 85, 21);
		btnDelete.addActionListener(action);
		
		panel.add(btnDelete);
		panel.add(btnRefresh);
		
		JComboBox boxFloor_1 = new JComboBox();
		boxFloor_1.setModel(new DefaultComboBoxModel(new String[] {"Tầng 1", "Tầng 2", "Tầng 3"}));
		boxFloor_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxFloor_1.setBounds(882, 85, 133, 24);
		frame.getContentPane().add(boxFloor_1);
		
		//Tạo bảng 
		String infoTable[] = {"Số phòng", "Loại phòng", "Tầng","Trạng thái", "Ghi chú"};
		tableModel = new DefaultTableModel(infoTable, 0);
		table = new JTable(tableModel);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 15));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(412, 119, 603, 387);
		frame.getContentPane().add(scrollPane);
		
		updateTable();
		
	}
	
	
	//Hàm cập nhật dữ liệu từ database vào table
	public void updateTable() {
		tableModel.setRowCount(0);
		
		ArrayList<Room> rooms = RoomDAO.getInstance().selectAll();
		for (Room room : rooms) {
			Object[] rowData = {room.getrID(), room.getRoomType(), room.getFloor(), room.getStatus(), room.getNote()};
			tableModel.addRow(rowData);
		}
		
	}
	public JTable getTable() {
		return table;
	}
	public void setTable(JTable table) {
		this.table = table;
	}
	public DefaultTableModel getTableModel() {
		return tableModel;
	}
	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}
	public JTextField getTextRoom() {
		return textRoom;
	}
	public void setTextRoom(JTextField textRoom) {
		this.textRoom = textRoom;
	}
	public JComboBox getBoxFloor() {
		return boxFloor;
	}
	public void setBoxFloor(JComboBox boxFloor) {
		this.boxFloor = boxFloor;
	}
	public JComboBox getBoxRoomType() {
		return boxRoomType;
	}
	public void setBoxRoomType(JComboBox boxRoomType) {
		this.boxRoomType = boxRoomType;
	}
	public JComboBox getBoxStatus() {
		return boxStatus;
	}
	public void setBoxStatus(JComboBox boxStatus) {
		this.boxStatus = boxStatus;
	}
	public JTextArea getTextNote() {
		return textNote;
	}
	public void setTextNote(JTextArea textNote) {
		this.textNote = textNote;
	}
	
	
}