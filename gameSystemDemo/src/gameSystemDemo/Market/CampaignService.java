package gameSystemDemo.Market;

import gameSystemDemo.Player.Player;

public interface CampaignService {
	
	public void addCampaign(Campaign campaign, Game game);
	public void applyCampaignToGame(Game game, Campaign campaign);
	public void removeCampaignFromGame(Game game, Campaign campaign);
	public void campaignForUser(Player player, Game game, Campaign campaign);
}
