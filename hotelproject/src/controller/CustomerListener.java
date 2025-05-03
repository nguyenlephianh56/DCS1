package controller;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.CustomerDAO;
import model.Customer;
import view.CustomerView;

public class CustomerListener implements ActionListener{
	private CustomerView customerView;
	private CustomerDAO customerDAO;
	
	
	
	public CustomerListener(CustomerView customerView, CustomerDAO customerDAO) {
		super();
		this.customerView = customerView;
		this.customerDAO = customerDAO;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Thêm")) {
			insert();
		} else if (src.equals("Làm mới")) {
			refresh();
		} else if (src.equals("Sửa")) {
			edit();
		} else if (src.equals("Xóa")) {
			delete();
		} else if (src.equals("Tìm Kiếm")) {
			search();
		}
		
		
	}
	
	private void search() {
		try {
			String condition = customerView.getComboBoxcondition().getSelectedItem().toString();
			String keyword = customerView.getTxtFind().getText().trim();
			
			if (keyword.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Vui lòng nhập từ khóa tìm kiếm!", "Thông báo", JOptionPane.WARNING_MESSAGE);
	            return;
	        }
			
			ArrayList<Customer> results = customerDAO.searchByCondition(condition, keyword);
			 if (results.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả phù hợp.", "Kết quả", JOptionPane.INFORMATION_MESSAGE);
		        }
			customerView.updateTable(results);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void delete() {
		try {
			String cID = customerView.getTxtCID().getText();
			
			if (cID.isEmpty()) {
			    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã khách hàng để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			    return;
			}
			int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn xóa không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
			if (confirm != JOptionPane.YES_OPTION) {
				return;
			}
			
			Customer customer = new Customer(cID);
			int result = customerDAO.delete(customer);
			
			if (result >0) {
				JOptionPane.showMessageDialog(null, "Xóa phòng thành công!");
				
			}else {
				JOptionPane.showMessageDialog(null, "Xóa phòng thất bại! Mã phòng không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void refresh() {
		try {
			customerView.updateTable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void insert() {
		try {
			String cID = customerView.getTxtCID().getText();
			String fullName =  customerView.getTxtName().getText();
			int age = Integer.parseInt(customerView.getTxtAge().getText());
			String gender =  customerView.getRdoMale().isSelected() ? "Nam" : "Nữ";
			String phoneNumber =  customerView.getTxtPhone().getText();
			String idCard =  customerView.getTxtCCCD().getText();
			
			Customer customer = new Customer(cID, fullName, age, gender, phoneNumber, idCard);
			int result = customerDAO.insert(customer);
			
			 if (cID.isEmpty() || fullName.isEmpty() || customerView.getTxtAge().getText().isEmpty()  || phoneNumber.isEmpty() || idCard.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Thiếu thông tin", JOptionPane.WARNING_MESSAGE);
		            return;
		        }

			
			if (result > 0) {
				JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công!");

			} else {
				JOptionPane.showMessageDialog(null, "Thêm không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void edit() {
		try {
			String cID = customerView.getTxtCID().getText();
			String fullName =  customerView.getTxtName().getText();
			int age = Integer.parseInt(customerView.getTxtAge().getText());
			String gender =  customerView.getRdoMale().isSelected() ? "Nam" : "Nữ";
			String phoneNumber =  customerView.getTxtPhone().getText();
			String idCard =  customerView.getTxtCCCD().getText();
			
			Customer customer = new Customer(cID, fullName, age, gender, phoneNumber, idCard);
			int result = customerDAO.update(customer);
			
			if (result > 0) {
				JOptionPane.showMessageDialog(null, "Sửa thành công!");

			} else {
				JOptionPane.showMessageDialog(null, "Sửa không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Dữ liệu không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
		
	}
	
	
}
