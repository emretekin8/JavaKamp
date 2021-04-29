package week3Hw2;

public class Instructor extends User {

	String certificateNumber;
	String graduateBy;
	String profession;

	public Instructor(int id, String firstName, String lastName, String nationalIdentity, int age, String gender) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setNationalIdentity(nationalIdentity);
		setAge(age);
		setGender(gender);
	}

	public void addInstructorDetail(String certificateNumber, String graduateBy, String profession) {

		setCertificateNumber(certificateNumber);
		setGraduateBy(graduateBy);
		setProfession(profession);
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getGraduateBy() {
		return graduateBy;
	}

	public void setGraduateBy(String graduateBy) {
		this.graduateBy = graduateBy;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
