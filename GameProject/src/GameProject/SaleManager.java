package GameProject;

public class SaleManager implements SaleService
{

	@Override
	public void gamerSale(Sale sale) 
	{
		System.out.println(sale.getGamer().getFirstName()+" adl� kullan�c� "+sale.getGame().getGameName()
				+" adl� oyunu "+sale.getCampaign().getCampaignName()+" kampanyas�yla "+sale.getDate()+
				" tarihinde sat�n ald�.");
	}

}
