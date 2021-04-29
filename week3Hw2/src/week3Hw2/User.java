package week3Hw2;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private int age;
	private String gender;

	public User() {
		System.out.println("There is new user!");
	}

	public User(int id, String firstName, String lastName, String nationalIdentity, int age, String gender) {
		
		this();
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setNationalIdentity(nationalIdentity);
		setAge(age);
		setGender(gender);

	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
