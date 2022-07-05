package odev2;


public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setName("Engin Demiroğ");
		instructor.setBranch("Java");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.addLesson();

		
		
		Student student = new Student();
		student.setId(2);
		student.setName("Emine Kilik");
		student.setEmail("eminekilik0106@gmail.com");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		studentManager.chooseCourse();


		
		UserManager userManager = new UserManager();
		User[] users = {instructor, student};
		userManager.logins(users);
		
		
		
		

	}

}
