
public class LegalSecretary extends Secretary{

    public LegalSecretary() {
        super();
    }

    public void showSalary() {
        System.out.printf("My salary is $%.2f", (super.getSalary() + 5000.00));
        System.out.println();
        
    }
    
    public void fileLegalBriefs() {
        System.out.println("I can file all day!");
    }
    
    
}