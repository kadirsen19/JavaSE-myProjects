
public class Personel {

	protected String adi;
	protected String soyadi;
	protected int yas;
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public Personel() {
		this.adi="HEnüz girilmedi";
		this.soyadi="Henüz girilmedi";
		this.yas=0;
		
	}
	public Personel(String adi, String soyadi, int yas) {

		this.adi = adi;
		this.soyadi = soyadi;
		this.yas = yas;
	}

	public String getKimlikBilgileri() 
	{
		
		return "Kimlik Bilgileri -->"+"Adý:"+adi+"Soyadi:"+soyadi+"Yas:"+yas;
	}
	
}
