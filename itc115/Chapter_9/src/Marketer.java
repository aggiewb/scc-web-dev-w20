
public class Marketer extends Employee {
    public void showSalary() {
        System.out.printf("My salary is $%.2f", (super.getSalary() + 10000.00));
        System.out.println();
    }
    
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
    
}


