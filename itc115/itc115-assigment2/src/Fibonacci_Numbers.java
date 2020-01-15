
public class Fibonacci_Numbers {
	public static void main(String[] args) {
		int oneNumAgo = 1;
		int twoNumAgo = 1;
		int currentNum = oneNumAgo + twoNumAgo;
		System.out.print(oneNumAgo + " " + twoNumAgo + " " + currentNum + " ");

		for (int i = 1; i < 10; i++) {
		    oneNumAgo = twoNumAgo;
		    twoNumAgo = currentNum;
		    currentNum = oneNumAgo + twoNumAgo;
		    System.out.print(currentNum + " ");
		}
	}
}
