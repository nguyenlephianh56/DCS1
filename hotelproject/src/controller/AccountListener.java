package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.AccountDAO;
import model.Account;
import util.HashUtil;
import view.LoginPanel;
import view.LoginView;
import view.MainView;
import view.RegisterPanel;

public class AccountListener implements ActionListener{
	private LoginPanel loginPanel;
	private LoginView loginView; 
	private AccountDAO accountDAO;
	private RegisterPanel registerPanel;

	public AccountListener(RegisterPanel registerPanel, AccountDAO accountDAO) {
	    this.registerPanel = registerPanel;
	    this.accountDAO = accountDAO;
	   
	}
	
	public AccountListener(LoginPanel loginPanel, AccountDAO accountDAO, LoginView loginView) {
		this.loginPanel = loginPanel;
		this.accountDAO = accountDAO;
		this.loginView = loginView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Đăng Nhập")) {
			login();
		} else if (src.equals("Đăng Ký")) {
			register();
		}
		
	}
	public void login() {
		String account = loginPanel.getTxtLogin().getText();
		String password = new String(loginPanel.getTxtPassword().getPassword());
		
		String hashedPassword = HashUtil.hashPassword(password);
		
		if (account.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(loginPanel, "Không được bỏ trống!");
            return;
        }

        if (accountDAO.checkLogin(account, hashedPassword)) {
            JOptionPane.showMessageDialog(loginPanel, "Đăng nhập thành công!");
            loginView.getFrame().dispose();
            MainView mainView = new MainView();
            mainView.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(loginPanel, "Sai username hoặc password!");
        }
		
	}
	public void register() {
		String account = registerPanel.getTxtRegister().getText();
		String password = new String(registerPanel.getTxtPassword().getPassword());
		String confirmPassword = new String(registerPanel.getTxtConfirmPassword().getPassword());
		
		String hashedPassword = HashUtil.hashPassword(password); 
		
		if (account.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() ) {
            JOptionPane.showMessageDialog(registerPanel, "Vui lòng nhập đầy đủ thông tin!");
            return;
        } else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(registerPanel, "Mật khẩu xác nhận không khớp.");
        }
		
		int result = accountDAO.register(account, hashedPassword);
		if (result > 0) {
		    JOptionPane.showMessageDialog(null, "Đăng ký thành công!");
		    
		} else {
		    JOptionPane.showMessageDialog(null, "Đăng ký thất bại!");
		}

	}
	
}
