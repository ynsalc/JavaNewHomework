package GameProject;

public class SaleManager implements SaleService
{

	@Override
	public void gamerSale(Sale sale) 
	{
		System.out.println(sale.getGamer().getFirstName()+" adlý kullanýcý "+sale.getGame().getGameName()
				+" adlý oyunu "+sale.getCampaign().getCampaignName()+" kampanyasýyla "+sale.getDate()+
				" tarihinde satýn aldý.");
	}

}
