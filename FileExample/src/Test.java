import java.util.Scanner;

public class Test {
	private static Personel person = new Personel();
	private static MetinDosyaIslemleri mdi= new MetinDosyaIslemleri();
	private static Scanner scan = new Scanner(System.in);
	private static MetinDosyasiOkuma mdo = new MetinDosyasiOkuma();
	public static void main(String[] args) {
		
			mdi.dosyaAc();
			dosyaYaz();
			mdi.dosyaKapat();
			mdo.dosyaAc();
			mdo.dosyaOku();
			mdo.dosyaKapat();
			System.out.println("Personel Bilgileri :"); 
			System.out.println(mdo.toString());

	}

	public static void dosyaYaz()
	{
		System.out.println("Personel ID giriniz :");
		int personelId = scan.nextInt();
		
		System.out.println("Personel ad�n� giriniz :");
		String personelAdi = scan.next();
		
		System.out.println("Personel soyad�n� giriniz :");
		String personelSoyadi = scan.next();
		
		System.out.println("Personel ya�i giriniz :");
		int personelYasi = scan.nextInt();
		
		System.out.println("Personel departman� giriniz :");
		String personelDepartman = scan.next();
		
		person.setPersonelAdi(personelAdi);
		person.setPersonelId(personelId);
		person.setPersonelSoyadi(personelSoyadi);
		person.setPersonelYasi(personelYasi);
		person.setPersonelDepartman(personelDepartman);
		
		mdi.dosyayaYaz(person);
		
	}

}
