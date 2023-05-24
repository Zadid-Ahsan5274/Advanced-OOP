package newpackage;

import java.util.ArrayList;

class SocialMediaApp extends RegularUser {

	SocialMediaApp(String username, String password) {
		super(username, password);
	}

	ArrayList<User> Users = new ArrayList<User>();

	void addUser(User user) {
		try {
			Users.add(user);
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception caught");
		}
	}

	void removeUser(User user) {
		try {
			Users.remove(user);
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception caught");
		}
	}

	void displayAllUsers() {
		for (User user : Users) {
			System.out.println("Username is: " + user.Username);
		}
	}

	void displayUserPosts(String username) {
		try {
			for (String post : Posts) {
				System.out.println("Posts are: " + post);
			}
		} catch (Exception e) {
			System.out.println("User not found");
		}
	}

}