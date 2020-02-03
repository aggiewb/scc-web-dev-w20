
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
	
	

}
