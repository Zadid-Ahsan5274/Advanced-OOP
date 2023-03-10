
public class Main {
	
	public static void testSoldier() {
		Soldier agg_soldier = new AggressiveSoldier();
		Soldier def_soldier = new DefensiveSoldier();
		agg_soldier.play();
		agg_soldier.fight();
		def_soldier.play();
		def_soldier.fight();
	}
	
	public static void testMouse(IMouse mouse) {
		mouse.rightClick();
		mouse.leftClick();
		mouse.singleClick();
		mouse.doubleClick();
	}

	public static void main(String[] args) {
		
		Student John = new Student("John","Lachstar");
		System.out.println(John.getFullName());
		Student Tom = new Student("Tom","Cruise");
		System.out.println(Tom.getFullName());
		Student Peter = new Student("Peter","Parker");
		System.out.println(Peter.getFullName());
		
		User student_user = new User();
		User teacher_user = new User();
		
		student_user.login("John");
		teacher_user.login("Tom");
		
		User another_student_user = new Student("Ahsan", "Nabi");
		User another_teacher_user = new Teacher();
		
		another_student_user.login("Annie");
		another_teacher_user.login("Veronica");
		
		testMouse(new NormalMouse());
		testMouse(new GamingMouse());
		testSoldier();

	}

}
