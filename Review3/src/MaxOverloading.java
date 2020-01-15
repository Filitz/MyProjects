
public class MaxOverloading {
	
	// max between 2 int numbers
	public int max(int num1, int num2) {
		return (num1 > num2 ? num1 : num2);		
	}
	
	// max between 2 double numbers
	public double max(double num1, double num2) {
		return (num1 > num2 ? num1 : num2);		
	}
	
	// max between 3 int numbers
	public int max(int num1, int num2, int num3) {
		return max(num1, max(num2, num3));
	}
	
	
	
}
