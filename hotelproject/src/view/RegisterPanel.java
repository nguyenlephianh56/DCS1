package View;

import javax.swing.*;
import java.awt.*;

public class RegisterPanel extends JPanel {
	private JTextField textusernameregist;
	private JTextField textpasswordregist;
	private JTextField textpasswordcfregist;
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
        
        textusernameregist = new JTextField();
        textusernameregist.setColumns(10);
        textusernameregist.setBackground(Color.LIGHT_GRAY);
        textusernameregist.setBounds(176, 156, 312, 24);
        add(textusernameregist);
        
        JLabel lblPassword = new JLabel("Mật Khẩu");
        lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPassword.setBounds(166, 196, 93, 40);
        add(lblPassword);
        
        textpasswordregist = new JTextField();
        textpasswordregist.setColumns(10);
        textpasswordregist.setBackground(Color.LIGHT_GRAY);
        textpasswordregist.setBounds(176, 231, 312, 24);
        add(textpasswordregist);
        
        JButton Register_button = new JButton("Đăng Ký");
        Register_button.setBackground(new Color(255, 128, 0));
        Register_button.setBounds(176, 352, 312, 30);
        add(Register_button);
        
        textpasswordcfregist = new JTextField();
        textpasswordcfregist.setColumns(10);
        textpasswordcfregist.setBackground(Color.LIGHT_GRAY);
        textpasswordcfregist.setBounds(176, 300, 312, 24);
        add(textpasswordcfregist);
        
        JLabel lblXcNhnMt = new JLabel("Xác Nhận Mật Khẩu");
        lblXcNhnMt.setHorizontalAlignment(SwingConstants.LEFT);
        lblXcNhnMt.setForeground(Color.WHITE);
        lblXcNhnMt.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblXcNhnMt.setBounds(166, 265, 172, 40);
        add(lblXcNhnMt);
    }
}
