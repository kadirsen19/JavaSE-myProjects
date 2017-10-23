import java.io.Serializable;

public class PersonelIslemleri implements Serializable{

	private int personelId;
	private String personelAdi;
	private String personelSoyadi;
	private int personelYasi;
	
	
	public PersonelIslemleri() {
		personelId=0;
		personelAdi=null;
		personelSoyadi=null;
		personelYasi=0;
		
	}
	public PersonelIslemleri(int personelId, String personelAdi, String personelSoyadi, int personelYasi) {
		setPersonelId(personelId);
		this.personelAdi = personelAdi;
		this.personelSoyadi = personelSoyadi;
		setPersonelYasi(personelYasi);
	}
	public int getPersonelId() {
		return personelId;
	}
	public void setPersonelId(int personelId) {
		if(personelId<0)
		{
			this.personelId = 0;
		}
		
		this.personelId = personelId;
	}
	public String getPersonelAdi() {
		return personelAdi;
	}
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}
	public String getPersonelSoyadi() {
		return personelSoyadi;
	}
	public void setPersonelSoyadi(String personelSoyadi) {
		
		this.personelSoyadi = personelSoyadi;
	}
	public int getPersonelYasi() {
		return personelYasi;
	}
	public void setPersonelYasi(int personelYasi) {
		if(personelYasi<0)
		{
			this.personelYasi = 0;
		}
		this.personelYasi=personelYasi;
	}
	
	
	
}
