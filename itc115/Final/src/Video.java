
public class Video extends Media{

	public Video(int card, int itemNumber) {
		super(card, itemNumber);
	}
	
	@Override
	public String toString() {
		return getTitle() + " " + getItemNumber() + " " + isCheckedIn();
	}
	
	public boolean checkOut() {
		System.out.println("Please be kind and rewind.");
		return super.checkOut();
	}

}
