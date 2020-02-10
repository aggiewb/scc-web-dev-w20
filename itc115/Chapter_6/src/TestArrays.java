import java.io.*;
import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		numbers[0] = 42;
		numbers[5] = 7;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i * i;
			System.out.print(numbers[i] + " ");
		}
		
		
		System.out.println();
		int[] testData = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(testData));

	}

}


