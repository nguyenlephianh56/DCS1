package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.CustomerListener;
import dao.CustomerDAO;
import dao.RoomDAO;
import model.Customer;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
//import com.toedter.calendar.JDateChooser;

public class CustomerView {

	private JFrame frame;
	private JTable table;
	private JTextField txtFind;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtCCCD;
	private JTextField txtAge;
	private JTextField txtCID;
	
	
	private CustomerDAO customerDAO = new CustomerDAO();
	private MainView mainView;
	private JRadioButton rdoMale;
	private JRadioButton rdoFemale;
	private JComboBox comboBoxcondition;	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					CustomerView window = new CustomerView();
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
	public void showWindow() {
	    frame.setVisible(true);
	    
	}
	
	public CustomerView(MainView mainView,CustomerDAO customerDAO) {
		super();
		this.customerDAO = customerDAO;
		this.mainView = mainView;
		initialize();
	}

	public CustomerView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 649, 696);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbltitle = new JLabel("Quản Lý Thông Tin Khách Hàng");
		lbltitle.setForeground(new Color(0, 0, 0));
		lbltitle.setBackground(new Color(0, 0, 0));
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltitle.setBounds(133, 10, 370, 64);
		frame.getContentPane().add(lbltitle);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã khách hàng","Tên", "Tuổi", "Giới tính", "SĐT", "CCCD"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(24, 135, 582, 340);
		frame.getContentPane().add(scrollPane);
		
		txtFind = new JTextField();
		txtFind.setBounds(160, 84, 308, 24);
		frame.getContentPane().add(txtFind);
		txtFind.setColumns(10);
		
		JButton btnfind = new JButton("Tìm Kiếm");
		btnfind.setBackground(new Color(208, 255, 255));
		btnfind.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnfind.setBounds(478, 84, 97, 21);
		frame.getContentPane().add(btnfind);
		
		comboBoxcondition = new JComboBox();
		comboBoxcondition.setModel(new DefaultComboBoxModel(new String[] {"Mã","Tên", "Tuổi", "Giới Tính", "SĐT", "CCCD"}));
		comboBoxcondition.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBoxcondition.setBounds(41, 85, 109, 21);
		frame.getContentPane().add(comboBoxcondition);
		
		
		JLabel lblName = new JLabel(" Tên khách hàng");
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(41, 516, 120, 21);
		frame.getContentPane().add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(171, 518, 142, 19);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel lblGender = new JLabel("Giới Tính");
		lblGender.setForeground(new Color(0, 0, 0));
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGender.setBounds(363, 484, 74, 21);
		frame.getContentPane().add(lblGender);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(444, 518, 142, 19);
		frame.getContentPane().add(txtPhone);
		
		JLabel lblPhone = new JLabel("SĐT");
		lblPhone.setForeground(new Color(0, 0, 0));
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPhone.setBounds(373, 516, 49, 21);
		frame.getContentPane().add(lblPhone);
		
		txtCCCD = new JTextField();
		txtCCCD.setColumns(10);
		txtCCCD.setBounds(444, 559, 142, 19);
		frame.getContentPane().add(txtCCCD);
		
		JLabel lblCCCD = new JLabel("CCCD");
		lblCCCD.setForeground(new Color(0, 0, 0));
		lblCCCD.setHorizontalAlignment(SwingConstants.CENTER);
		lblCCCD.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCCCD.setBounds(374, 557, 64, 21);
		frame.getContentPane().add(lblCCCD);
		
