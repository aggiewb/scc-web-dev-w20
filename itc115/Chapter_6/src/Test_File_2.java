import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test_File_2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner (new File("weather.txt"));
		double prev = input.nextDouble(); //fencepost
		
		while(input.hasNextDouble()) {
			double next = input.nextDouble();
			System.out.println(prev + " to " + next + ", change = " + (next - prev));
			prev = next;
		}

	}

}
