import java.text.NumberFormat;

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
		return this.productCode + " " + getPriceFormatted();
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
	
	//track count of total products made
	public int getCount() {
		return productCount++;
	}

}
