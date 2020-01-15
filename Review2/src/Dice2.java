
public class Dice2 {

	public static void main(String[] args) {

		// declaring the variables and creating the object. This way you don't need to create a static method.
		int turn = 0;
		int total = 0;
		Dice dice1 = new Dice(); // better declare outside the method!!!

		// loop for throwing the dice 20x
		for (int i = 0; i < 20; i++) {
			turn = dice1.roll();
			total += turn;
			System.out.println(turn); // printing every throw
		}

		// calculates the average
		System.out.print("The average is " + total/20 + " .");

	}

	// method to throw the dice
	public int roll() {
		int throw1 = (int) (1 + Math.random() * 6);
		int throw2 = (int) (1 + Math.random() * 6);
		int result = throw1 + throw2;
		return result;
	}

}
