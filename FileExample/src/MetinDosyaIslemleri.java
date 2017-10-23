import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MetinDosyaIslemleri  {

	private static PrintWriter yazici;
	
	

	public  void dosyaAc() {
		
		try {
			
			yazici= new PrintWriter("E:/personel.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	public  void dosyayaYaz(Personel personel1)
	{
		yazici.println(personel1.getPersonelAdi());
		yazici.println(personel1.getPersonelSoyadi());
		yazici.println(personel1.getPersonelYasi());
		yazici.println(personel1.getPersonelId());
		yazici.println(personel1.getPersonelDepartman());
		
	}
	
	public  void dosyaKapat()
	{
		
		yazici.close();
		
	}
}
