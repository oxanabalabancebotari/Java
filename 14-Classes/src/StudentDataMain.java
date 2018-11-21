
public class StudentDataMain {
	

	public static void main(String[] args) {
		Student student1=new Student("Mike", 17, "M", 2016, "Java");
		System.out.println(student1.name+" name "+student1.age+" age "+student1.gender+" gender "
		+student1.course+" course " +student1.university);
		student1.attendLecture();
		student1.attendLab();
		student1.submitAssignment();
		
		Student student2=new Student("Smith", 18, "M", 2016, "Java");
		System.out.println(student2.name+" name "+student2.age+" age "+student2.gender+" gender "
		+student2.course+" course "+student2.university);
		
		Student student3=new Student("John", 18, "M", 2016, "Java");
		System.out.println(student3.name+" name "+student3.age+" age "+student3.gender+" gender "
		+student3.course+" course "+ student3.university);

	}

}
 