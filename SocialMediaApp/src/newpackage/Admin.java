package newpackage;

class Admin extends User {

	String role;

	Admin(String username, String password, String role) {
		super(username, password);
		this.role = role;
	}

	@Override
	void displayProfile() {
		System.out.println("Your username is: " + Username + " and role is: " + role);
	}

}