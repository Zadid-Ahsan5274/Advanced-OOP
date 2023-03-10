
public class Teacher extends User{
	
	public String designation;
	
	@Override
	public void login(String fName) {
		title = "";
		System.out.println("Special login for teachers");
	}

}
