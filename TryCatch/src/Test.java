
public class Test {

	public static void main(String[] args) {
		

		try {
			Person p1= new Person(5);
			System.out.println("Yas :"+p1.getYas());
			
			Person p2= new Person(-5);
			System.out.println("Yas :"+p2.getYas());
			
			Person p3= new Person(36);
			System.out.println("Yas :"+p3.getYas());
		} catch (Exception istisna) {
			
			System.out.println(istisna.getMessage());
			System.out.println(istisna.toString());
			
		}
		finally {
			Person p3= new Person(36);
			System.out.println("Yas :"+p3.getYas());
		}
		System.out.println("Main bitti !");
	}

}
