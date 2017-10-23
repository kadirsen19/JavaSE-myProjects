import java.util.Scanner;

public class Test {
	private static CepTelefonu ceptelefonu = new CepTelefonu("555 555");
	private static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
	
		telefonuBaslat();
		menuyuGoster();
		boolean cikis=false;
		while(!cikis){
			System.out.println("Seçiniz (Menüyü görmek için 6 ya basýnýz.)");
			int secim=scan.nextInt();
			switch(secim)
			{
			case 0:
				System.out.println("Çýkýþ Yapýlýyor :\n");
				cikis=true;
				break;
			case 1:
				ceptelefonu.rehber();
				break;
			case 2:
				yeniKisiEkleMetodu();
				break;
			case 3:
				kisiSorgulamaMetodu();
				break;
			case 4:
				kisiSil();
				break;
			case 5:
				kisiGuncelle();
				break;
			case 6:
				menuyuGoster();
				break;
			default :
				System.out.println("Hatalý Tuþlama");
				break;
			}
		}

	}

	private static void kisiGuncelle() {
		System.out.println("Güncellenecek kiþinin adýný giriniz:");
		String degisecekIsým=scan.next();
		Kisi bulunanKisi =ceptelefonu.kisiSorgula(degisecekIsým);
		if(bulunanKisi == null)
		{
			System.out.println("Güncellenecek Kiþi bulunamadý !");
			return;
		}
		System.out.println("Güncellenecek kiþinin adýný giriniz:");
		String guncellenecekKisiAdi=scan.next();
		System.out.println("Güncellenecek kiþinin telefonunu giriniz:");
		String guncellenecekKisiTel=scan.next();
		ceptelefonu.kisiGuncelle(bulunanKisi, Kisi.olustur(guncellenecekKisiAdi, guncellenecekKisiTel));
	}

	private static void kisiSorgulamaMetodu() {
		System.out.println("Sorgulanacak kiþinin ismini giriniz :");
		String sorgulananKisi=scan.next();
		Kisi sorgulanacakKisiNesnesi=ceptelefonu.kisiSorgula(sorgulananKisi);
		if(sorgulanacakKisiNesnesi==null)
		{
			System.out.println("Bu isimde bir kayýt bulunamadý ! ");
			return ;
		}
		System.out.println("Bulunan Kisi :"+sorgulanacakKisiNesnesi.getIsim()
							+"ve Telefon Numarasý :"+sorgulanacakKisiNesnesi.getTelNo());
	}

	private static void kisiSil() {
		System.out.println("Silinecek kiþi ismi giriniz");
		String silinecekKisi=scan.next();
		Kisi bulunankisi=ceptelefonu.kisiSorgula(silinecekKisi);
		ceptelefonu.sil(bulunankisi);
		System.out.println(silinecekKisi+"-->baþarý ile silindi");
		
	}

	private static void kisiBul() {
		System.out.println("Aranacak kiþi ismi giriniz");
		String aranan=scan.next();
		if(ceptelefonu.kisiBul(aranan)>=0)
		{
			System.out.println("Kiþi bulundu -->"+aranan);
			return;
		}else {
			System.out.println("Kisi bulunamadý");
			
		}
	return;
	}

	private static void yeniKisiEkleMetodu() {
		
		System.out.println("Kiþinin Ad :\n");
		String isim=scan.next();
		System.out.println("Kiþinin Telefonu :\n");
		String telNo=scan.next();
		
		
		ceptelefonu.ekleYeniKisi(Kisi.olustur(isim, telNo));
	}

	private static void menuyuGoster() {
		
		System.out.println(	"********Menu********");
		System.out.println(	"0-- Çýkýþ\n"+
							"1-- Tüm Kiþileri Listele\n"+
							"2-- Yeni Kiþi Ekle\n"+
							"3-- Kiþi Sorgula\n"+
							"4-- Kiþi Sil\n"+
							"5-- Kiþi Güncelle\n"+
							"6-- Menüyü Göster\n");
		
	}

	private static void telefonuBaslat() {
	
		System.out.println("Telefon Baþlatýlýyor");
	}

}
