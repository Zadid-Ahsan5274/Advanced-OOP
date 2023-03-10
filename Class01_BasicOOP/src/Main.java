
public class Main {
	
	public static void start(Soldier soldier) {
		soldier.play();
	}
	
	public static void testMouse(IMouse mouse) {
		mouse.singleClick();
		mouse.doubleClick();
	}

	public static void main(String[] args) {

		/*
		 * System.out.println("Hello World!"); Student John = new Student();
		 * John.firstName = "John"; John.lastName = "Lachstar";
		 * System.out.println(John.getFullName());
		 * 
		 * Student Tom = new Student("Tom", "Cruise");
		 * System.out.println(Tom.getFullName());
		 * Student Tom1 = new Student("Tom1", "Cruise1",1);
		 * System.out.println(Tom1.getFullName());
		 * 
		 */

		User studentUser = new User();
		User teacherUser = new User();

		studentUser.login("John");
		teacherUser.login("Tom");

		User user1 = new User();
		User user = new User();
		user.login("James");
		
		//Soldier soldier = new AggressiveSoldier();
		Soldier soldier = new DefensiveSoldier();
		start(soldier);
		testMouse(new GamingMouse());
		testMouse(new NormalMouse());
	}

}
