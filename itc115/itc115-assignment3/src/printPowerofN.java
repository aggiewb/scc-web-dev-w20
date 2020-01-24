public class printPowerofN {
	public static void main(String[] args) {
		printPowersOfN(2,7);   
		printPowersOfN(5,3);
		printPowersOfN(6, 9);
	}
	
	public static void printPowersOfN(int base, int exponent){
	    for(int i = 0; i < exponent + 1; i++){
	        double numberPowered = Math.pow(base, i);
	        System.out.print((int)numberPowered + " ");
	    }
	    System.out.println();
	}

}
