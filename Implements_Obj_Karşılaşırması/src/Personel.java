
public class Personel implements Kars�last�r {

	private int personelYasi;

	
	
	public Personel() {
		
	}

	public Personel(int personelYasi) {
		
		this.personelYasi = personelYasi;
	}

	public int getPersonelYasi() {
		return personelYasi;
	}

	public void setPersonelYasi(int personelYasi) {
		this.personelYasi = personelYasi;
	}

	@Override
	public String karsilastir(Object nesne) {
		Personel personel= (Personel) nesne;
		if( this.personelYasi > personel.personelYasi)
		{
			return "As�l personelin ya�� parametredekinden b�y�kt�r.";
		}
		else if(this.personelYasi < personel.personelYasi) {
			return "As�l personelin ya�� parametredekinden k���kt�r.";
		}
		else {
			return "Ya�lar   e�ittir.";
		}
	}
	
}
