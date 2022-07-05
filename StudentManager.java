package odev2;

public class StudentManager extends UserManager{
	@Override
	public void login(User user) {
		System.out.println(user.getName() + " Öðrenci Giriþi Baþarýlý.");
	}
	
	public void chooseCourse() {
		System.out.println("Kurs Seçildi.");
	}

}
