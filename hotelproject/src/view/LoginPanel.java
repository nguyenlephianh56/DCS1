package View;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

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

        JButton loginButton = new JButton("Đăng Nhập");
        loginButton.setBackground(new Color(255, 128, 0));
        loginButton.setBounds(174, 331, 312, 30);
        add(loginButton);
        
        JLabel lblusername = new JLabel("Tên Đăng Nhập");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblusername.setHorizontalAlignment(SwingConstants.LEFT);
        lblusername.setForeground(new Color(255, 255, 255));
        lblusername.setBounds(164, 125, 124, 40);
        add(lblusername);
        
        textField = new JTextField();
        textField.setBackground(new Color(192, 192, 192));
        textField.setBounds(174, 160, 312, 24);
        add(textField);
        textField.setColumns(10);
        
        JLabel lblPassword = new JLabel("Mật Khẩu");
        lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPassword.setBounds(164, 200, 93, 40);
        add(lblPassword);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBackground(Color.LIGHT_GRAY);
        textField_1.setBounds(174, 235, 312, 24);
        add(textField_1);
    }
}
