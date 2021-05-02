package GameProject;

public class UserValidationManager implements UserValidationService
{

	@Override
	public boolean validation(Gamer gamer) 
	{
		if(gamer.getFirstName().length()> 2 && gamer.getLastName().length()> 2 
				&& gamer.getNationalityId().length() > 10 && gamer.getBirthYear()< 2000)
		{
			System.out.println("Kayýt eklendi. "+gamer.getFirstName());
			return true;
		}
		else 
		{
			System.out.println("Kayýt eklenemedi, doðrulama baþarýsýz.");
			return false;
		}
	}

}
