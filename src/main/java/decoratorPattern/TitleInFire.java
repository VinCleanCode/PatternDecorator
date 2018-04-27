package decoratorPattern;

public class TitleInFire extends Title{
	public TitleInFire(Adventurer adventurer ) {
		super(adventurer);
	}

	@Override
	public void attack() {
		System.out.println(" fire burn ! ");
		super.attack();
	}
	
	public void fireball() {
		System.out.println(" Throw fire ball ");
	}
}
