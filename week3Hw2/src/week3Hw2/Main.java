package week3Hw2;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();

		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�", "12345678900", 36, "Male");
		instructor1.addInstructorDetail("102030", "ODT�", "Java, C#");

		instructorManager.add(instructor1);
		userManager.showUserDetails(instructor1);
		instructorManager.showInstructorDetail(instructor1);

		Student student1 = new Student(2, "Emre", "Tekin", "00112233445", 20, "Male");
		student1.addStudentDetail("�stanbul Medeniyet �niversitesi", "00011122233", false);

		studentManager.add(student1);
		userManager.showUserDetails(student1);
		studentManager.showStudentDetail(student1);

	}

}
