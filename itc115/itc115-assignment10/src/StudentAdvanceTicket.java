
public class StudentAdvanceTicket extends AdvanceTicket{
	private double price;
	
	public StudentAdvanceTicket(int number, int days) {
		super(number, days);
	}

	public double getPrice() {
		price = super.getPrice() / 2;
		return price;
	}
	

	public String toString() {
		return "Number: " + super.getNumber() + ", Price: $" + getPrice() + ", Purchased " + super.getDays() + " days before event. (STUDENT ID REQUIRED)";
	}
}
