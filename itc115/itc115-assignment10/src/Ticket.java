
public abstract class Ticket {
	private int number;
	
	public Ticket(int number){
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public abstract double getPrice();
	public abstract String toString();
}
