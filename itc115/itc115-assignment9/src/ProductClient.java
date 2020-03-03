//create instances of 2-3 different products
//use toString to display their data
import java.util.*;
public class ProductClient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Product[] newProducts = new Product[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Please enter your product name and price: ");
			String productName = input.next();
			double price = input.nextDouble();
			newProducts[i] = new Product(productName, price);
			System.out.print("Enter the product description: ");
			String description = input.next();
			newProducts[i].setDescription(description); 
		}
		
		for(int j = 0; j < 3; j++) {
			System.out.println("Product number " + (j + 1) + " is " + newProducts[j]);
		}
		
		input.close();
	}
}
