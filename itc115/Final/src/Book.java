
public class Book extends Library{

	public Book(int card, int itemNumber) {
		super(card, itemNumber);
	}

	@Override
	public String toString() {
		return getTitle() + " " + getItemNumber() + " " + isCheckedIn();
	}


}
