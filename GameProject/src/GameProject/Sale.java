package GameProject;

public class Sale 
{
	private Gamer gamer;
	private Game game;
	private Campaign campaign;
	private String date;
	
	public Sale(Gamer gamer, Game game, Campaign campaign, String date)
	{
		this.gamer = gamer;
		this.game = game;
		this.campaign = campaign;
		this.date = date;
	}
	
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
