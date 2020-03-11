
public class AdvanceTicket extends Ticket{
	private int days;
	private double price;

	public AdvanceTicket(int number, int days) {
		super(number);
		this.days = days;
	}

	public double getPrice() {
		if(this.days >= 10) {
			price = 30;
		} else {
			price = 40;
		}
		return price;
	}
	
	public int getDays() {
		return days;
	}

	public String toString() {
		return "Number: " + super.getNumber() + ", Price: $" + getPrice() + ", Purchased " + getDays() + " days before event";
	}

}
