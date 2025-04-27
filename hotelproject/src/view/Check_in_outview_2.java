package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Check_in_outview_2 {

	private JFrame frame;
	private JLabel lblThngTinKhch;
	private JTextField textnameguess;
	private JTextField textageguess;
	private JLabel lblTui;
	private JTextField textphoneguess;
	private JLabel lblSt;
	private JTextField textidguess;
	private JLabel lblCccd;
	private JLabel lblThngTinThanh;
	private JLabel lblTn_1;
	private JTextField textmoney;
	private JLabel lblTn_2;
	private JTextField textmoney_1;
	private JLabel lblTn_3;
	private JTextField textmoney_2;
	private JButton btncancel;
	private JButton btnQrCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check_in_outview_2 window = new Check_in_outview_2();
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
	public Check_in_outview_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 464, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblcheckout = new JLabel("Dịch Vụ Thanh Toán");
		lblcheckout.setBounds(10, 30, 429, 27);
		lblcheckout.setHorizontalAlignment(SwingConstants.CENTER);
		lblcheckout.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(lblcheckout);
		
		lblThngTinKhch = new JLabel("Thông Tin Khách Hàng");
		lblThngTinKhch.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngTinKhch.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThngTinKhch.setBounds(40, 67, 181, 27);
		frame.getContentPane().add(lblThngTinKhch);
		
		textnameguess = new JTextField();
		textnameguess.setBounds(112, 103, 253, 27);
		frame.getContentPane().add(textnameguess);
		textnameguess.setColumns(10);
		
		JLabel lblTn = new JLabel("Tên");
		lblTn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTn.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTn.setBounds(50, 101, 66, 27);
		frame.getContentPane().add(lblTn);
		
		textageguess = new JTextField();
		textageguess.setColumns(10);
		textageguess.setBounds(112, 142, 253, 27);
		frame.getContentPane().add(textageguess);
		
		lblTui = new JLabel("Tuổi");
		lblTui.setHorizontalAlignment(SwingConstants.CENTER);
		lblTui.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTui.setBounds(50, 140, 66, 27);
		frame.getContentPane().add(lblTui);
		
		textphoneguess = new JTextField();
		textphoneguess.setColumns(10);
		textphoneguess.setBounds(112, 180, 253, 27);
		frame.getContentPane().add(textphoneguess);
		
		lblSt = new JLabel("SĐT");
		lblSt.setHorizontalAlignment(SwingConstants.CENTER);
		lblSt.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSt.setBounds(50, 178, 66, 27);
		frame.getContentPane().add(lblSt);
		
		textidguess = new JTextField();
		textidguess.setColumns(10);
		textidguess.setBounds(112, 220, 253, 27);
		frame.getContentPane().add(textidguess);
		
		lblCccd = new JLabel("CCCD");
		lblCccd.setHorizontalAlignment(SwingConstants.CENTER);
		lblCccd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCccd.setBounds(50, 218, 66, 27);
		frame.getContentPane().add(lblCccd);
		
		lblThngTinThanh = new JLabel("Thông Tin Thanh Toán");
		lblThngTinThanh.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngTinThanh.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThngTinThanh.setBounds(40, 292, 181, 27);
		frame.getContentPane().add(lblThngTinThanh);
		
		lblTn_1 = new JLabel("Thành Tiền");
		lblTn_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTn_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTn_1.setBounds(50, 329, 98, 27);
		frame.getContentPane().add(lblTn_1);
		
		textmoney = new JTextField();
		textmoney.setColumns(10);
		textmoney.setBounds(158, 331, 207, 27);
		frame.getContentPane().add(textmoney);
		
		lblTn_2 = new JLabel("Khách Đưa");
		lblTn_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTn_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTn_2.setBounds(50, 366, 98, 27);
		frame.getContentPane().add(lblTn_2);
		
		textmoney_1 = new JTextField();
		textmoney_1.setColumns(10);
		textmoney_1.setBounds(158, 368, 207, 27);
		frame.getContentPane().add(textmoney_1);
		
		lblTn_3 = new JLabel("Thối Lại");
		lblTn_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTn_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTn_3.setBounds(40, 403, 98, 27);
		frame.getContentPane().add(lblTn_3);
		
		textmoney_2 = new JTextField();
		textmoney_2.setColumns(10);
		textmoney_2.setBounds(158, 405, 207, 27);
		frame.getContentPane().add(textmoney_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 271, 450, 2);
		frame.getContentPane().add(separator);
		
		JButton btntinh = new JButton("Tính");
		btntinh.setBounds(375, 371, 64, 21);
		frame.getContentPane().add(btntinh);
		
		JButton btnapply = new JButton("Xác Nhận");
		btnapply.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnapply.setBounds(112, 449, 116, 32);
		frame.getContentPane().add(btnapply);
		
		btncancel = new JButton("Hủy");
		btncancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btncancel.setBounds(238, 449, 116, 32);
		frame.getContentPane().add(btncancel);
		
		btnQrCode = new JButton("QR");
		btnQrCode.setBounds(375, 334, 64, 21);
		frame.getContentPane().add(btnQrCode);
	}
}
