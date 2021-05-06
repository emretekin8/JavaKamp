package gameSystemDemo.Player;

import java.util.Scanner;

import gameSystemDemo.Utils;

public class PlayerManager implements PlayerService{

	@Override
	public void add(Player player) {

		if (Utils.isValid(player, Utils.mernisControl(player))) {
			System.out.println("user accepted: " + player.getFirstName() + " " + player.getLastName() + "\n");
		} else {
			System.out.println("user rejected: " + player.getFirstName() + " " + player.getLastName() + "\n");
		}
	}
	@Override
	public void update(Player player) {
		
		System.out.println("\nUser " + "\"" + player.getFirstName() + "\"" +  " will updated to following your inputs\n");
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("First Name: ");
		String firstName = scanner.nextLine();
		

		System.out.println("Last Name: ");
		String lastName = scanner.nextLine();
		

		System.out.println("National Identity: ");
		String nationalIdentity = scanner.nextLine();
		

		System.out.println("Year of birth: ");
		String yearOfBirth = scanner.nextLine();
		
		Player controller = new Player(player.getId(), firstName, lastName, nationalIdentity, yearOfBirth);

		if(Utils.isValid(controller, Utils.mernisControl(controller))) {
			player.setFirstName(firstName);
			player.setLastName(lastName);
			player.setNationalIdentity(nationalIdentity);
			player.setYearOfBirth(yearOfBirth);
			System.out.println("The user successfully updated: " + player.getFirstName() + " " + player.getLastName());

		}else {
			System.out.println("Invalid informations. User not updated. ");
		}
		
	}
	
	@Override
	public void delete(Player player) {
		System.out.println("User removed: " + player.getFirstName());
		player.setId(0);
		player.setFirstName(null);
		player.setLastName(null);
		player.setNationalIdentity(null);
		player.setYearOfBirth(null);
	}

	
}
