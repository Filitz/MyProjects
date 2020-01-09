package review3;
import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int keyboard = 999;

		while (keyboard != 0) {

			try {

				System.out.println("Please type the keyboard number:");
				keyboard = input.nextInt();

				switch (keyboard) {
				case 0:
					break;
				case 1: case 3: case 5: case 7: case 9:
					System.out.println("Diagonal moves not allowed.");
					break;
				case 2:
					System.out.println("move down");
					break;
				case 4:
					System.out.println("move left");
					break;
				case 6:
					System.out.println("move right");
					break;
				case 8:
					System.out.println("move up");
					break;
				default:
					System.out.println("Invalid key. Try again.");
					break;	
				}

			} catch(Exception ex){
				System.out.println("Bad input.");
				input.nextLine();
			}

		}
	}
}
