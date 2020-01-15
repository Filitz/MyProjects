import java.util.Arrays;

public class Example1 {
	
	// this example shows that a value type does not change its value, while the reference type changes it.
	
	public static void main(String[] args) {
		
		int num = 1; // A value type
		double[] arr = {1.1, 2.2, 3.3, 4.4}; // A reference type (object)

		System.out.println("Value of num is " + num + ", arr contains " + Arrays.toString(arr));
		
		test(num, arr);

		System.out.println("Value of num is " + num + ", arr contains " + Arrays.toString(arr));
		
	}
	public static void test(int num, double[] array) {
		
		num = 99;
		array[1] = 99;
		
	}
}