//create instances of 2-3 different products
//use toString to display their data
import java.util.*;
public class ProductClient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Product[] newProducts = new Product[3];
		
		userInput(input, newProducts);
		userOutput(newProducts);
		input.close();
	}
	
	public static void userInput(Scanner console, Product[] newProducts) {
		for(int i = 0; i < 3; i++) {
			System.out.print("Please enter your product code and price: ");
			String productName = console.next();
			double price = console.nextDouble();
			newProducts[i] = new Product(productName, price);
			System.out.print("Enter the product description: ");
			String description = console.next();
			newProducts[i].setDescription(description); 
		}	
	}
	
	public static void userOutput(Product[] newProducts) {
		for(int j = 0; j < 3; j++) {
			System.out.println("Product number " + (j + 1) + " is " + newProducts[j]);
		}
	}
	
}
