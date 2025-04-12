package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.RoomDAO;
import model.Room;

import java.util.ArrayList;
import java.util.List;


import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

import javax.swing.JScrollPane;
import java.awt.Label;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Room room = new Room();
	private JPanel centerPanel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		leftPanel.setBackground(new Color(0, 128, 255));
		leftPanel.setBounds(0, 0, 202, 602);
		contentPane.add(leftPanel);
		leftPanel.setLayout(null);
		
		JLabel lblRoom = new JLabel("Quản lý phòng");
		lblRoom.setBounds(0, 235, 202, 37);
		lblRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoom.setFont(new Font("Arial", Font.BOLD, 16));
		lblRoom.setForeground(new Color(255, 255, 255));
		leftPanel.add(lblRoom);
		
		JLabel lblCustomer = new JLabel("Quản lý khách hàng");
		lblCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomer.setForeground(Color.WHITE);
		lblCustomer.setFont(new Font("Arial", Font.BOLD, 16));
		lblCustomer.setBounds(0, 293, 202, 37);
		leftPanel.add(lblCustomer);
		
		JLabel lblThanhTon = new JLabel("Thanh toán");
		lblThanhTon.setHorizontalAlignment(SwingConstants.CENTER);
		lblThanhTon.setForeground(Color.WHITE);
		lblThanhTon.setFont(new Font("Arial", Font.BOLD, 16));
		lblThanhTon.setBounds(0, 356, 202, 37);
		leftPanel.add(lblThanhTon);
		
		JLabel lbltPhng = new JLabel("Đặt phòng");
		lbltPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lbltPhng.setForeground(Color.WHITE);
		lbltPhng.setFont(new Font("Arial", Font.BOLD, 16));
		lbltPhng.setBounds(0, 411, 202, 37);
		leftPanel.add(lbltPhng);
		
		JLabel lblngXut = new JLabel("Đăng xuất");
		lblngXut.setHorizontalAlignment(SwingConstants.CENTER);
		lblngXut.setForeground(Color.WHITE);
		lblngXut.setFont(new Font("Arial", Font.BOLD, 16));
		lblngXut.setBounds(0, 473, 202, 37);
		leftPanel.add(lblngXut);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(204, 64, 892, 538);
		contentPane.add(scrollPane);
		
		centerPanel = new JPanel();
		centerPanel.setBackground(new Color(255, 128, 128));
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
		
		JLabel lblNewLabel = new JLabel("Phòng trống");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(48, 23, 101, 32);
		headerPanel.add(lblNewLabel);
		
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
		
		JLabel lblBlue = new JLabel("Phòng đang được sửa chữa");
		lblBlue.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBlue.setBounds(401, 23, 194, 32);
		headerPanel.add(lblBlue);
		
		RoomDAO roomDAO = new RoomDAO();
		ArrayList<Room> rooms = roomDAO.selectAll();
		renderRooms(rooms);

		
	}
	
	private JPanel createRoomPanel(Room room) {
	    JPanel roomPanel = new JPanel();
	    roomPanel.setPreferredSize(new Dimension(140, 90));
	    roomPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	    roomPanel.setBackground(Color.GREEN);
	    roomPanel.setLayout(new BoxLayout(roomPanel, BoxLayout.Y_AXIS));

	    JLabel lblSoPhong = new JLabel("Phòng: " + room.getRoomNumber());
	    lblSoPhong.setAlignmentX(Component.CENTER_ALIGNMENT);
	    lblSoPhong.setForeground(Color.WHITE);
	    
	    JLabel lblLoai = new JLabel("Loại: " + room.getRoomType());
	    lblLoai.setAlignmentX(Component.CENTER_ALIGNMENT);
	    lblLoai.setForeground(Color.WHITE);

	    switch (room.getStatus()) {
        case "Có sẵn":
        	roomPanel.setBackground(new Color(0, 200, 102));
            break;
        case "Đã thuê":
        	roomPanel.setBackground(new Color(255, 51, 51));
            break;
        case "Đang bảo trì":
        	roomPanel.setBackground(new Color(0, 204, 204));
            break;
    }
	    
	    JLabel lblTinhTrang = new JLabel("Tình trạng: " + room.getStatus());
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
				listRoomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	            centerPanel.add(listRoomPanel);
			}
			JPanel roomPanel = createRoomPanel(room);
			listRoomPanel.add(roomPanel);
			
		}
		centerPanel.revalidate();
		centerPanel.repaint();
	}	
	
	
	
}
