import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MetinDosyasiOkuma {

	private Scanner scan;
	private Personel personelOku;
	public void dosyaAc() {
		try 
		{
			scan= new Scanner(new File("E:/personel.txt"));// Scanner sýnýfýndan nesne oluþturup
														  // bu nesne C:/personel.txt dosyasýný okumaktadýr.
		} 												 //Scanner sýnýfý okuma iþlemlerinde kullanýlýr.// 
		catch (FileNotFoundException e) 
		{
			System.out.println("Dosya bulunamadý !");
			e.printStackTrace();
		}
	}
	
	public void dosyaOku() {
		
		 personelOku= new Personel();
		
		try {
		
			while(scan.hasNext())//hasNext boolean deger döner dosyada okunacak veri varmý kontrolu yapar
			{					// olusturulan scan nesneleri ile veileri okuyup set yapýyoruz.
				
				
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
	public String toString() { //toString metodu ile verileri ekrana bastýrýyotuz
		
		return 	"Personelin Adý :"+personelOku.getPersonelAdi()
				+"Personelin Soyadý :"+personelOku.getPersonelSoyadi()
				+"Perosnelin Yaþý :"+personelOku.getPersonelYasi()
				+"Peronelin Departmaný :"+personelOku.getPersonelDepartman();
	}

	public void dosyaKapat() {
		
		if(scan != null)
		{
			scan.close();
		}
	}
	
}
