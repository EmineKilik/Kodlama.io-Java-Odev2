package odev2;

public class StudentManager extends UserManager{
	@Override
	public void login(User user) {
		System.out.println(user.getName() + " ��renci Giri�i Ba�ar�l�.");
	}
	
	public void chooseCourse() {
		System.out.println("Kurs Se�ildi.");
	}

}
