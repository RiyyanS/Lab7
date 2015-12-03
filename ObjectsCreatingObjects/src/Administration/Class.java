package Administration;

import java.util.Date;
import java.util.ArrayList;

import Location.Room;
import People.*;


public class Class {

	private String subject;
	private String name;
	private Professor professor;
	private Date begin;
	private Date end;
	private int credits;
	private String major;
	private Room room;
	private ArrayList<Student> students;
	
	public Class(String subject, String name, Professor professor, Date begin, Date end, int credits, String major,
			Room room) {
		this.subject = subject;
		this.name = name;
		this.professor = professor;
		this.begin = begin;
		this.end = end;
		this.credits = credits;
		this.major = major;
		this.room = room;
		this.students = new ArrayList<Student>();
	}
	
	public Class(Room room, Professor professor, String name) {
		this.room = room;
		this.professor = professor;
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	public boolean addStudent(Student student){
		if(remainingCapacity() > 0) {
			this.students.add(student);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removeStudent(Student student){
		return this.students.remove(student);
	}
	
	public int remainingCapacity(){
		return this.room.getCapacity() - this.students.size();
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
}
