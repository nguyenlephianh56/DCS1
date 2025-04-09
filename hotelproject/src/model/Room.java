package model;

public class Room {
	private String rID;
	private int roomNumber;
	private String roomType;
	private int floor;
	private String status;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Room(String rID, int roomNumber, String roomType, int floor, String ststus) {
		super();
		this.rID = rID;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.floor = floor;
		this.status = ststus;
	}



	public String getrID() {
		return rID;
	}

	public void setrID(String rID) {
		this.rID = rID;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getStstus() {
		return status;
	}

	public void setStstus(String ststus) {
		this.status = ststus;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	
	
	
}
