
public class Hamburger {

	private String isim;
	private String ekmekCesidi;
	private String etCesidi;
	private double ucret;
	
	private String ilaveUrun1;
	private double ilaveUrunUcret1;
	private String ilaveUrun2;
	private double ilaveUrunUcret2;
	private String ilaveUrun3;
	private double ilaveUrunUcret3;
	private String ilaveUrun4;
	private double ilaveUrunUcret4;
	
	public void ilaveUrun1(String ad,double fiyat)
	{
		this.ilaveUrun1=ad;
		this.ilaveUrunUcret1=fiyat;
	}
	public void ilaveUrun2(String ad,double fiyat)
	{
		this.ilaveUrun2=ad;
		this.ilaveUrunUcret2=fiyat;
	}
	public void ilaveUrun3(String ad,double fiyat)
	{
		this.ilaveUrun3=ad;
		this.ilaveUrunUcret3=fiyat;
	}
	public void ilaveUrun4(String ad,double fiyat)
	{
		this.ilaveUrun4=ad;
		this.ilaveUrunUcret4=fiyat;
	}
	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public String getEkmekCesidi() {
		return ekmekCesidi;
	}


	public void setEkmekCesidi(String ekmekCesidi) {
		this.ekmekCesidi = ekmekCesidi;
	}


	public String getEtCesidi() {
		return etCesidi;
	}


	public void setEtCesidi(String etCesidi) {
		this.etCesidi = etCesidi;
	}


	public double getUcret() {
		return ucret;
	}


	public void setUcret(double ucret) {
		this.ucret = ucret;
	}


	public Hamburger(String isim, String ekmekCesidi, String etCesidi, double ucret) 
	{
		this.isim = isim;
		this.ekmekCesidi = ekmekCesidi;
		this.etCesidi = etCesidi;
		this.ucret = ucret;
	}
	
	public double hamburgerBilgileri()
	{
		double toplamUcret=ucret;
		System.out.println("Hamburger Çeþidi :"+this.isim
							+"\nEkmek Çeþidi :"+this.ekmekCesidi
							+"\nEt Çeþidi :"+this.etCesidi
							+"\nUcret :"+this.ucret);
		
		if(ilaveUrun1 != null)
		{
			System.out.println("Ýlave Urun "+this.ilaveUrun1);
			toplamUcret+=this.ilaveUrunUcret1;
		}
		if(ilaveUrun2 != null)
		{
			System.out.println("Ýlave Urun "+this.ilaveUrun2);
			toplamUcret+=this.ilaveUrunUcret2;
		}
		if(ilaveUrun3 != null)
		{
			System.out.println("Ýlave Urun "+this.ilaveUrun3);
			toplamUcret+=this.ilaveUrunUcret3;
		}
		if(ilaveUrun4 != null)
		{
			System.out.println("Ýlave Urun "+this.ilaveUrun4);
			toplamUcret+=this.ilaveUrunUcret4;
		}
		return toplamUcret;
	}
	
}
