
public class WalkupTicket extends Ticket{
	public WalkupTicket(int number){
		super(number);
		price = 50;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Number: " + number + ", Price: $" + price;
	}

}
