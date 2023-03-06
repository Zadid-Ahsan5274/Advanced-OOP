
public class Main {

	public static void main(String[] args) {

		/*
		 * System.out.println("Hello World!"); Student John = new Student();
		 * John.firstName = "John"; John.lastName = "Lachstar";
		 * System.out.println(John.getFullName());
		 * 
		 * Student Tom = new Student("Tom", "Cruise");
		 * System.out.println(Tom.getFullName());
		 */

		User studentUser = new User();
		User teacherUser = new User();

		studentUser.login("studentUser");
		teacherUser.login("teacherUser");

		User user1 = new User();
		User user = new User();
		user.login("James");
	}

}
