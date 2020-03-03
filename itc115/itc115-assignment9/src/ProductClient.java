//create instances of 2-3 different products
//use toString to display their data
import java.util.*;
public class ProductClient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Product[] newProducts = new Product[3];
		
		userInput(input, newProducts);
		userOutput(newProducts);
		addUserProductPrices(newProducts);
		
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
		for(int i = 0; i < 3; i++) {
			System.out.println("Product number " + (i + 1) + " is " + newProducts[i]);
		}
	}
	
	public static void addUserProductPrices(Product[] newProducts) {
		double price = 0;
		for(int i = 0; i < 3; i++) {
			price = newProducts[i].getPrice();
			Product.totalProductPrice(price);
		}
		
		System.out.println("The total price of all products is " + Product.getTotalPriceFormatted() + ".");
	}
	
}
