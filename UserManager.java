package odev2;

public class UserManager {

	public void login(User user) {
		System.out.println(user.getName() + " Giri� Yapt�.");
	}

	public void logins(User[] users) {
		for (User user : users) {
			login(user);
		}
	}

}
