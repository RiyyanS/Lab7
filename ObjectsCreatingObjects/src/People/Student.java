package People;

public class Student {
	private String first_name;
	private String last_name;
	private String email;
	private int id_num;
	
	public Student(int id_num, String first_name, String last_name,
			String email){
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.id_num = id_num;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId_num() {
		return id_num;
	}
	
	public void setId_num(int id_num) {
		this.id_num = id_num;
	}
}
