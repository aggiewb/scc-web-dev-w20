
public abstract class Ticket {
	int number;
	double price;
	
	Ticket(int number){
		this.number = number;
	}
	
	public abstract double getPrice();
	public abstract String toString();
}
