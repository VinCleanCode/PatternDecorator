package decoratorPattern;

public class TitleAgile extends Title{
	
	public TitleAgile(Adventurer adventuerer) {
		super(adventuerer);
	}

	@Override
	public void attack(){
		System.out.println("fast");
		super.adventureer.attack();
	}
	
	public void useFlash() {
		System.out.println("New skill- move");
	}
}
