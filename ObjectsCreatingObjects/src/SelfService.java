import java.util.Scanner;
import People.*;
import Location.*;
import java.util.ArrayList;
import Administration.Class;
public class SelfService {

	static ArrayList<Professor> professors;
	static ArrayList<Student> students;
	static ArrayList<Building> buildings;
	static ArrayList<Class> classes;
	static Scanner input;
	
	private static void createProfessor(){
		Professor professor = new Professor(getInteger("Please enter a id number"),
				getString("Please enter a First Name"),
				getString("Please enter a Last Name"),
				getString("Please enter a email")); 
		professors.add(professor);
	}
	
	private static void createStudent(){
		Student student = new Student(getInteger("Please enter a id number"),
				getString("Please enter a First Name"),
				getString("Please enter a Last Name"),
				getString("Please enter a email"));
		students.add(student);
	}
	
	private static void createBuilding(){
		Building building = new Building(getString("Please enter a Name"), 
				getString("Please enter a Address"), 
				getString("Please enter a Campus"));
		buildings.add(building);
	}
	
	private static void createClass(){
		Class current_class = new Class(getRoom(), getProfessor(), 
				getString("Please enter a Name"));
		classes.add(current_class);
	}
	
	private static void assignStudentToClass(){
		for(int i = 0; i < students.size(); i++){
			System.out.println("Please enter " + (i) + "for " +
					students.get(i).getLastName()+ ", " 
					+ students.get(i).getFirstName());
		}
		int student = getInteger("Please choose: ");
		
		for(int i = 0; i < classes.size(); i++){
			System.out.println("Please enter " + (i) + "for " +
					classes.get(i).getName());
		}
		int classNum = getInteger("Please choose: ");
		if (classes.get(classNum).addStudent(students.get(student))){
			System.out.println("Student was added");
		} else {
			System.out.println("Student was not added");
		}
	}
	
	private static Room getRoom(){
		int room_number = (int)(Math.random() * 100);
		int floor_number = (int)(Math.random() * 3);
		boolean lab = false;
		int capacity = (int)(Math.random()*50);
		
		for(int i = 0; i < buildings.size(); i++){
			System.out.println("Please enter " + (i) + "for " +
					buildings.get(i).getName());
		}
		int building = getInteger("Please choose: ");
		return new Room(room_number, floor_number, lab, 
				buildings.get(building), capacity);
	}
	
	private static Professor getProfessor(){
		for(int i = 0; i < professors.size(); i++){
			System.out.println("Please enter " + (i) + "for " +
					professors.get(i).getLastName()+ ", " 
					+ professors.get(i).getFirstName());
		}
		int professor = getInteger("Please choose: ");
		return professors.get(professor);
	}
	
	public static void main(String[] args){
		professors = new ArrayList<Professor>();
		buildings = new ArrayList<Building>();
		students = new ArrayList<Student>();
		classes = new ArrayList<Class>();
		input = new Scanner(System.in);
		boolean loop = true;
		do {
			printMenu();
			switch(getInteger("")){
				case 1:
					createProfessor();
					break;
				case 2:
					createStudent();
					break;
				case 3:
					createBuilding();
					break;
				case 4:
					createClass();
					break;
				case 5:
					assignStudentToClass();
					break;
				default:
					loop = false;
			} 
		} while(loop);
		input.close();
	}

	private static String getString(String message){
//		if(input.hasNextLine()){
//			input.reset();
//		}
		System.out.print(message);
		String value = input.nextLine();
		return value;
	}

	private static int getInteger(String message){
		System.out.print(message);
		int value = input.nextInt();
		input.nextLine();
		return value;
	}

	private static void printMenu(){
		System.out.println("Please enter one of the following for a menu choice:");
		System.out.println("1: Create a Professor");
		System.out.println("2: Create a Student");
		System.out.println("3: Create a Building");
		System.out.println("4: Create a Class");
		System.out.println("5: Assign a Student to a Class");
		System.out.println("Any other number will exit");
	}
}
