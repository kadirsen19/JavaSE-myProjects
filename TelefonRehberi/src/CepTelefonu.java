import java.util.ArrayList;

public class CepTelefonu {


	private ArrayList<Kisi> rehber;
	private String myNumber;
	public CepTelefonu(String myNumber) {
		
		this.myNumber=myNumber;
		this.rehber=new ArrayList<Kisi>();
		
	}
	public boolean ekleYeniKisi(Kisi yeniKisi)
	{
		if(kisiBul(yeniKisi.getIsim()) >=0) {
			System.out.println(yeniKisi.getIsim()+"kiþi zaten rehberde mevcut");
			return false;
		}
			
		rehber.add(yeniKisi);
		return false;
	}
	public int kisiBul(Kisi aranacakKisi)
	{
		return this.rehber.indexOf(aranacakKisi);
	}
	public int kisiBul(String isim)
	{
		for (int i = 0; i < this.rehber.size(); i++) {
			Kisi kisi =this.rehber.get(i);
			if(kisi.getIsim().equals(isim))
				return i;
		}
		return -1;
	}
	public void rehber()
	{	
		if(this.rehber.size()==0)
		{
			System.out.println("Rehber Boþtur\n\n");
			return;
		}
		for (int i = 0; i < this.rehber.size(); i++) {
			System.out.println((i+1)+"--"+this.rehber.get(i).getIsim()+"-->"+this.rehber.get(i).getTelNo());
		}
	}
	public  boolean sil(Kisi silinecekKisi)
	{
		int position=kisiBul(silinecekKisi);
		if(position <0)
		{
			System.out.println("Silinecek Kisi Bulunamadý !");
			return false;
		}
		else {
			this.rehber.remove(silinecekKisi);
			return true;
		}

	}
	public Kisi kisiSorgula(String isim)
	{
		int pozition=kisiBul(isim);
		if(pozition >0)
		{
			return this.rehber.get(pozition);
		}
		return null;
	}
	public boolean kisiGuncelle(Kisi eskiKisi,Kisi yeniKisi)
	{
		int pozition=kisiBul(eskiKisi);
		if(pozition<0)
		{
			System.out.println("Kisi bulunamadý ");
			return false;
		}
		
		this.rehber.set(pozition, yeniKisi);
		return true;
	}

}
