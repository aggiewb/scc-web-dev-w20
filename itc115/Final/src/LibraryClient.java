
public class LibraryClient {

	public static void main(String[] args) {
		checkOut();
		System.out.println();
		checkIn();
		System.out.println();
		addFee();
		System.out.println();
		setDaysAllowed();
	}
	
	public static void checkOut() {
		int card = 12345;
		Book firstBook = new Book(card, 1);
		firstBook.setTitle("Call of the Wild");
		firstBook.checkOut();
		System.out.println(firstBook);
		System.out.println();
		
		Magazine firstMagazine = new Magazine(card, 5);
		firstMagazine.setTitle("Vogue");
		firstMagazine.checkOut();
		System.out.println(firstMagazine);
		System.out.println();
		
		Video firstVideo = new Video(card, 10);
		firstVideo.setTitle("Pandemic");
		firstVideo.checkOut();
		System.out.println(firstVideo);
		System.out.println();
		
	}
	
	public static void checkIn() {
		int card = 12345;
		Book firstBook = new Book(card, 1);
		firstBook.setTitle("Call of the Wild");
		firstBook.checkIn();
		System.out.println(firstBook);
		
		Magazine firstMagazine = new Magazine(card, 1);
		firstMagazine.setTitle("Vogue");
		firstMagazine.checkIn();
		System.out.println(firstMagazine);
	}
	
	public static void addFee() {
		int card = 12345;
		Book firstBook = new Book(card, 1);
		firstBook.checkOut();
		firstBook.setDaysLate(5);
		firstBook.setTitle("Call of the Wild");
		System.out.println(firstBook);
		System.out.println("The book is " + firstBook.getDaysLate() + " days late, and the fine is $" + String.format("%.2f", firstBook.finesAccrued()));
		
		System.out.println();
		
		Magazine firstMagazine = new Magazine(card, 5);
		firstMagazine.setTitle("Vogue");
		firstMagazine.checkOut();
		firstMagazine.setDaysLate(10);
		System.out.println(firstMagazine);
		System.out.println("The book is " + firstMagazine.getDaysLate() + " days late, and the fine is $" + String.format("%.2f", firstMagazine.finesAccrued()));
		
		System.out.println();
		Video firstVideo = new Video(card, 14);
		firstVideo.setTitle("Pandemic");
		firstVideo.checkOut();
		System.out.println(firstVideo);
		
		for(int i = 0; i < 10; i++) {
			firstVideo.setDaysLate(i);
			System.out.println("The book is " + firstVideo.getDaysLate() + " days late, and the fine is $" + String.format("%.2f", firstVideo.finesAccrued()));
		}
	}
	
	public static void setDaysAllowed() {
		int card = 12345;
		Book firstBook = new Book(card, 1);
		firstBook.setTitle("Call of the Wild");
		firstBook.setDaysAllowed(14);
		firstBook.checkoutPeriod();
		
		DVD firstDVD = new DVD(card, 1);
		firstDVD.setTitle("Up");
		firstDVD.checkoutPeriod();
		firstDVD.setDaysAllowed(8);
		firstDVD.checkoutPeriod();
		
		DVD firstCD = new DVD(card, 1);
		firstCD.setTitle("Heartbreaker");
		firstCD.checkoutPeriod();
	}

}
