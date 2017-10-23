import java.util.Scanner;

public class Test {
	private static CepTelefonu ceptelefonu = new CepTelefonu("555 555");
	private static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
	
		telefonuBaslat();
		menuyuGoster();
		boolean cikis=false;
		while(!cikis){
			System.out.println("Se�iniz (Men�y� g�rmek i�in 6 ya bas�n�z.)");
			int secim=scan.nextInt();
			switch(secim)
			{
			case 0:
				System.out.println("��k�� Yap�l�yor :\n");
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
				System.out.println("Hatal� Tu�lama");
				break;
			}
		}

	}

	private static void kisiGuncelle() {
		System.out.println("G�ncellenecek ki�inin ad�n� giriniz:");
		String degisecekIs�m=scan.next();
		Kisi bulunanKisi =ceptelefonu.kisiSorgula(degisecekIs�m);
		if(bulunanKisi == null)
		{
			System.out.println("G�ncellenecek Ki�i bulunamad� !");
			return;
		}
		System.out.println("G�ncellenecek ki�inin ad�n� giriniz:");
		String guncellenecekKisiAdi=scan.next();
		System.out.println("G�ncellenecek ki�inin telefonunu giriniz:");
		String guncellenecekKisiTel=scan.next();
		ceptelefonu.kisiGuncelle(bulunanKisi, Kisi.olustur(guncellenecekKisiAdi, guncellenecekKisiTel));
	}

	private static void kisiSorgulamaMetodu() {
		System.out.println("Sorgulanacak ki�inin ismini giriniz :");
		String sorgulananKisi=scan.next();
		Kisi sorgulanacakKisiNesnesi=ceptelefonu.kisiSorgula(sorgulananKisi);
		if(sorgulanacakKisiNesnesi==null)
		{
			System.out.println("Bu isimde bir kay�t bulunamad� ! ");
			return ;
		}
		System.out.println("Bulunan Kisi :"+sorgulanacakKisiNesnesi.getIsim()
							+"ve Telefon Numaras� :"+sorgulanacakKisiNesnesi.getTelNo());
	}

	private static void kisiSil() {
		System.out.println("Silinecek ki�i ismi giriniz");
		String silinecekKisi=scan.next();
		Kisi bulunankisi=ceptelefonu.kisiSorgula(silinecekKisi);
		ceptelefonu.sil(bulunankisi);
		System.out.println(silinecekKisi+"-->ba�ar� ile silindi");
		
	}

	private static void kisiBul() {
		System.out.println("Aranacak ki�i ismi giriniz");
		String aranan=scan.next();
		if(ceptelefonu.kisiBul(aranan)>=0)
		{
			System.out.println("Ki�i bulundu -->"+aranan);
			return;
		}else {
			System.out.println("Kisi bulunamad�");
			
		}
	return;
	}

	private static void yeniKisiEkleMetodu() {
		
		System.out.println("Ki�inin Ad :\n");
		String isim=scan.next();
		System.out.println("Ki�inin Telefonu :\n");
		String telNo=scan.next();
		
		
		ceptelefonu.ekleYeniKisi(Kisi.olustur(isim, telNo));
	}

	private static void menuyuGoster() {
		
		System.out.println(	"********Menu********");
		System.out.println(	"0-- ��k��\n"+
							"1-- T�m Ki�ileri Listele\n"+
							"2-- Yeni Ki�i Ekle\n"+
							"3-- Ki�i Sorgula\n"+
							"4-- Ki�i Sil\n"+
							"5-- Ki�i G�ncelle\n"+
							"6-- Men�y� G�ster\n");
		
	}

	private static void telefonuBaslat() {
	
		System.out.println("Telefon Ba�lat�l�yor");
	}

}
