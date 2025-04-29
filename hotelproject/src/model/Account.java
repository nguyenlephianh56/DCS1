package model;

public class Account {
	private String account;
	private String password;
	
	public Account() {
		super();
	}
	public Account(String account, String password) {
		this.account = account;
		this.password = password;
	}
	public String getAccount() {
		return account;
	}
	public String getPassword() {
		return password;
	}
	
	
}
