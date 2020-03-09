
public class Lawyer extends Employee{

    public void applyForVacation() {
        System.out.println("Use the pink vacation form.");
    }
    
    public void showVacation() {
        System.out.println("I receive 3 weeks vacation");
    }
    
    public void showSalary() {
        System.out.printf("My salary is $%.2f", (super.getSalary() + 60000.00));
        System.out.println();
    }
    
    public void sue() {
        System.out.println("I'll see you court!");
    }
}
