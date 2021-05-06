package gameSystemDemo.Market;

import gameSystemDemo.Player.Player;

public class CampaignManager extends MarketManager {

	public CampaignManager() {
	}

	@Override
	public void addCampaign(Campaign campaign, Game game) {
		System.out.println("New Campaign: %" + campaign.getDiscount() + " discount on \"" + game.getName() + "\"");
	}

	@Override
	public void applyCampaignToGame(Game game, Campaign campaign) {

		double newPrice = game.getPrice() - (game.getPrice() * campaign.getDiscount()) / 100;
		game.setPrice(newPrice);

	}

	@Override
	public void removeCampaignFromGame(Game game, Campaign campaign) {

		System.out.println("%" + campaign.getDiscount() + " discount removed from \"" + game.getName() + "\"");
		double newPrice = (game.getPrice()*100) / (100 - campaign.getDiscount());
		game.setPrice(newPrice);
	}
	

	@Override
	public void campaignForUser(Player player, Game game, Campaign campaign) {
		
		System.out.println("%" + campaign.getDiscount() + " discount applied on the user \"" + player.getFirstName() + "\" for the \"" + game.getName() + "\"");
		System.out.println("---For " + player.getFirstName() + "---");
		this.applyCampaignToGame(game, campaign);
	}


}
