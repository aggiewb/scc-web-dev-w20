
public abstract class Library {
	private int card;
	private int itemNumber;
	private String title;
	private boolean checkedIn;
	private int daysLate;
	private int daysAllowed;
	
	public Library(int card, int itemNumber) {
		this.itemNumber = itemNumber;
		this.card = card;
	}
	
	public int getCard() {
		return card;
	}
	
	public int getItemNumber() {
		return itemNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}

	public int getDaysLate() {
		return daysLate;
	}
	
	public int getDaysAllowed() {
		return daysAllowed;
	}

	public void setDaysAllowed(int daysAllowed) {
		this.daysAllowed = daysAllowed;
	}
	
	public boolean checkOut() {
		return this.checkedIn = true;
	}
	
	public boolean checkIn() {
		return this.checkedIn = false;
	}
	
	public double finesAccrued() {
		if(getDaysLate() < 10) {
		return getDaysLate() * 0.50;
		} else {
		return getDaysLate() * 1.50;
		}
	}
	
	public void checkoutPeriod() {
		System.out.println("The checkout period for " + getTitle() +  " is " + getDaysAllowed() + " days.");
	}
	

	public abstract String toString();

}
