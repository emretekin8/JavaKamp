package gameSystemDemo;

import gameSystemDemo.Market.Game;
import gameSystemDemo.Player.Player;

public class Utils {

	public static boolean mernisControl(Player player) {

		if (player.getNationalIdentity().length() == 11 && player.getYearOfBirth().length() == 4) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isValid(Player player, boolean controller) {

		if (controller) {
			System.out.println("valid user: " + player.getFirstName());
			return true;
		} else {
			System.out.println("unvalid user: " + player.getFirstName());
			return false;
		}
	}

	public static void showUserDetails(Player player) {

		System.out.println("ID: " + player.getId());
		System.out.println("First Name: " + player.getFirstName());
		System.out.println("Last Name: " + player.getLastName());
		System.out.println("National Identity: " + player.getNationalIdentity());
		System.out.println("Year of Birth: " + player.getYearOfBirth() + "\n");

	}

	public static void showGameDetails(Game game) {
		System.out.println("Name: " + game.getName());
		System.out.println("Price: " + game.getPrice() + "€\n");
	}
}
