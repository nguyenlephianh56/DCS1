package model;

public class Customer {
	private String cID;
	private String fullName;
	private int age;
	private String gender;
	private String phoneNumber;

	private String idCard;
	
	public Customer() {
		
	}
	
	public Customer(String cID) {
		super();
		this.cID = cID;
	}



	public Customer(String cID, String fullName, int age, String gender, String phoneNumber, String idCard) {
		super();
		this.cID = cID;
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	
}
