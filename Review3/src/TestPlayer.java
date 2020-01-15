
public class TestPlayer {

	public static void main(String[] args) {
		
		// creates object
		Player player1 = new Player("Astolpho", 100.2, 10, 50.3);
		
		// printing the object
		player1.printInfo();
		
		// using the customized methods aand printing
		player1.hitHealth();
		player1.levelUp();
		player1.updateScore(15.2);
		player1.printInfo();
		
		// updating the name
		player1.setName("Dabi");
		player1.printInfo();
		
		// updating score
		player1.setScore(200);
		player1.printInfo();
		
		
		//updating level
		player1.setLevel(250);
		player1.printInfo();
		
		// updating Health
		player1.setHealthPerc(100);
		player1.printInfo();

	}

}
