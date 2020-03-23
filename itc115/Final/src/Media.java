
public class Media extends Library{

	public Media(int card, int itemNumber) {
		super(card, itemNumber);
	}
	
	@Override
	public String toString() {
		return getTitle() + " " + getItemNumber() + " " + isCheckedIn();
	}
	
	public double finesAccrued() {
		if(getDaysLate() < 5) {
			return getDaysLate() * 2.50;
			} else {
				return getDaysLate() * 3.50;
				}
		}
}