
public class numArray {

	public static void main(String[] args) {
		int [] myArray = [0, 1, 2, 3, 4];
		
		for(int i = myArray.length; i < 0; i--) {
			myArray = myArray[i] + myArray;
			
		}

	}

}
