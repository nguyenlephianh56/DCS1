package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JDateChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import com.k33ptoo.components.KButton;
import java.awt.Color;

public class Check_in_outview {

	private JFrame frame;
	private JTextField textfindname;
	private JTable table;
	private JLabel lblTnKhchHng;
	private JTextField textName;
	private JTextField textnoRoom;
	private JLabel lblPhngS;
	private JButton btnthanhtoan;
	private JTable table_1;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check_in_outview window = new Check_in_outview();
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
	public Check_in_outview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 963, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblcheckout = new JLabel("Dịch Vụ Thanh Toán");
		lblcheckout.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblcheckout.setHorizontalAlignment(SwingConstants.CENTER);
		lblcheckout.setBounds(26, 27, 253, 74);
		frame.getContentPane().add(lblcheckout);
		
		JLabel lblNewLabel = new JLabel("Tên");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(481, 69, 51, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textfindname = new JTextField();
		textfindname.setFont(new Font("Patrick Hand", Font.PLAIN, 16));
		textfindname.setBounds(481, 94, 266, 26);
		frame.getContentPane().add(textfindname);
		textfindname.setColumns(10);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"H\u1ECD v\u00E0 T\u00EAn", "S\u0110T", "CCCD", "S\u1ED1 Ph\u00F2ng", "T\u1EA7ng", "Lo\u1EA1i Ph\u00F2ng", "S\u1ED1 Gi\u1EDD", "Th\u00E0nh Ti\u1EC1n"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(103);
		table.getColumnModel().getColumn(2).setPreferredWidth(81);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setBounds(26, 136, 895, 261);
		
		lblTnKhchHng = new JLabel("Tên Khách Hàng");
		lblTnKhchHng.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTnKhchHng.setBounds(41, 407, 124, 26);
		frame.getContentPane().add(lblTnKhchHng);
		
		textName = new JTextField();
		textName.setToolTipText("");
		textName.setHorizontalAlignment(SwingConstants.LEFT);
		textName.setFont(new Font("Patrick Hand", Font.BOLD, 20));
		textName.setBounds(41, 436, 282, 37);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textnoRoom = new JTextField();
		textnoRoom.setHorizontalAlignment(SwingConstants.LEFT);
		textnoRoom.setFont(new Font("Patrick Hand", Font.BOLD, 20));
		textnoRoom.setColumns(10);
		textnoRoom.setBounds(339, 436, 146, 37);
		frame.getContentPane().add(textnoRoom);
		
		lblPhngS = new JLabel("Phòng Số");
		lblPhngS.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhngS.setBounds(339, 407, 124, 26);
		frame.getContentPane().add(lblPhngS);
		
		JButton btnfind = new JButton("Tìm");
		btnfind.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnfind.setBounds(788, 94, 96, 23);
		frame.getContentPane().add(btnfind);
		
		btnthanhtoan = new JButton("Thanh Toán");
		btnthanhtoan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnthanhtoan.setBounds(759, 438, 124, 34);
		frame.getContentPane().add(btnthanhtoan);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(510, 435, 185, 38);
		frame.getContentPane().add(dateChooser);
		
		JLabel lnlngaytraphong = new JLabel("Ngày Trả Phòng");
		lnlngaytraphong.setFont(new Font("Tahoma", Font.BOLD, 15));
		lnlngaytraphong.setBounds(510, 407, 124, 26);
		frame.getContentPane().add(lnlngaytraphong);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "H\u1ECD v\u00E0 T\u00EAn", "S\u0110T", "CCCD", "S\u1ED1 Ph\u00F2ng", "T\u1EA7ng", "S\u1ED1 Gi\u1EDD", "Th\u00E0nh Ti\u1EC1n"
			}
		));
		
		scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(41, 141, 870, 265);
		frame.getContentPane().add(scrollPane);
	}
}
