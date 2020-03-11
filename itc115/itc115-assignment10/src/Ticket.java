
public abstract class Ticket {
	int number;
	Ticket(int number){
		this.number = number;
	}
	public abstract double getPrice();
	public abstract String toString();
}
