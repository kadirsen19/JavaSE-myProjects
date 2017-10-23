
public class Personel implements Karsýlastýr {

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
			return "Asýl personelin yaþý parametredekinden büyüktür.";
		}
		else if(this.personelYasi < personel.personelYasi) {
			return "Asýl personelin yaþý parametredekinden küçüktür.";
		}
		else {
			return "Yaþlar   eþittir.";
		}
	}
	
}
