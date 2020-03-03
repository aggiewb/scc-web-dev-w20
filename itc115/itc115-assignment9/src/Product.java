import java.text.NumberFormat;

public class Product {
	private String productCode;
	private String description;
	private double price;
	
	//constructor
	public Product(String productCode, double price) {
		if(price <= 0) {
			throw new IllegalArgumentException();
		}
		this.productCode = productCode;
		this.price = price;
	}
	
	//toString
	public String toString() {
		return this.productCode + " " + getPriceFormatted() + " " + description;
	}
	
	//getters
	public String getProductCode() {
		return this.productCode;
	}
	
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}
	
	//setter
	public void setDescription(String description) {
		this.description = description;
	}
	
}
