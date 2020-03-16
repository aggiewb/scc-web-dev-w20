public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Employee:");
        Employee employee1 = new Employee();
        employee1.applyForVacation();
        employee1.showHours();
        employee1.showSalary();
        employee1.showVacation();
        System.out.println();
        
        System.out.println("Secretary:");
        Secretary employee2 = new Secretary();
        employee2.applyForVacation();
        employee2.showHours();
        employee2.showSalary();
        employee2.showVacation();
        employee2.takeDictation();
        System.out.println();
        
        System.out.println("Janitor: ");
        Janitor employee3 = new Janitor();
        employee3.applyForVacation();
        employee3.showHours();
        employee3.showSalary();
        employee3.showVacation();
        employee3.clean();
        System.out.println();
        
        System.out.println("Harvard Lawyer: ");
        HarvardLawyer employee4 = new HarvardLawyer();
        employee4.applyForVacation();
        employee4.showHours();
        employee4.showSalary();
        employee4.showVacation();
        employee4.sue();
        System.out.println();
    }
}
