
public class CD extends DVD{

	public CD(int card, int itemNumber) {
		super(card, itemNumber);
	}
	
	@Override
	public String toString() {
		return getTitle() + " " + getItemNumber() + " " + isCheckedIn();
	}

}
