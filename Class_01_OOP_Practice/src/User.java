
public class User {
	
	protected String title;
	public String firstName = "OutSide the method";
	public String lastName;
	private int id;
	
	public void login(String fName) {
		System.out.println(firstName);
		//fName = firstName;
		System.out.println("Normal Login");
		id = 1;
	}

}
