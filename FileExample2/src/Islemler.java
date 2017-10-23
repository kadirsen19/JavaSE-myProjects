import java.io.File;

public class Islemler {

	private String konum;

	
	
	public Islemler(String konum) {
	
		this.konum = konum;
	}

	public String getKonum() {
		return konum;
	}

	public void setKonum(String konum) {
		this.konum = konum;
	}
	public void dosyaKlasorIslemleri() {
		File dosyaKlasor= new File(konum);
		if(dosyaKlasor.exists())
		{
				System.out.println(dosyaKlasor.getName()+" isimli bir dosya bulunmaktad�r.");
			
			if(dosyaKlasor.isFile())
			{
				System.out.println("Belirtilen konumdaki nesne bir dosyad�r."+" Dosya ismi :"+dosyaKlasor.getName());
			}
			else {
				System.out.println("Belirtilen adresteki nesne dosya de�ildir");
			}
	
			if(dosyaKlasor.isDirectory())
			{
				System.out.println("konumdaki nesne bir klasord�r.");
				System.out.println("Boyutu :"+dosyaKlasor.length());
				System.out.println("Konumu :"+dosyaKlasor.getAbsolutePath());
				
				for (String dosyaIsmi : dosyaKlasor.list()) {
					System.out.println(dosyaIsmi);
				}
				
			}
		
		}
		if(dosyaKlasor.exists()==false)
		{
		System.out.println("Belirtilen adreste--> "+konum+" isimli nesne bulunamad� !");
		}
	}
}