package test;

import java.awt.EventQueue;

import javax.swing.UIManager;

import view.LoginView;
import view.MainView;

public class hotelTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Hiển thị giao diện giống hệ điều hành đang dùng
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					LoginView window = new LoginView();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
