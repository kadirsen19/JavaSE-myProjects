
public class Test {

	public static void main(String[] args) {
		
		Dikdortgen d1= new Dikdortgen(5,10);
		System.out.println(d1.calculate());
		
		cal2(d1);
		
		System.out.println(d1.calculate());
		System.out.println("en :"+d1.getEn()+"boy :"+d1.getBoy());
		System.out.println(d1.getEn());
	}

	private static void cal2(Dikdortgen d2) {
		
		d2.setBoy(2);
		d2.setEn(4);
		
	}

}
