
public class Kare implements Kars�last�r {

	@Override
	public String karsilastir(Object nesne) {
		
		Kare k2= (Kare) nesne;
		if(this.alanHesapla()>k2.alanHesapla())
		{
			return "As�l karan�n alan� parametredekinden b�y�kt�r.";
		}
		else if(this.alanHesapla()<k2.alanHesapla()) {
			return "As�l karan�n alan� parametredekinden b�y�kt�r.";
		}
		else {
			return "alanlar e�ittir.";
		}
	}
	private double kenarUzunlugu;

	public Kare(double kenarUzunlugu) {
		
		this.kenarUzunlugu = kenarUzunlugu;
	}

	public double getKenarUzunlugu() {
		return kenarUzunlugu;
	}

	public void setKenarUzunlugu(double kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}
	public double alanHesapla() {
		return kenarUzunlugu*kenarUzunlugu;
	}




}
