
public class Employee {
	public void applyForVacation() {
        System.out.println("Use the yellow form.");
    }
    
    public void showHours() {
        System.out.println("I work 40 hours per week.");
        
    }
    
    public void showSalary() {
        System.out.printf("My salary is $%.2f", getSalary());
        System.out.println();
    }
    
    public void showVacation() {
        System.out.println("I receive 2 weeks of vacation");
    }
    
    public static double getSalary() {
    	return 40000.00;
    }
}
