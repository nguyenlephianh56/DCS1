package model;

public class Room {
	private String rID;
	private int roomNumber;
	private String roomType;
	private int floor;
	private String status;
	private String note;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Room(String rID, int roomNumber, String roomType, int floor, String status, String note) {
		super();
		this.rID = rID;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.floor = floor;
		this.status = status;
		this.note = note;
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

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	
}
