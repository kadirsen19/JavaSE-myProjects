import java.util.ArrayList;

public class Student {

	private String studentName;
	private String studentSurname;
	private long studentNo;
	private ArrayList<String> lessons = new ArrayList<>() ;
	
	private Adress adress;
	
	
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentSurname=" + studentSurname + ", studentNo=" + studentNo
				+ ", lessons=" + lessons + ", adress=" + adress + "]";
	}
	public Student() {
		
	}
	public Student(String studentName, String studentSurname, long studentNo, ArrayList<String> lessons,Adress adress) {
		
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentNo = studentNo;
		this.lessons = lessons;
		this.adress=adress;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSurname() {
		return studentSurname;
	}
	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}
	public long getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(long studentNo) {
		this.studentNo = studentNo;
	}
	public ArrayList<String> getLessons() {
		return lessons;
	}
	public void setLessons(ArrayList<String> lessons) {
		this.lessons = lessons;
	}

	
}
