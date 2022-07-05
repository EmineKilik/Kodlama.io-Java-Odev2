package odev2;

public class InstructorManager extends UserManager{
	@Override
	public void login(User user) {
		System.out.println(user.getName() + " Eðitmen Giriþi Baþarýlý.");
	}
	
	public void addLesson() {
		System.out.println("Ders Eklendi.");
	}

}
