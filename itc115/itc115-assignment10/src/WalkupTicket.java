
public class WalkupTicket extends Ticket{
	private double price;
	public WalkupTicket(int number){
		super(number);
		price = 50.0;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Number: " + number + ", Price: " + price;
		
	}

}
