package view;

import javax.swing.*;

import controller.AccountListener;
import dao.AccountDAO;

import java.awt.*;

public class LoginPanel extends JPanel {

	
	private JTextField txtLogin;
	private JPasswordField txtPassword;
	private JButton btnLogin;

    public LoginPanel() {
    	setForeground(new Color(0, 0, 0));
    	setBackground(new Color(64, 64, 64));
        setLayout(null); // hoặc dùng Layout tùy thích như BoxLayout, GridBagLayout...

        JLabel title = new JLabel("Đăng Nhập");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(new Color(255, 255, 255));
        title.setBackground(new Color(255, 255, 255));
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(226, 89, 194, 30);
        add(title);
     
        btnLogin = new JButton("Đăng Nhập");     
        btnLogin.setBackground(new Color(255, 128, 0));
        btnLogin.setBounds(174, 331, 312, 30);
        add(btnLogin);
        
        
        JLabel lblusername = new JLabel("Tên Đăng Nhập");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblusername.setHorizontalAlignment(SwingConstants.LEFT);
        lblusername.setForeground(new Color(255, 255, 255));
        lblusername.setBounds(164, 125, 124, 40);
        add(lblusername);
        
        txtLogin = new JTextField();
        txtLogin.setBackground(new Color(192, 192, 192));
        txtLogin.setBounds(174, 160, 312, 24);
        add(txtLogin);
        txtLogin.setColumns(10);
        
        JLabel lblPassword = new JLabel("Mật Khẩu");
        lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPassword.setBounds(164, 200, 93, 40);
        add(lblPassword);
        
        txtPassword = new JPasswordField();
        txtPassword.setColumns(10);
        txtPassword.setBackground(Color.LIGHT_GRAY);
        txtPassword.setBounds(174, 235, 312, 24);
        add(txtPassword);
    }

	public JTextField getTxtLogin() {
		return txtLogin;
	}

	public JPasswordField getTxtPassword() {
		return txtPassword;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	

	
}