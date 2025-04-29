package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import controller.LabelMouseHandler;
import dao.RoomDAO;
import model.Room;

import java.util.ArrayList;
import java.util.List;


import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

import javax.swing.JScrollPane;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Room room = new Room();
	private JPanel centerPanel;
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					//Hiển thị giao diện giống hệ điều hành đang dùng
//					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//					MainView frame = new MainView();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	/**
	 * Create the frame.
	 */
	public MainView() {
		setTitle("Quản lý khách sạn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(centerPanel);
		setBounds(100, 100, 1105, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(234, 234, 234));
		leftPanel.setBounds(0, 0, 204, 602);
		contentPane.add(leftPanel);
		leftPanel.setLayout(null);
		
																																																														
		
		JLabel lblRoom = new JLabel("Phòng");
		lblRoom.setIcon(loadAndResize("/images/room.png", 40, 40));
		
		lblRoom.setBounds(0, 235, 202, 37);
		lblRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoom.setFont(new Font("Arial", Font.BOLD, 16));
		lblRoom.setForeground(new Color(0, 0, 0));
		leftPanel.add(lblRoom);
		
		JLabel lblBooking = new JLabel("Đặt phòng");
		lblBooking.setIcon(loadAndResize("/images/bookingg.png", 40, 40));
		lblBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblBooking.setForeground(new Color(0, 0, 0));
		lblBooking.setFont(new Font("Arial", Font.BOLD, 16));
		lblBooking.setBounds(0, 285, 202, 37);
		leftPanel.add(lblBooking);
		
		JLabel lblCustomer = new JLabel("Khách hàng");
		
		lblCustomer.setIcon(loadAndResize("/images/customer.png", 40, 40));
		lblCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomer.setForeground(new Color(0, 0, 0));
		lblCustomer.setFont(new Font("Arial", Font.BOLD, 16));
		lblCustomer.setBounds(0, 341, 202, 37);
		leftPanel.add(lblCustomer);
		
		JLabel lblPayment = new JLabel("Thanh toán");
		lblPayment.setIcon(loadAndResize("/images/payment.png", 40, 40));
		lblPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayment.setForeground(new Color(0, 0, 0));
		lblPayment.setFont(new Font("Arial", Font.BOLD, 16));
		lblPayment.setBounds(0, 388, 202, 37);
		leftPanel.add(lblPayment);
		
		
		
		JLabel lblExit = new JLabel("Đăng xuất");
		//thêm icon vào
		lblExit.setIcon(loadAndResize("/images/exit.png", 42, 42));
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(new Color(0, 0, 0));
		lblExit.setFont(new Font("Arial", Font.BOLD, 16));
		lblExit.setBounds(0, 435, 202, 37);
		leftPanel.add(lblExit);	
		

		//thêm logo
        JLabel label = new JLabel(loadAndResize("/images/K&A_logo.png", 150, 150));
        label.setBounds(26, 35, 150, 150);
        leftPanel.add(label);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(204, 64, 892, 538);
		contentPane.add(scrollPane);
		
		centerPanel = new JPanel();
		centerPanel.setBackground(new Color(236, 134, 134));
		scrollPane.setViewportView(centerPanel);
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBounds(204, 0, 892, 65);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		
		Label labelGreen = new Label("");
		labelGreen.setBounds(10, 23, 32, 32);
		labelGreen.setBackground(new Color(0, 200, 102));
		headerPanel.add(labelGreen);
		
		JLabel lblGreen = new JLabel("Phòng trống");
		lblGreen.setFont(new Font("Arial", Font.PLAIN, 14));
		lblGreen.setBounds(48, 23, 101, 32);
		headerPanel.add(lblGreen);
		
		JLabel lblRed = new JLabel("Phòng đã được đặt");
		lblRed.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRed.setBounds(210, 23, 143, 32);
		headerPanel.add(lblRed);
		
		Label labelRed = new Label("");
		labelRed.setBackground(new Color(255, 51, 51));
		labelRed.setBounds(172, 23, 32, 32);
		
		headerPanel.add(labelRed);
		
		Label labelBlue = new Label("");
		labelBlue.setBackground(new Color(0, 204, 204));
		labelBlue.setBounds(363, 23, 32, 32);
		headerPanel.add(labelBlue);
		
		JLabel lblBlue = new JLabel("Phòng đang được dọn dẹp");
		lblBlue.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBlue.setBounds(401, 23, 194, 32);
		headerPanel.add(lblBlue);
		
		
		//Gắn hành động cho các label
		lblRoom.addMouseListener(new LabelMouseHandler(lblRoom, this, "room"));
		lblCustomer.addMouseListener(new LabelMouseHandler(lblCustomer, this, "customer"));
		lblPayment.addMouseListener(new LabelMouseHandler(lblPayment, this, "payment"));
		lblBooking.addMouseListener(new LabelMouseHandler(lblBooking, this, "booking"));
		lblExit.addMouseListener(new LabelMouseHandler(lblExit, this, "exit"));
		
		//cập nhật phòng
		updateRoom();

	}
	//Tạo panel phòng
	private JPanel createRoomPanel(Room room) {
	    JPanel roomPanel = new JPanel();
	    roomPanel.setPreferredSize(new Dimension(140, 90));
	    roomPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
	    roomPanel.setBackground(Color.GREEN);
	    roomPanel.setLayout(new BoxLayout(roomPanel, BoxLayout.Y_AXIS));

	    JLabel lblSoPhong = new JLabel("Phòng: " + room.getrID());
	    lblSoPhong.setFont(new Font("Arial", Font.PLAIN, 12));
	    lblSoPhong.setAlignmentX(Component.CENTER_ALIGNMENT);
	    lblSoPhong.setForeground(Color.WHITE);
	    
	    JLabel lblLoai = new JLabel("Loại: " + room.getRoomType());
	    lblLoai.setFont(new Font("Arial", Font.PLAIN, 12));
	    lblLoai.setAlignmentX(Component.CENTER_ALIGNMENT);
	    lblLoai.setForeground(Color.WHITE);

	    switch (room.getStatus()) {
        case "Đang trống":
        	roomPanel.setBackground(new Color(0, 200, 102));
            break;
        case "Đang sử dụng":
        	roomPanel.setBackground(new Color(255, 51, 51));
            break;
        case "Đang dọn dẹp":
        	roomPanel.setBackground(new Color(0, 204, 204));
            break;
    }
	    
	    JLabel lblTinhTrang = new JLabel("Tình trạng: " + room.getStatus());
	    lblTinhTrang.setFont(new Font("Arial", Font.PLAIN, 12));
	    lblTinhTrang.setAlignmentX(Component.CENTER_ALIGNMENT);
	    lblTinhTrang.setForeground(Color.WHITE);
	    

	    roomPanel.add(lblSoPhong);
	    roomPanel.add(lblLoai);
	    roomPanel.add(lblTinhTrang);

	    return roomPanel;
	}
	
	public void renderRooms(List<Room> rooms) {
		centerPanel.removeAll();
		
		int currentFloor = -1;
		JPanel listRoomPanel = null;
		
		for (Room room : rooms) {
			if (room.getFloor() != currentFloor) {
				currentFloor = room.getFloor();
				
				JLabel lblFloor = new JLabel("Tầng " + currentFloor);
				lblFloor.setFont(new Font("Arial", Font.BOLD, 16));
				centerPanel.add(lblFloor);
				
				listRoomPanel = new JPanel();
				listRoomPanel.setLayout(new GridLayout(0, 5, 5, 5));
	            centerPanel.add(listRoomPanel);
			}
			JPanel roomPanel = createRoomPanel(room);
			listRoomPanel.add(roomPanel);
			
		}
		centerPanel.revalidate();
		centerPanel.repaint();
	}	
	
	public void updateRoom() {
		RoomDAO roomDAO = new RoomDAO();
		ArrayList<Room> rooms = roomDAO.selectAll();
		renderRooms(rooms);
	}
	
	// chỉnh kích thước ảnh
	private ImageIcon loadAndResize(String path, int width, int height) {
	    ImageIcon icon = new ImageIcon(MainView.class.getResource(path));
	    Image scaledImg = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
	    return new ImageIcon(scaledImg);
	}
}
