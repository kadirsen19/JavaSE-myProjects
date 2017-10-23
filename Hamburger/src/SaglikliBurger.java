
public class SaglikliBurger extends Hamburger{

	private String ilaveSaglıklıUrunAdi1;
	private double ilaveSaglıklıUrunUcreti1;
	
	private String ilaveSaglıklıUrunAdi2;
	private double ilaveSaglıklıUrunUcreti2;
	
	
	
	public String getIlaveSaglıklıUrunAdi1() {
		return ilaveSaglıklıUrunAdi1;
	}

	public void setIlaveSaglıklıUrunAdi1(String ilaveSaglıklıUrunAdi1) {
		this.ilaveSaglıklıUrunAdi1 = ilaveSaglıklıUrunAdi1;
	}

	public double getIlaveSaglıklıUrunUcreti1() {
		return ilaveSaglıklıUrunUcreti1;
	}

	public void setIlaveSaglıklıUrunUcreti1(double ilaveSaglıklıUrunUcreti1) {
		this.ilaveSaglıklıUrunUcreti1 = ilaveSaglıklıUrunUcreti1;
	}

	public String getIlaveSaglıklıUrunAdi2() {
		return ilaveSaglıklıUrunAdi2;
	}

	public void setIlaveSaglıklıUrunAdi2(String ilaveSaglıklıUrunAdi2) {
		this.ilaveSaglıklıUrunAdi2 = ilaveSaglıklıUrunAdi2;
	}

	public double getIlaveSaglıklıUrunUcreti2() {
		return ilaveSaglıklıUrunUcreti2;
	}

	public void setIlaveSaglıklıUrunUcreti2(double ilaveSaglıklıUrunUcreti2) {
		this.ilaveSaglıklıUrunUcreti2 = ilaveSaglıklıUrunUcreti2;
	}

	public SaglikliBurger( String etCesidi, double ucret) {
		super("Saglıklı Burger", "Kepekli Ekmek", etCesidi, ucret);
		
	}

	public void ekleSaglikliUrun1(String ad,double fiyat)
	{
		this.ilaveSaglıklıUrunAdi1=ad;
		this.ilaveSaglıklıUrunUcreti1=fiyat;
	}
	public void ekleSaglikliUrun2(String ad,double fiyat)
	{
		this.ilaveSaglıklıUrunAdi2=ad;
		this.ilaveSaglıklıUrunUcreti2=fiyat;
	}

	@Override
	public double hamburgerBilgileri() {
		
		
		double toplamUcret=super.hamburgerBilgileri();
		if(this.ilaveSaglıklıUrunAdi1 != null)
		{
			toplamUcret+=this.ilaveSaglıklıUrunUcreti1;
			System.out.println("İlave Sağlıklı Urun : "+this.ilaveSaglıklıUrunAdi1+" İlave Sağlıklı Urun Fiyatı : "+this.ilaveSaglıklıUrunUcreti1);
		}
		if(this.ilaveSaglıklıUrunAdi2 != null)
		{
			toplamUcret+=this.ilaveSaglıklıUrunUcreti2;
			System.out.println("İlave Sağlıklı Urun : "+this.ilaveSaglıklıUrunAdi2+"İlave Sağlıklı Urun Fiyatı : "+this.ilaveSaglıklıUrunUcreti2);
		}
		return toplamUcret;
	}


	
	
	
	
}
