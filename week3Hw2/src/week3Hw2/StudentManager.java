package week3Hw2;

public class StudentManager {

	public void add(Student student) {
		System.out.println("Student added: " + student.getFirstName());
	}

	public void showStudentDetail(Student student) {
		System.out.println("\n--STUDENT DETAILS--");
		System.out.println("School: " + student.getSchool());
		System.out.println("Student Number: " + student.getStudentNumber());

		if (student.status) {
			System.out.println("Status: Graduated\n\n\n");
		} else {
			System.out.println("Status: Studying\n\n\n");
		}

	}
}
