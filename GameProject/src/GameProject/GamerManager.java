package GameProject;

public class GamerManager implements GamerService
{
	private UserValidationService userValidationService;
	
	public GamerManager(UserValidationService userValidationService)
	{
		this.userValidationService=userValidationService;
	}

	@Override
	public void Add(Gamer gamer) 
	{
		if(userValidationService.validation(gamer)==true)
		{
			System.out.println("Eklendi.");
		}
		else 
		{
			System.out.println("Eklenemedi.");
		}
	}

	@Override
	public void Delete(Gamer gamer) 
	{
		System.out.println(gamer.getFirstName()+" Silindi.");
	}

	@Override
	public void Update(Gamer gamer) 
	{
		System.out.println(gamer.getFirstName()+" G�ncellendi.");
	}

}
