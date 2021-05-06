package gameSystemDemo;

import gameSystemDemo.Market.Campaign;
import gameSystemDemo.Market.CampaignManager;
import gameSystemDemo.Market.Game;
import gameSystemDemo.Market.GameManager;
import gameSystemDemo.Market.MarketManager;
import gameSystemDemo.Player.Player;
import gameSystemDemo.Player.PlayerManager;

public class Main {

	public static void main(String[] args) {
//managers
		PlayerManager playerManager = new PlayerManager();
		MarketManager gameManager = new GameManager();
		MarketManager campaignManager = new CampaignManager();

		Player player1 = new Player(1, "Emre", "Tekin", "98765432100", "2001");
		playerManager.add(player1);
		Utils.showUserDetails(player1);

		Player player2 = new Player(2, "Engin", "Demiroð", "12345678900", "1986");
		playerManager.add(player2);
		Utils.showUserDetails(player2);

		playerManager.update(player1);
		Utils.showUserDetails(player1);

		playerManager.delete(player2);
		Utils.showUserDetails(player2);

		Game game1 = new Game("FIFA 21", 100);
		gameManager.addGame(game1);
		Utils.showGameDetails(game1);

		Campaign campaign = new Campaign(10);
		campaignManager.addCampaign(campaign, game1);

		campaignManager.applyCampaignToGame(game1, campaign);
		Utils.showGameDetails(game1);

		campaignManager.removeCampaignFromGame(game1, campaign);
		Utils.showGameDetails(game1);

		campaignManager.campaignForUser(player1, game1, new Campaign(25));
		Utils.showGameDetails(game1);

		gameManager.sellGame(game1);

	}

}
