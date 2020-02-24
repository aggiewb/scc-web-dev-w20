
public class PowerofTwo {
	public static void main(String[] args) {
		System.out.println(powerOfTwo(0));
		System.out.println(powerOfTwo(1));
		System.out.println(powerOfTwo(5));
		System.out.println(powerOfTwo(8));
	}
	
	public static boolean powerOfTwo(int num) {
		boolean isPowTwo = false;
		int pow = 0;
		
		while(pow <= num) {
			
			if(Math.pow(2, pow) == num) {
				isPowTwo = true;
				return isPowTwo;
			} else {
				pow++;
			}
		}	
		return isPowTwo;
	}

}
