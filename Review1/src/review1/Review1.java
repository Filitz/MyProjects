package review1;

import java.util.Scanner;

public class Review1 {

	public static void main(String[] args) {
		
		//prompt the user
		Scanner input = new Scanner(System.in);
		System.out.println("How many bottles do you have?");
		int bottles = input.nextInt();

		// bottles 3 to 99
		for (int i = bottles; i > 2; i--) {
			System.out.println(i + " bottles of beer on the wall, " + i + 
					" bottles of beer.\nTake one down and pass it around, " + (i - 1) + 
					" bottles of beer on the wall\n");
		}
		
		// bottles 0, 1, 2
		System.out.println("2 bottles of beer on the wall, 2 bottles of beer.\n"
				+ "Take one down and pass it around, 1 bottle of beer on the wall.\n");
		System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n"
				+ "Take one down and pass it around, no more bottles of beer on the wall.\n");
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n"
				+ "Go to the store and buy some more, 99 bottles of beer on the wall.");

	}

}