//		JLabel lblBtuThu = new JLabel("Bắt Đầu Thuê");
//		lblBtuThu.setForeground(new Color(0, 0, 0));
//		lblBtuThu.setHorizontalAlignment(SwingConstants.CENTER);
//		lblBtuThu.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblBtuThu.setBounds(44, 547, 89, 21);
//		frame.getContentPane().add(lblBtuThu);
//		
//		JLabel lblNewLabel_5 = new JLabel("Dự Kiến Trả");
//		lblNewLabel_5.setForeground(new Color(0, 0, 0));
//		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNewLabel_5.setBounds(284, 547, 92, 21);
//		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblAge = new JLabel("Tuổi");
		lblAge.setForeground(new Color(0, 0, 0));
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAge.setBounds(91, 557, 59, 21);
		frame.getContentPane().add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(171, 559, 142, 19);
		frame.getContentPane().add(txtAge);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(52, 599, 542, 50);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnedit = new JButton("Sửa");
		btnedit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnedit.setBounds(139, 10, 94, 21);
		btnedit.setBackground(new Color(208, 255, 255));
		panel.add(btnedit);
		
		JButton btnRefresh = new JButton("Làm mới");
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRefresh.setBounds(388, 10, 99, 21);
		btnRefresh.setBackground(new Color(208, 255, 255));
		panel.add(btnRefresh);
		
		JButton btndelete = new JButton("Xóa");
		btndelete.setBounds(261, 10, 99, 21);
		panel.add(btndelete);
		btndelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btndelete.setBackground(new Color(208, 255, 255));
		
		JButton btnadd = new JButton("Thêm");
		btnadd.setBounds(21, 10, 94, 21);
		panel.add(btnadd);
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnadd.setForeground(new Color(0, 0, 0));
		btnadd.setBackground(new Color(208, 255, 255));
		
		
		rdoMale = new JRadioButton("Nam");
		rdoMale.setBackground(new Color(128, 128, 128));
		rdoMale.setBounds(444, 485, 59, 21);
		frame.getContentPane().add(rdoMale);
		
		rdoFemale = new JRadioButton("Nữ");
		rdoFemale.setBackground(Color.GRAY);
		rdoFemale.setBounds(532, 485, 74, 21);
		frame.getContentPane().add(rdoFemale);
		
		ButtonGroup grGender = new ButtonGroup();
		grGender.add(rdoMale);
		grGender.add(rdoFemale);
		
		//THêm xử lý nút
		CustomerListener action = new CustomerListener(this, customerDAO);
		btnadd.addActionListener(action);
		btnRefresh.addActionListener(action);
		btnedit.addActionListener(action);
		btndelete.addActionListener(action);
		btnfind.addActionListener(action);

		JLabel lblCID = new JLabel("Mã khách hàng");
		lblCID.setHorizontalAlignment(SwingConstants.CENTER);
		lblCID.setForeground(Color.BLACK);
		lblCID.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCID.setBounds(42, 485, 119, 21);
		frame.getContentPane().add(lblCID);
		
		txtCID = new JTextField();
		txtCID.setColumns(10);
		txtCID.setBounds(171, 485, 142, 19);
		frame.getContentPane().add(txtCID);
		
		updateTable();

	}
	
	public void updateTable() {
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		tableModel.setRowCount(0);
		
		ArrayList<Customer> customers = customerDAO.selectAll();
		for (Customer customer : customers) {
			Object[] rowData = {customer.getcID(),
		            customer.getFullName(),
		            customer.getAge(),
		            customer.getGender(),
		            customer.getPhoneNumber(),
		            customer.getIdCard()};
			tableModel.addRow(rowData);
		}
		
	}
	public void updateTable(ArrayList<Customer> list) {
	    DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
	    tableModel.setRowCount(0);

	    for (Customer customer : list) {
	    	Object[] rowData = {customer.getcID(),
		            customer.getFullName(),
		            customer.getAge(),
		            customer.getGender(),
		            customer.getPhoneNumber(),
		            customer.getIdCard()};
	    	
			tableModel.addRow(rowData);
	    }
	}

	
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public JTable getTable() {
		return table;
	}


	public void setTable(JTable table) {
		this.table = table;
	}


	public JTextField getTxtFind() {
		return txtFind;
	}


	public void setTxtFind(JTextField txtFind) {
		this.txtFind = txtFind;
	}


	public JTextField getTxtName() {
		return txtName;
	}


	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}


	public JTextField getTxtPhone() {
		return txtPhone;
	}


	public void setTxtPhone(JTextField txtPhone) {
		this.txtPhone = txtPhone;
	}


	public JTextField getTxtCCCD() {
		return txtCCCD;
	}


	public void setTxtCCCD(JTextField textCCCD) {
		this.txtCCCD = textCCCD;
	}


	public JTextField getTxtAge() {
		return txtAge;
	}


	public void setTxtAge(JTextField txtAge) {
		this.txtAge = txtAge;
	}


	public JTextField getTxtCID() {
		return txtCID;
	}


	public void setTxtCID(JTextField txtCID) {
		this.txtCID = txtCID;
	}


	public JRadioButton getRdoMale() {
		return rdoMale;
	}


	public void setRdoMale(JRadioButton rdoMale) {
		this.rdoMale = rdoMale;
	}


	public JRadioButton getRdoFemale() {
		return rdoFemale;
	}


	public void setRdoFemale(JRadioButton rdoFemale) {
		this.rdoFemale = rdoFemale;
	}


	public JComboBox getComboBoxcondition() {
		return comboBoxcondition;
	}


	public void setComboBoxcondition(JComboBox comboBoxcondition) {
		this.comboBoxcondition = comboBoxcondition;
	}
	
	
	
	
}