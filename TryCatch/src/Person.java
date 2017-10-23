
public class Person {

	private int yas;

	
	public Person() {
		this.yas=1;
	}
	public Person(int yas) {
		
		setYas(yas);
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		
		if(yas<0)
		{
			IllegalArgumentException istisna = new IllegalArgumentException("Personel yaşı negatif olamaz");
			throw istisna;
		}
		this.yas=yas;
	}

	
	
	
}
