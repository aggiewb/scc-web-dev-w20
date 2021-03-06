import java.util.*;


public class Class_practice {

	public static void main(String[] args) {

	}
	
	
	public static void printNumbers(int maxNum) {
		for(int i = 1; i < maxNum; i++) {
			System.out.print(i + ", ");
		}
		
		System.out.print(maxNum);
	}
	
	
	public static void printPrimes(int maxNum) {
		if(maxNum >= 2) {
			System.out.print("2");
		}
		for(int i = 3; i <= maxNum; i++) {
			if(countFactors(i) == 2) {
				System.out.print(", " + i);
			}	
		}
		
		System.out.println();
	}
	
	
	public static int countFactors(int number) {
		int count = 0;
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		
		return count;
		
	}
	
	
	public static void whileLoop(int x) {
		int count = 1;
		while(count <= 100) {
			System.out.print(count + " ");
			count = count * 2;
		}
	}
	
	
	public static void firstFactor(int x) {
		//finds the first factor of 91, other than 1
		int factor = 2;
		while(x % factor != 0) {
			factor++;
		}
		
		System.out.println("First factor is " + factor);
	}
	
	
	public static void randomNumber(int x) {
		Random rand = new Random();
		System.out.println(rand.nextInt(x));
	}
	
	public static void rockPaperScissors() {
		Random turn = new Random();
		int inPlay = turn.nextInt(3);
		
		if(inPlay == 0) {
			System.out.println("Rock!");
		} else if(inPlay == 1) {
			System.out.println("Paper!");
		} else if(inPlay == 2) {
			System.out.println("Scissors!");
		}
	}
	
	
	
	public static void sixSideDice() {
		Random rand = new Random();
		int count = 0;
		int sum = 0;
		
		while(sum != 7) {
			int diceOne = rand.nextInt(7);
			int diceTwo = rand.nextInt(7);
			sum = diceOne + diceTwo;
			System.out.println(diceOne + " + " + diceTwo + " = " + sum);
			count++;
		}
		
		System.out.println("You won after " + count + " tries.");
		
	}
}
	
