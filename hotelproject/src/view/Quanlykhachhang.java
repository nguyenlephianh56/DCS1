package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

public class Quanlykhachhang {

	private JFrame frame;
	private JTable table;
	private JTextField textfind;
	private JTextField textName;
	private JTextField textgender;
	private JTextField textPhone;
	private JTextField textCCCD;
	private JTextField textRoomrent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quanlykhachhang window = new Quanlykhachhang();
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
	public Quanlykhachhang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 578, 696);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbltitle = new JLabel("Quản Lý Thông Tin Khách Hàng");
		lbltitle.setForeground(new Color(0, 0, 0));
		lbltitle.setBackground(new Color(0, 0, 0));
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltitle.setBounds(85, 10, 370, 64);
		frame.getContentPane().add(lbltitle);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00EAn","Phòng", "Gi\u1EDBi t\u00EDnh", "S\u0110T", "CCCD", "B\u1EAFt \u0111\u1EA7u thu\u00EA", "D\u1EF1 ki\u1EBFn tr\u1EA3"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(24, 135, 509, 340);
		frame.getContentPane().add(scrollPane);
		
		textfind = new JTextField();
		textfind.setBounds(131, 84, 295, 24);
		frame.getContentPane().add(textfind);
		textfind.setColumns(10);
		
		JButton btnfind = new JButton("Tìm Kiếm");
		btnfind.setBackground(new Color(208, 255, 255));
		btnfind.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnfind.setBounds(436, 85, 97, 21);
		frame.getContentPane().add(btnfind);
		
		JComboBox comboBoxcondition = new JComboBox();
		comboBoxcondition.setModel(new DefaultComboBoxModel(new String[] {"Tên", "Phòng", "Giới Tính", "SĐT", "CCCD", "Bắt Đầu Thuê", "Dự Kiến Trả"}));
		comboBoxcondition.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBoxcondition.setBounds(24, 85, 97, 21);
		frame.getContentPane().add(comboBoxcondition);
		
		JLabel lblNewLabel = new JLabel("Tên\r\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(34, 485, 48, 21);
		frame.getContentPane().add(lblNewLabel);
		
		textName = new JTextField();
		textName.setBounds(145, 487, 118, 19);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textgender = new JTextField();
		textgender.setColumns(10);
		textgender.setBounds(386, 487, 118, 19);
		frame.getContentPane().add(textgender);
		
		JLabel lblGiiTnh = new JLabel("Giới Tính");
		lblGiiTnh.setForeground(new Color(0, 0, 0));
		lblGiiTnh.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiiTnh.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGiiTnh.setBounds(284, 485, 74, 21);
		frame.getContentPane().add(lblGiiTnh);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(145, 518, 118, 19);
		frame.getContentPane().add(textPhone);
		
		JLabel lblSt_1 = new JLabel("SĐT");
		lblSt_1.setForeground(new Color(0, 0, 0));
		lblSt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSt_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSt_1.setBounds(34, 516, 48, 21);
		frame.getContentPane().add(lblSt_1);
		
		textCCCD = new JTextField();
		textCCCD.setColumns(10);
		textCCCD.setBounds(386, 518, 118, 19);
		frame.getContentPane().add(textCCCD);
		
		JLabel lblSt = new JLabel("CCCD");
		lblSt.setForeground(new Color(0, 0, 0));
		lblSt.setHorizontalAlignment(SwingConstants.CENTER);
		lblSt.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSt.setBounds(278, 516, 64, 21);
		frame.getContentPane().add(lblSt);
		
		JLabel lblBtuThu = new JLabel("Bắt Đầu Thuê");
		lblBtuThu.setForeground(new Color(0, 0, 0));
		lblBtuThu.setHorizontalAlignment(SwingConstants.CENTER);
		lblBtuThu.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBtuThu.setBounds(44, 547, 89, 21);
		frame.getContentPane().add(lblBtuThu);
		
		JLabel lblNewLabel_5 = new JLabel("Dự Kiến Trả");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(284, 547, 92, 21);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblPhng = new JLabel("Phòng");
		lblPhng.setForeground(new Color(0, 0, 0));
		lblPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhng.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPhng.setBounds(34, 578, 59, 21);
		frame.getContentPane().add(lblPhng);
		
		textRoomrent = new JTextField();
		textRoomrent.setColumns(10);
		textRoomrent.setBounds(145, 580, 118, 19);
		frame.getContentPane().add(textRoomrent);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(284, 578, 220, 64);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnadd = new JButton("Thêm");
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnadd.setBounds(0, 10, 84, 21);
		btnadd.setForeground(new Color(0, 0, 0));
		btnadd.setBackground(new Color(208, 255, 255));
		panel.add(btnadd);
		
		JButton btnedit = new JButton("Sửa");
		btnedit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnedit.setBounds(94, 10, 84, 21);
		btnedit.setBackground(new Color(208, 255, 255));
		panel.add(btnedit);
		
		JButton btndelete = new JButton("Xóa");
		btndelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btndelete.setBounds(0, 41, 84, 21);
		btndelete.setBackground(new Color(208, 255, 255));
		panel.add(btndelete);
		
		JButton btnRefresh = new JButton("Tải lại");
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRefresh.setBounds(94, 41, 84, 21);
		btnRefresh.setBackground(new Color(208, 255, 255));
		panel.add(btnRefresh);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(145, 549, 118, 19);
		frame.getContentPane().add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(386, 549, 118, 19);
		frame.getContentPane().add(dateChooser_1);
	}
}
