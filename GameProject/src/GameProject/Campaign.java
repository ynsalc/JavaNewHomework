package GameProject;

public class Campaign 
{
	private String campaignName;
	private String campaignDetail;
	private int campaignDiscount;
	
	public Campaign(String campaignName,String campaignDetail,int campaignDiscount) 
	{
		this.campaignName=campaignName;
		this.campaignDetail=campaignDetail;
		this.campaignDiscount=campaignDiscount;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignDetail() {
		return campaignDetail;
	}
	public void setCampaignDetail(String campaignDetail) {
		this.campaignDetail = campaignDetail;
	}
	public int getCampaignDiscount() {
		return campaignDiscount;
	}
	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
}
