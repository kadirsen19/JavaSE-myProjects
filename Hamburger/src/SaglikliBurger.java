
public class SaglikliBurger extends Hamburger{

	private String ilaveSagl�kl�UrunAdi1;
	private double ilaveSagl�kl�UrunUcreti1;
	
	private String ilaveSagl�kl�UrunAdi2;
	private double ilaveSagl�kl�UrunUcreti2;
	
	
	
	public String getIlaveSagl�kl�UrunAdi1() {
		return ilaveSagl�kl�UrunAdi1;
	}

	public void setIlaveSagl�kl�UrunAdi1(String ilaveSagl�kl�UrunAdi1) {
		this.ilaveSagl�kl�UrunAdi1 = ilaveSagl�kl�UrunAdi1;
	}

	public double getIlaveSagl�kl�UrunUcreti1() {
		return ilaveSagl�kl�UrunUcreti1;
	}

	public void setIlaveSagl�kl�UrunUcreti1(double ilaveSagl�kl�UrunUcreti1) {
		this.ilaveSagl�kl�UrunUcreti1 = ilaveSagl�kl�UrunUcreti1;
	}

	public String getIlaveSagl�kl�UrunAdi2() {
		return ilaveSagl�kl�UrunAdi2;
	}

	public void setIlaveSagl�kl�UrunAdi2(String ilaveSagl�kl�UrunAdi2) {
		this.ilaveSagl�kl�UrunAdi2 = ilaveSagl�kl�UrunAdi2;
	}

	public double getIlaveSagl�kl�UrunUcreti2() {
		return ilaveSagl�kl�UrunUcreti2;
	}

	public void setIlaveSagl�kl�UrunUcreti2(double ilaveSagl�kl�UrunUcreti2) {
		this.ilaveSagl�kl�UrunUcreti2 = ilaveSagl�kl�UrunUcreti2;
	}

	public SaglikliBurger( String etCesidi, double ucret) {
		super("Sagl�kl� Burger", "Kepekli Ekmek", etCesidi, ucret);
		
	}

	public void ekleSaglikliUrun1(String ad,double fiyat)
	{
		this.ilaveSagl�kl�UrunAdi1=ad;
		this.ilaveSagl�kl�UrunUcreti1=fiyat;
	}
	public void ekleSaglikliUrun2(String ad,double fiyat)
	{
		this.ilaveSagl�kl�UrunAdi2=ad;
		this.ilaveSagl�kl�UrunUcreti2=fiyat;
	}

	@Override
	public double hamburgerBilgileri() {
		
		
		double toplamUcret=super.hamburgerBilgileri();
		if(this.ilaveSagl�kl�UrunAdi1 != null)
		{
			toplamUcret+=this.ilaveSagl�kl�UrunUcreti1;
			System.out.println("�lave Sa�l�kl� Urun : "+this.ilaveSagl�kl�UrunAdi1+" �lave Sa�l�kl� Urun Fiyat� : "+this.ilaveSagl�kl�UrunUcreti1);
		}
		if(this.ilaveSagl�kl�UrunAdi2 != null)
		{
			toplamUcret+=this.ilaveSagl�kl�UrunUcreti2;
			System.out.println("�lave Sa�l�kl� Urun : "+this.ilaveSagl�kl�UrunAdi2+"�lave Sa�l�kl� Urun Fiyat� : "+this.ilaveSagl�kl�UrunUcreti2);
		}
		return toplamUcret;
	}


	
	
	
	
}
