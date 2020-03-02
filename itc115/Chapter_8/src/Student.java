
public class Student {
	private String firstName;
	private String lastName;
	private int studentID;
	private String dateOfBirth;

	
	public Student(String lastName, String firstName, int studentID) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.studentID = studentID;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

}
