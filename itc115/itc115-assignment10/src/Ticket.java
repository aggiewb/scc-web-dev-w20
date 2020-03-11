
public abstract class Ticket {
	int number;
	int price;
	Ticket(int number){
		this.number = number;
	}
	public abstract double getPrice();
	public abstract String toString();
}
