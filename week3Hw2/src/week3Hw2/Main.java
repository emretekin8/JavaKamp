package week3Hw2;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();

		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "12345678900", 36, "Male");
		instructor1.addInstructorDetail("102030", "ODTÜ", "Java, C#");

		instructorManager.add(instructor1);
		userManager.showUserDetails(instructor1);
		instructorManager.showInstructorDetail(instructor1);

		Student student1 = new Student(2, "Emre", "Tekin", "00112233445", 20, "Male");
		student1.addStudentDetail("İstanbul Medeniyet Üniversitesi", "00011122233", false);

		studentManager.add(student1);
		userManager.showUserDetails(student1);
		studentManager.showStudentDetail(student1);

		Instructor instructor2 = new Instructor(3, "Tarık", "Tekin", "4865320017", 25, "Male");
		instructor2.addInstructorDetail("231230", "KOU", "SAP-ABAP");
		
		instructorManager.add(instructor2);
		userManager.showUserDetails(instructor2);
		instructorManager.showInstructorDetail(instructor2);
	}

}
