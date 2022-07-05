
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"cansu","cansu@gmail", "YTU" , "java");	
	

		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.name = "engin";
		instructor.email = "xxx@";
		instructor.courses ="java + react";
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		
	
		studentManager.add(student);
		userManager.login(student);
		userManager.login(instructor);
		instructorManager.updateCourse(instructor);
		
		

	}

}




