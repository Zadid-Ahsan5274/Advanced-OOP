package newpackage;

abstract class User {
	String Username;
	String Password;

	User(String username, String password) {
		this.Username = username;
		this.Password = password;
	}

	abstract void displayProfile();
}