
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
		this.adi="HEn�z girilmedi";
		this.soyadi="Hen�z girilmedi";
		this.yas=0;
		
	}
	public Personel(String adi, String soyadi, int yas) {

		this.adi = adi;
		this.soyadi = soyadi;
		this.yas = yas;
	}

	public String getKimlikBilgileri() 
	{
		
		return "Kimlik Bilgileri -->"+"Ad�:"+adi+"Soyadi:"+soyadi+"Yas:"+yas;
	}
	
}
