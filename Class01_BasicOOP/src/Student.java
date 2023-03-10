
public class Student extends User {
	public double cgpa;

	public Student(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}

	public Student(String fName, String lName, String idNo) {
		firstName = fName;
		lastName = lName;
		//id = idNo;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

}
