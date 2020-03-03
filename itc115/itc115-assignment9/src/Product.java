
public class Product {
	private String productCode;
	private String description;
	private double price;
	private int productCount;
	
	//constructor
	public Product(String productCode, double price) {
		this.productCode = productCode;
		this.price = price;
	}
	
	//toString
	public String toString() {
		return this.productCode + " " + this.price;
	}
	
	//getters
	//setters
	//formatted output of price(use NumberFormat class)

}
