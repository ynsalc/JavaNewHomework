package GameProject;

public class Game 
{
	private String gameName;
	private String company;
	private double price;
	private Campaign campaign;
	
	public Game(String gameName, String company, double price, Campaign campaign)
	{
		this.gameName=gameName;
		this.company=company;
		this.price=price;
		this.campaign=campaign;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
}
