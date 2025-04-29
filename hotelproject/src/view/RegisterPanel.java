package view;

import javax.swing.*;

import controller.AccountListenner;
import dao.AccountDAO;

import java.awt.*;

public class RegisterPanel extends JPanel {
	private JTextField txtRegister;
	private JPasswordField txtPassword;
	private JPasswordField txtConfirmPassword;

	private JButton btnRegister;
    public RegisterPanel() {
    	setBackground(new Color(64, 64, 64));
        setLayout(null);
        
        JLabel lblusernameregist = new JLabel("Tên Đăng Nhập");
        lblusernameregist.setHorizontalAlignment(SwingConstants.LEFT);
        lblusernameregist.setForeground(Color.WHITE);
        lblusernameregist.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblusernameregist.setBounds(166, 121, 124, 40);
        add(lblusernameregist);
        
        JLabel title = new JLabel("Đăng Ký");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBackground(Color.WHITE);
        title.setBounds(228, 85, 194, 30);
        add(title);
        
        txtRegister = new JTextField();
        txtRegister.setColumns(10);
        txtRegister.setBackground(Color.LIGHT_GRAY);
        txtRegister.setBounds(176, 156, 312, 24);
        add(txtRegister);
        
        JLabel lblPassword = new JLabel("Mật Khẩu");
        lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPassword.setBounds(166, 196, 93, 40);
        add(lblPassword);
        
        txtPassword = new JPasswordField();
        txtPassword.setColumns(10);
        txtPassword.setBackground(Color.LIGHT_GRAY);
        txtPassword.setBounds(176, 231, 312, 24);
        add(txtPassword);
           
        btnRegister = new JButton("Đăng Ký");
    
        btnRegister.setBackground(new Color(255, 128, 0));
        btnRegister.setBounds(176, 352, 312, 30);
        add(btnRegister);
        
        txtConfirmPassword = new JPasswordField();
        txtConfirmPassword.setColumns(10);
        txtConfirmPassword.setBackground(Color.LIGHT_GRAY);
        txtConfirmPassword.setBounds(176, 300, 312, 24);
        add(txtConfirmPassword);
        
        JLabel lblPasswordAgain = new JLabel("Xác Nhận Mật Khẩu");
        lblPasswordAgain.setHorizontalAlignment(SwingConstants.LEFT);
        lblPasswordAgain.setForeground(Color.WHITE);
        lblPasswordAgain.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPasswordAgain.setBounds(166, 265, 172, 40);
        add(lblPasswordAgain);
    }
	public JTextField getTxtRegister() {
		return txtRegister;
	}
	public JPasswordField getTxtPassword() {
		return txtPassword;
	}
	public JPasswordField getTxtConfirmPassword() {
		return txtConfirmPassword;
	}
	public JButton getBtnRegister() {
		return btnRegister;
	}
	public void setBtnRegister(JButton btnRegister) {
		this.btnRegister = btnRegister;
	}
	
    
}