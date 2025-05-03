package controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import dao.RoomDAO;
import view.CustomerView;
import view.LoginView;
import view.MainView;
import view.RoomView;

public class LabelMouseHandler extends MouseAdapter{
	private JLabel label;
	private MainView mainView;
	private String action;
   

	public LabelMouseHandler(JLabel label, MainView mainView, String action) {
		this.label = label;
		this.mainView = mainView;
		this.action = action;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		switch(action) {
		case "room": RoomView roomView = new RoomView(mainView, new RoomDAO());
        			roomView.showWindow(); break;
		case "customer" : CustomerView customerView = new CustomerView();
		customerView.showWindow(); break;
		case "exit": mainView.dispose();
					LoginView loginView = new LoginView();
					loginView.getFrame().setVisible(true);
					
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setBorder(BorderFactory.createEmptyBorder());
	}
    
    
}
