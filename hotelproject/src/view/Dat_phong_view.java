package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class Dat_phong_view {

	private JFrame frame;
	private JTextField textname;
	private JTextField textage;
	private JTextField textphone;
	private JTextField textid;
	private JTextField textroomtype;
	private JTextField texttrangthai;
	private JTextField textfloor;
	private JTextField textroom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dat_phong_view window = new Dat_phong_view();
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
	public Dat_phong_view() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 459, 661);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblchu = new JLabel("Dịch Vụ Đặt Phòng");
		lblchu.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblchu.setBounds(36, 22, 251, 52);
		frame.getContentPane().add(lblchu);
		
		JLabel lblThngTinKhch = new JLabel("Thông Tin Khách Hàng");
		lblThngTinKhch.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngTinKhch.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThngTinKhch.setBounds(46, 84, 181, 27);
		frame.getContentPane().add(lblThngTinKhch);
		
		JLabel lblTn = new JLabel("Tên");
		lblTn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTn.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTn.setBounds(56, 118, 66, 27);
		frame.getContentPane().add(lblTn);
		
		textname = new JTextField();
		textname.setColumns(10);
		textname.setBounds(118, 120, 253, 27);
		frame.getContentPane().add(textname);
		
		textage = new JTextField();
		textage.setColumns(10);
		textage.setBounds(118, 159, 253, 27);
		frame.getContentPane().add(textage);
		
		JLabel lblTui = new JLabel("Tuổi");
		lblTui.setHorizontalAlignment(SwingConstants.CENTER);
		lblTui.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTui.setBounds(56, 157, 66, 27);
		frame.getContentPane().add(lblTui);
		
		JLabel lblSt = new JLabel("SĐT");
		lblSt.setHorizontalAlignment(SwingConstants.CENTER);
		lblSt.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSt.setBounds(56, 195, 66, 27);
		frame.getContentPane().add(lblSt);
		
		textphone = new JTextField();
		textphone.setColumns(10);
		textphone.setBounds(118, 197, 253, 27);
		frame.getContentPane().add(textphone);
		
		textid = new JTextField();
		textid.setColumns(10);
		textid.setBounds(118, 237, 253, 27);
		frame.getContentPane().add(textid);
		
		JLabel lblCccd = new JLabel("CCCD");
		lblCccd.setHorizontalAlignment(SwingConstants.CENTER);
		lblCccd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCccd.setBounds(56, 235, 66, 27);
		frame.getContentPane().add(lblCccd);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 284, 484, 2);
		frame.getContentPane().add(separator);
		
		textroomtype = new JTextField();
		textroomtype.setColumns(10);
		textroomtype.setBounds(118, 409, 253, 27);
		frame.getContentPane().add(textroomtype);
		
		texttrangthai = new JTextField();
		texttrangthai.setColumns(10);
		texttrangthai.setBounds(118, 449, 253, 27);
		frame.getContentPane().add(texttrangthai);
		
		JLabel lblCccd_1 = new JLabel("Trạng Thái");
		lblCccd_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCccd_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCccd_1.setBounds(36, 447, 86, 27);
		frame.getContentPane().add(lblCccd_1);
		
		JLabel lblSt_1 = new JLabel("Loại");
		lblSt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSt_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSt_1.setBounds(56, 407, 66, 27);
		frame.getContentPane().add(lblSt_1);
		
		JLabel lblTng = new JLabel("Tầng");
		lblTng.setHorizontalAlignment(SwingConstants.CENTER);
		lblTng.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTng.setBounds(56, 369, 66, 27);
		frame.getContentPane().add(lblTng);
		
		textfloor = new JTextField();
		textfloor.setColumns(10);
		textfloor.setBounds(118, 371, 253, 27);
		frame.getContentPane().add(textfloor);
		
		textroom = new JTextField();
		textroom.setColumns(10);
		textroom.setBounds(118, 332, 253, 27);
		frame.getContentPane().add(textroom);
		
		JLabel lblPhng = new JLabel("Phòng");
		lblPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhng.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhng.setBounds(56, 330, 66, 27);
		frame.getContentPane().add(lblPhng);
		
		JLabel lblThngTinPhng = new JLabel("Thông Tin Phòng Đặt");
		lblThngTinPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngTinPhng.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThngTinPhng.setBounds(46, 296, 181, 27);
		frame.getContentPane().add(lblThngTinPhng);
		
		JLabel lblCccd_1_1 = new JLabel("Ngày Đặt");
		lblCccd_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCccd_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCccd_1_1.setBounds(36, 486, 86, 27);
		frame.getContentPane().add(lblCccd_1_1);
		
		JLabel lblCccd_1_2 = new JLabel("Ngày Trả");
		lblCccd_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCccd_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCccd_1_2.setBounds(36, 523, 86, 27);
		frame.getContentPane().add(lblCccd_1_2);
		
		JDateChooser datedat = new JDateChooser();
		datedat.setBounds(118, 486, 253, 27);
		frame.getContentPane().add(datedat);
		
		JDateChooser datetra = new JDateChooser();
		datetra.setBounds(118, 523, 253, 27);
		frame.getContentPane().add(datetra);
		
		JButton btncancel = new JButton("Hủy");
		btncancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btncancel.setBounds(244, 566, 116, 32);
		frame.getContentPane().add(btncancel);
		
		JButton btnapply = new JButton("Xác Nhận");
		btnapply.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnapply.setBounds(118, 566, 116, 32);
		frame.getContentPane().add(btnapply);
	}
}
