
public class Student extends User{
	
	public double cgpa;
	
	public Student(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	public Student(String fName, String lName, int id) {
		firstName = fName;
		lastName = lName;
		//this.id = id;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}

}
