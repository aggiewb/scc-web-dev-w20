
public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] e = { new Lawyer(), new Secretary(), new Marketer(), new LegalSecretary() };
		
		for (int i = 0; i < e.length; i++) {
			e[i].showSalary();
			e[i].showVacation();
			System.out.println();
		}
	}
}