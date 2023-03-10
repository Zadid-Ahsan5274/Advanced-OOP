
public class User {

	protected String title;
	public String firstName = "Outside the method";
	public String lastName;
	private int id;

	public void login(String firstName) {
		System.out.println(firstName);
		this.firstName = firstName;
		//login through user and pwd
		System.out.println("Normal login");
		id = 10;
	}
}
