
public class HavardLawyer extends Lawyer{
	public void showSalary() {
        System.out.println("My salary is $48,000.");
    }
	
	public void applyForVacation() {
        for(int i = 0; i < 3; i++) {
        	super.applyForVacation();
        }
    }
    
    public void showVacation() {
        System.out.println("I receive 3 weeks and 3 days vacation.");
    }
}
