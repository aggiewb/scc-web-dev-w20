
public class WalkupTicket extends Ticket{
	private double price = 50;
	
	public WalkupTicket(int number){
		super(number);
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Number: " + super.getNumber() + ", Price: $" + getPrice();
	}

}
