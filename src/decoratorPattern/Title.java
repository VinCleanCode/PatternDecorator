package decoratorPattern;

public abstract class Title implements Adventurer {
	
	protected Adventurer adventureer;
	
	public Title( Adventurer adventureer) {
		this.adventureer = adventureer;
	}
	
	@Override
	public void attack() {
		adventureer.attack();
	}
}
