
public class Teacher extends User {
	public String designation;

	@Override
	public void login(String name) {
		title = "";
		System.out.println("Special login for teachers");
	}
}
