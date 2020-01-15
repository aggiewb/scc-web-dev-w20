public class FooBar {

	public static void main(String[] args) {
		System.out.println("14 % 4");
		System.out.println(14 % 4);
		double total = receipt(45.55, 0.20);
		System.out.println(total);
		computeSum(2, 3);
		System.out.println("Your bmi is " + Math.round(bmiCalculator(200, 72)) + ".");
		smart();
	
	}
	
	public static double receipt(double subtotal, double tipPercent) {
		double tax = subtotal * 0.08;
		double tip = subtotal * tipPercent;
		double total = subtotal + tax + tip;
		return total;
	}
	
	public static void computeSum(int x,  int y) {
		int sum = x + y;
		System.out.println("Sum = " + sum);
	}
	
	public static double bmiCalculator(double weight, double height) {
		//Formula is weight / [height]2 * 703
		double bmi = weight / (height * height) * 703;
		return bmi;
	}
	
	public static void smart() {
		for (int i = 0; i < 4; i++) {
			System.out.println("I am so smart.");
		}
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("\\    /");
			System.out.println("/    \\");
		}
	}
}
