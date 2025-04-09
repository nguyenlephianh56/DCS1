package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;

public class Quanlyphong {

	private JFrame frame;
	private JTextField textphong;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quanlyphong window = new Quanlyphong();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quanlyphong() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1059, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblquanlyphong = new JLabel("Quản Lý Phòng");
		lblquanlyphong.setHorizontalAlignment(SwingConstants.CENTER);
		lblquanlyphong.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblquanlyphong.setBounds(106, 26, 165, 33);
		frame.getContentPane().add(lblquanlyphong);
		
		JLabel lblphong = new JLabel("Phòng");
		lblphong.setHorizontalAlignment(SwingConstants.LEFT);
		lblphong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblphong.setBounds(10, 85, 56, 24);
		frame.getContentPane().add(lblphong);
		
		textphong = new JTextField();
		textphong.setBounds(119, 88, 259, 24);
		frame.getContentPane().add(textphong);
		textphong.setColumns(10);
		
		JComboBox boxtang = new JComboBox();
		boxtang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxtang.setModel(new DefaultComboBoxModel(new String[] {"Tầng 1", "Tầng 2", "Tầng 3"}));
		boxtang.setBounds(118, 122, 260, 24);
		frame.getContentPane().add(boxtang);
		
		JLabel lbltang = new JLabel("Tầng");
		lbltang.setHorizontalAlignment(SwingConstants.LEFT);
		lbltang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbltang.setBounds(10, 119, 56, 24);
		frame.getContentPane().add(lbltang);
		
		JLabel lblloaiphong = new JLabel("Loại Phòng");
		lblloaiphong.setHorizontalAlignment(SwingConstants.LEFT);
		lblloaiphong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblloaiphong.setBounds(10, 156, 86, 24);
		frame.getContentPane().add(lblloaiphong);
		
		JComboBox boxloaiphong = new JComboBox();
		boxloaiphong.setModel(new DefaultComboBoxModel(new String[] {"Thường", "VIP", "Super VIP", "Tổng Thống"}));
		boxloaiphong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxloaiphong.setBounds(118, 159, 260, 24);
		frame.getContentPane().add(boxloaiphong);
		
		JLabel lbltrangthai = new JLabel("Trạng Thái");
		lbltrangthai.setHorizontalAlignment(SwingConstants.LEFT);
		lbltrangthai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbltrangthai.setBounds(10, 190, 86, 24);
		frame.getContentPane().add(lbltrangthai);
		
		JComboBox boxtrangthai = new JComboBox();
		boxtrangthai.setModel(new DefaultComboBoxModel(new String[] {"Trống", "Đang Dọn Dẹp", "Đã Được Đặt Trước", "Đang Sử Dụng"}));
		boxtrangthai.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxtrangthai.setBounds(118, 193, 260, 24);
		frame.getContentPane().add(boxtrangthai);
		
		JLabel lblnote = new JLabel("Ghi Chú");
		lblnote.setHorizontalAlignment(SwingConstants.LEFT);
		lblnote.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblnote.setBounds(10, 224, 86, 24);
		frame.getContentPane().add(lblnote);
		
		 Border border = BorderFactory.createLineBorder(Color.BLACK, 1); // Màu xám, độ dày 2px
		JTextArea textghichu = new JTextArea();
		textghichu.setBorder(new LineBorder(new Color(192, 192, 192)));
		textghichu.setBackground(new Color(255, 255, 255));
		textghichu.setForeground(new Color(0, 0, 0));
		textghichu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textghichu.setBounds(119, 227, 259, 200);
		frame.getContentPane().add(textghichu);
		
		JPanel panel = new JPanel();
		panel.setBounds(174, 437, 204, 69);
		frame.getContentPane().add(panel);
		
		JButton btnthem = new JButton("Thêm");
		btnthem.setBounds(10, 10, 85, 21);
		
		JButton btnsua = new JButton("Sửa");
		btnsua.setBounds(105, 10, 85, 21);
		
		JButton btnlammoi = new JButton("Làm mới");
		btnlammoi.setBounds(105, 41, 85, 21);
		panel.setLayout(null);
		panel.add(btnthem);
		panel.add(btnsua);
		
		JButton btnxoa = new JButton("Xóa");
		btnxoa.setBounds(10, 41, 85, 21);
		panel.add(btnxoa);
		panel.add(btnlammoi);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ph\u00F2ng", "Lo\u1EA1i Ph\u00F2ng", "Tr\u1EA1ng Th\u00E1i", "Ghi Ch\u00FA"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(412, 119, 603, 387);
		frame.getContentPane().add(scrollPane);
		
		JComboBox boxtang_1 = new JComboBox();
		boxtang_1.setModel(new DefaultComboBoxModel(new String[] {"Tầng 1", "Tầng 2", "Tầng 3"}));
		boxtang_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxtang_1.setBounds(882, 85, 133, 24);
		frame.getContentPane().add(boxtang_1);
	}
}
