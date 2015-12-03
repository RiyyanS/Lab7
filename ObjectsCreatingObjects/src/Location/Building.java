package Location;

public class Building {

	private String name;
	private String address;
	private String campus;
	
	public Building(String name, String address, String campus){
		this.name = name;
		this.address = address;
		this.campus = campus;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	
}
