package model;

public class Customer {
	private String cID;
	private String fullName;
	private String phoneNumber;
	private String address;
	private int idCard;
	public Customer() {
		
	}
	public Customer(String cID, String fullName, String phoneNumber, String address, int idCard) {
		super();
		this.cID = cID;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.idCard = idCard;
	}
	public String getcID() {
		return cID;
	}
	public void setcID(String cID) {
		this.cID = cID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIdCard() {
		return idCard;
	}
	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}
	
	
	
	
}
