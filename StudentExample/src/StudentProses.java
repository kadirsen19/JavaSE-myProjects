import java.util.ArrayList;

public class StudentProses {

	ArrayList<Student> studentList = new ArrayList<Student>();
	
	public void showStudent() 
	{
	
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	public void addStudent(Student student) 
	{
	
		studentList.add(student);
	
	}
	
	public void removeStudent(Student student) {
		
		studentList.remove(student);
		
	}
	public  int findStudent(Student student)
	{
		return this.studentList.indexOf(student);
	}
	public boolean Student(String isim) 
	{
		
		
		return false;
	}
}
