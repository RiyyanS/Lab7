package Location;

public class Room {

	private int number;
	private int floor;
	private boolean lab;
	private Building building;
	private int capacity;
	
	
	public Room(int number, int floor, boolean lab, 
			Building building, int capacity) {
		this.number = number;
		this.floor = floor;
		this.lab = lab;
		this.building = building;
		this.capacity = capacity;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public boolean isLab() {
		return lab;
	}
	public void setLab(boolean lab) {
		this.lab = lab;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
