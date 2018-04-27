import org.junit.Test;

import decoratorPattern.Adventurer;
import decoratorPattern.Lancer;
import decoratorPattern.TitleStrong;

public class TitleTest {

	@Test
	public void test() {
		System.out.println(" Decorator mode test ");
		
		Adventurer lancer  = new Lancer("Jacky");
		System.out.println(" Lancer Jacky");
		lancer.attack();
		
		System.out.println(" Strong Jacky ");
		TitleStrong sJacky = new TitleStrong(lancer);
		sJacky.attack();
		
		System.out.println(" Agile Jacky");
		
	}	
}
