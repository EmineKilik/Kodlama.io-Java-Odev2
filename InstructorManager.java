package odev2;

public class InstructorManager extends UserManager{
	@Override
	public void login(User user) {
		System.out.println(user.getName() + " E�itmen Giri�i Ba�ar�l�.");
	}
	
	public void addLesson() {
		System.out.println("Ders Eklendi.");
	}

}
