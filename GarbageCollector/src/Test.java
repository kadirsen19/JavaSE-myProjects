
class Deneme
{
	
	String name;
	String surname;
	
	public Deneme(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Deneme [name=" + name + ", surname=" + surname + "]";
	}
	



}


public class Test {

	public static void main(String[] args) {
		
		Deneme dnm = new Deneme("Kadir","ÞEN");
		
		Deneme dnm2=dnm;
		
		System.out.println(dnm.toString());
		
		dnm=null;

		System.out.println(dnm2.toString());
		
	}

}
