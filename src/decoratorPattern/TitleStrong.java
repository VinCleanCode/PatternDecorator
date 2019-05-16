package decoratorPattern;

public class TitleStrong extends Title{
	
	public TitleStrong(Adventurer adventurerer) {
		super(adventurerer);
	}

	@Override
	public void attack(){
		System.out.println(" Strong !! ");
		super.attack();
	}
}
