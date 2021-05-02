package GameProject;

public class CampaignManager implements CampaignService
{

	@Override
	public void Add(Campaign campaign) 
	{
		System.out.println(campaign.getCampaignName()+" Kampanya Eklendi.");
	}

	@Override
	public void Delete(Campaign campaign) 
	{
		System.out.println(campaign.getCampaignName()+" Kampanya Silindi.");
	}

	@Override
	public void Update(Campaign campaign) 
	{
		System.out.println(campaign.getCampaignName()+" Kampanya Güncellendi.");
	}
	
}
