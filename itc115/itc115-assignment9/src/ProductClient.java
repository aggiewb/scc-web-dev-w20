//create instances of 2-3 different products
//use toString to display their data
import java.util.*;
public class ProductClient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your product name and price: ");
		String productName = input.next();
		double price = input.nextInt();
		
		while(productName != " ") {
			Product newProduct = new Product(productName, price);
			System.out.println("Product is " + newProduct);
			newProduct.getCount();
			productName = input.next();
			price = input.nextInt();
		}
		
		input.close();
	}
}
