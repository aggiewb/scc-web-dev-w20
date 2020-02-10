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
		
		double [][] temp = new double [3][5];
		
		temp[0][0] = 98.3;
		temp[0][1] = 85.1;
		temp[0][2] = 77.4;
		temp[1][0] = 70.5;
		temp[1][1] = 88.9;
		temp[1][2] = 88.9;
		temp[2][0] = 88.9;
		temp[2][1] = 88.9;
		temp[2][2] = 88.9;
		
		System.out.println(temp[2][0]);

	}

}


