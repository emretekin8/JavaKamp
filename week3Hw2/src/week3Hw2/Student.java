package week3Hw2;

public class Student extends User {

	String school;
	String studentNumber;
	boolean status;

	public Student(int id, String firstName, String lastName, String nationalIdentity, int age, String gender) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setNationalIdentity(nationalIdentity);
		setAge(age);
		setGender(gender);
	}

	public void addStudentDetail(String school, String studentNumber, boolean isGraduate) {
		setSchool(school);
		setStudentNumber(studentNumber);
		setIsGraduate(isGraduate);

	}

	public boolean status() {
		return status;
	}

	public void setIsGraduate(boolean status) {
		this.status = status;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
