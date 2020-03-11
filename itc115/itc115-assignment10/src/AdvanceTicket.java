
public class AdvanceTicket extends Ticket{
	private int days;

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

	public String toString() {
		return "Number: " + number + ", Price: $" + getPrice() + ", Purchased " + days + " days before event";
	}

}
