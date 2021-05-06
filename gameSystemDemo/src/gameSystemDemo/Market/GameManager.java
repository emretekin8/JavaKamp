package gameSystemDemo.Market;

public class GameManager extends MarketManager{

	@Override
	public void sellGame(Game game) {
		System.out.println(game.getName() + " sold.");
		this.removeGame(game);
	}

	@Override
	public void addGame(Game game) {
		System.out.println(game.getName() + " added to market.");
		
	}

	@Override
	public void removeGame(Game game) {
		System.out.println(game.getName() + " removed from market.");

	}
	
}
