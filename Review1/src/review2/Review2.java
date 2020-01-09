package review2;
import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) {

		// prompt user
		System.out.println("Please enter the bill amount:");
		Scanner input = new Scanner(System.in);
		double billAmount = input.nextDouble();
		System.out.println("Please enter the tip %:");
		double inputTip = input.nextDouble();

		// calculates the tip and total
		double tip = (billAmount * inputTip)/100;
		double total = billAmount + tip;
		
		//display result
		System.out.printf("The tip amount is $%.2f and the total is $%.2f.", tip, total);

	}

}
