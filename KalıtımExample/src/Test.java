
public class Test {

	public static void main(String[] args) {
		
		Personel p1 =new Personel();
		
		System.out.println(p1.getKimlikBilgileri());
		System.out.println("******Parametreli Degerler************");
		
		p1.setAdi("Kadir");
		p1.setSoyadi("sen");
		p1.setYas(25);
		System.out.println(p1.getKimlikBilgileri());
		System.out.println("*********");
		
		Ogrenci ogr1= new Ogrenci();
		System.out.println(ogr1.getKimlikBilgileri());
		System.out.println("******Parametreli Degerler************");
		ogr1.setAdi("ahmet");
		ogr1.setSoyadi("altun");
		ogr1.setYas(22);
		ogr1.setOgrenciNo(1801);
		System.out.println(ogr1.getKimlikBilgileri());
		

	}

}
