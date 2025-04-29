package view;

import java.awt.*;
import javax.swing.*;

import controller.AccountListenner;
import dao.AccountDAO;

public class LoginView {

    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;	
    private AccountDAO accountDAO = new AccountDAO();

//    public static void main(String[] args) {
//        EventQueue.invokeLater(() -> {
//            try {
//                Loginview window = new Loginview();
//                window.frame.setVisible(true);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//    }
    
    public LoginView() {
        initialize();
    }

    private void initialize() {
        setFrame(new JFrame());
        getFrame().setBounds(100, 100, 897, 522);
        getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getFrame().getContentPane().setLayout(null);

        // Panel bên trái chứa nút
        JPanel panellogin = new JPanel();
        panellogin.setBackground(new Color(76, 76, 76));
        panellogin.setBounds(0, 0, 293, 485);
        getFrame().getContentPane().add(panellogin);
        panellogin.setLayout(null);

        JPanel panellogin_1 = new JPanel();
        panellogin_1.setBackground(new Color(174, 174, 174));
        panellogin_1.setBounds(0, 0, 293, 61);
        panellogin.add(panellogin_1);
        panellogin_1.setLayout(null);

        JLabel lblwelcome = new JLabel("Xin chào!");
        lblwelcome.setBackground(new Color(192, 192, 192));
        lblwelcome.setForeground(Color.BLACK);
        lblwelcome.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
        lblwelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblwelcome.setBounds(0, 0, 293, 61);
        panellogin_1.add(lblwelcome);

        JButton btnloginview = new JButton("Đăng Nhập");
        btnloginview.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnloginview.setBackground(new Color(0, 128, 192));
        btnloginview.setBounds(32, 145, 220, 38);
        panellogin.add(btnloginview);

        JButton btnregisternew = new JButton("Đăng Ký");
        btnregisternew.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnregisternew.setBackground(new Color(0, 128, 192));
        btnregisternew.setBounds(32, 199, 220, 38);
        panellogin.add(btnregisternew);
        
        JButton btnNewButton = new JButton("New button");
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setBounds(92, 274, 85, 21);
        panellogin.add(btnNewButton);
        
        Button button = new Button("New button");
        button.setBackground(new Color(255, 0, 0));
        button.setBounds(97, 330, 66, 21);
        panellogin.add(button);

        // Panel bên phải sử dụng CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.setBounds(291, 0, 582, 485);
        getFrame().getContentPane().add(cardPanel);

        // Thêm các panel vào cardPanel
        LoginPanel loginPanel = new LoginPanel();
        loginPanel.setBackground(new Color(36, 36, 36));
        cardPanel.add(loginPanel, "login");
        RegisterPanel registerPanel = new RegisterPanel();
        registerPanel.setBackground(new Color(36, 36, 36));
        cardPanel.add(registerPanel, "register");

        // Gán sự kiện nút
        btnloginview.addActionListener(e -> cardLayout.show(cardPanel, "login"));
        btnregisternew.addActionListener(e -> cardLayout.show(cardPanel, "register"));
        
        AccountListenner actionLogin = new AccountListenner(loginPanel, accountDAO, this);
        loginPanel.getBtnLogin().addActionListener(actionLogin);
        
        AccountListenner actionRegister = new AccountListenner(registerPanel, accountDAO);
        registerPanel.getBtnRegister().addActionListener(actionRegister);
    }

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}