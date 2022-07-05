
public class Student extends User{
	
	String universityName;
	String coursesTaken;
	
	public Student(int id,String name,String email, String universityName, String coursesTaken) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.universityName = universityName;
		this.coursesTaken = coursesTaken;
		
	}
	

}
