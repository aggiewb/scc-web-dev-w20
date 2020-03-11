
public class TicketClient {
	public static void main(String[] args) {
		WalkupTicket();
		System.out.println();
		AdvanceTicket();
		System.out.println();
		StudentAdvanceTicket();
	}
	
	public static void WalkupTicket() {
		for(int i = 1; i <= 3; i++) {
			WalkupTicket ticket = new WalkupTicket(i);
			System.out.println(ticket);
		}
	}
	
	public static void AdvanceTicket() {
		int days = 0;
		for(int i = 1; i <= 5; i++) {
			AdvanceTicket ticket = new AdvanceTicket(i, days);
			System.out.println(ticket);
			days+=5;
		}
	}
	
	public static void StudentAdvanceTicket() {
		int days = 0;
		for(int i = 1; i <= 5; i++) {
			StudentAdvanceTicket ticket = new StudentAdvanceTicket(i, days);
			System.out.println(ticket);
			days+=5;
		}
	}

}
