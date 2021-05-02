package GameProject;

public class Main {

	public static void main(String[] args) 
	{
		Campaign campaign = new Campaign("Kayýt Ýndirimi","Ýlk kayýta özel %20 indirim!",20);
		Game game = new Game("Pubg Mobile","Tencent Game",1500,campaign);
		Gamer gamer = new Gamer(1,"Yunus","Alýcý",1997,"12345678910");
		Sale sale = new Sale(gamer,game,campaign,"02.05.2021-22:41");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign);
		
		GameManager gameManager = new GameManager();
		gameManager.Add(game);
		
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		gamerManager.Add(gamer);
		
		SaleManager saleManager = new SaleManager();
		saleManager.gamerSale(sale);
	}

}
