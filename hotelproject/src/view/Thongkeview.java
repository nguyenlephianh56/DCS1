package View;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Component;
import com.toedter.calendar.JYearChooser;
import com.k33ptoo.App;
import com.k33ptoo.utils.ComponentMoverUtil;
import com.k33ptoo.components.KButton;
import javax.swing.JButton;

public class Thongkeview {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thongkeview window = new Thongkeview();
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
	public Thongkeview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1083, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblthongke = new JLabel("Thống Kê Doanh Thu");
		lblthongke.setBounds(10, 30, 438, 27);
		lblthongke.setHorizontalAlignment(SwingConstants.CENTER);
		lblthongke.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(lblthongke);

		JLabel lblNewLabel = new JLabel("Thống Kê Theo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(32, 74, 115, 27);
		frame.getContentPane().add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ngày", "Tháng", "Năm"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(157, 75, 91, 24);
		frame.getContentPane().add(comboBox);

		JPanel panel = new JPanel();
		panel.setBounds(32, 111, 1011, 507);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		// Các panel tương ứng với từng lựa chọn
		JPanel panelNgay = new JPanel();

		JPanel panelThang = new JPanel();
		panelThang.setLayout(null);

		JPanel panelNam = new JPanel();

		// Thêm các panel vào CardLayout
		panel.add(panelNgay, "ngày");
		panelNgay.setLayout(null);
		
		JScrollPane scrollPane_1_2 = new JScrollPane((Component) null);
		scrollPane_1_2.setBounds(0, 37, 1011, 402);
		panelNgay.add(scrollPane_1_2);
		
		JLabel lblChnNgy = new JLabel("Chọn ngày");
		lblChnNgy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChnNgy.setBounds(0, 0, 99, 27);
		panelNgay.add(lblChnNgy);
		
		JDateChooser Datechoosengay_1_2 = new JDateChooser();
		Datechoosengay_1_2.setBounds(109, 0, 143, 27);
		panelNgay.add(Datechoosengay_1_2);
		
		JButton btnNewButton_1 = new JButton("Tim");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(271, 6, 85, 21);
		panelNgay.add(btnNewButton_1);
		panel.add(panelThang, "tháng");
		
		JLabel lblChnThng = new JLabel("Chọn tháng");
		lblChnThng.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChnThng.setBounds(0, 0, 99, 27);
		panelThang.add(lblChnThng);
		
		JDateChooser Datechoosengay_1 = new JDateChooser();
		Datechoosengay_1.setBounds(109, 0, 141, 27);
		panelThang.add(Datechoosengay_1);
		
		JScrollPane scrollPane_1 = new JScrollPane((Component) null);
		scrollPane_1.setBounds(0, 37, 1011, 402);
		panelThang.add(scrollPane_1);
		
		JButton btnNewButton_2 = new JButton("Tim");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(274, 5, 85, 21);
		panelThang.add(btnNewButton_2);
		panel.add(panelNam, "năm");
		panelNam.setLayout(null);
		
		JScrollPane scrollPane_1_1 = new JScrollPane((Component) null);
		scrollPane_1_1.setBounds(0, 37, 1011, 460);
		panelNam.add(scrollPane_1_1);
		
		JLabel lblChnNm = new JLabel("Chọn năm");
		lblChnNm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChnNm.setBounds(0, 0, 99, 27);
		panelNam.add(lblChnNm);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(123, 0, 99, 27);
		panelNam.add(yearChooser);
		
		JButton btnNewButton = new JButton("Tim");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(242, 6, 85, 21);
		panelNam.add(btnNewButton);

		// Xử lý khi chọn trong ComboBox
		comboBox.addActionListener(e -> {
			String selected = comboBox.getSelectedItem().toString().toLowerCase();
			CardLayout cl = (CardLayout) (panel.getLayout());
			cl.show(panel, selected);
		});
	}
}