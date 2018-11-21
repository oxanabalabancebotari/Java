
public class Student {
	public String name;
	public int age;
	public String gender;
	public int year;
	public String course;
	public static String university="Cybertek";  // static will assign automaticaly
	  
	

	public Student(String name, int age, String gender, int year, String course) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		//this.university = university;
	}
	public void attendLecture() {
		System.out.println(name+" attended lecture"+ university);
	}
	public void submitAssignment() {
		System.out.println(name+" submitted assignment" +university);
	}
	public void attendLab() {
		System.out.println(name+" attended lab"+ university);
	}
}


