import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MetinDosyasiOkuma {

	private Scanner scan;
	private Personel personelOku;
	public void dosyaAc() {
		try 
		{
			scan= new Scanner(new File("E:/personel.txt"));// Scanner s�n�f�ndan nesne olu�turup
														  // bu nesne C:/personel.txt dosyas�n� okumaktad�r.
		} 												 //Scanner s�n�f� okuma i�lemlerinde kullan�l�r.// 
		catch (FileNotFoundException e) 
		{
			System.out.println("Dosya bulunamad� !");
			e.printStackTrace();
		}
	}
	
	public void dosyaOku() {
		
		 personelOku= new Personel();
		
		try {
		
			while(scan.hasNext())//hasNext boolean deger d�ner dosyada okunacak veri varm� kontrolu yapar
			{					// olusturulan scan nesneleri ile veileri okuyup set yap�yoruz.
				
				
				personelOku.setPersonelAdi(scan.next());
				personelOku.setPersonelSoyadi(scan.next());
				personelOku.setPersonelId(scan.nextInt());
				personelOku.setPersonelYasi(scan.nextInt());
				personelOku.setPersonelDepartman(scan.next());
					
			}
			
			
		} catch (Exception e) {
			
			System.out.println("hata :"+e.toString());
			
		}
		
	}
	@Override
	public String toString() { //toString metodu ile verileri ekrana bast�r�yotuz
		
		return 	"Personelin Ad� :"+personelOku.getPersonelAdi()
				+"Personelin Soyad� :"+personelOku.getPersonelSoyadi()
				+"Perosnelin Ya�� :"+personelOku.getPersonelYasi()
				+"Peronelin Departman� :"+personelOku.getPersonelDepartman();
	}

	public void dosyaKapat() {
		
		if(scan != null)
		{
			scan.close();
		}
	}
	
}
