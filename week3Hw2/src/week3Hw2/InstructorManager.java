package week3Hw2;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println("Instructor added: " + instructor.getFirstName());
	}

	public void showInstructorDetail(Instructor instructor) {
		System.out.println("\n--INSTRUCTOR DETAILS--");
		System.out.println("Certificate Number: " + instructor.getCertificateNumber());
		System.out.println("Graduate By: " + instructor.getGraduateBy());
		System.out.println("Profession: " + instructor.getProfession() + "\n\n\n");

	}
}
