
public class DVD extends Media{

	public DVD(int card, int itemNumber) {
		super(card, itemNumber);
		this.setDaysAllowed(5);
	}
	
	@Override
	public String toString() {
		return getTitle() + " " + getItemNumber() + " " + isCheckedIn();
	}
	
	
	public void checkoutPeriod() {
		System.out.println("The checkout period for " + getTitle() +  " is " + getDaysAllowed() + " days.");
	}

}
