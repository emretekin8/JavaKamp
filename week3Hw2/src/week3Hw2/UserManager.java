package week3Hw2;

public class UserManager {

	public void add(User user) {
		System.out.println("User added.");
	}

	public void showUserDetails(User user) {
		System.out.println("\n--USER DETAILS--");
		System.out.println("Id: " + user.getId());
		System.out.println("First Name: " + user.getFirstName());
		System.out.println("Last Name: " + user.getLastName());
		System.out.println("National Identity: " + user.getNationalIdentity());
		System.out.println("Age: " + user.getAge());
		System.out.println("Gender: " + user.getGender());

	}

}
