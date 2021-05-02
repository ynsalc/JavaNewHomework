package GameProject;

public class GameManager implements GameService
{

	@Override
	public void Add(Game game) 
	{
		System.out.println(game.getGameName()+" Oyun eklendi.");
	}

	@Override
	public void Delete(Game game) 
	{
		System.out.println(game.getGameName()+" Oyun silindi.");
	}

	@Override
	public void Update(Game game) 
	{
		System.out.println(game.getGameName()+" Oyun güncellendi.");
	}

}
