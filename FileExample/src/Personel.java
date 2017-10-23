
public class Personel {

	private String personelAdi;
	private String personelSoyadi;
	private int personelId;
	private int personelYasi;
	private String personelDepartman;
	
	public String getPersonelDepartman() {
		return personelDepartman;
	}

	public void setPersonelDepartman(String personelDepartman) {
		this.personelDepartman = personelDepartman;
	}

	public Personel() {
		this.personelAdi="Henüz girilmedi";
		this.personelSoyadi="Henüz girilmedi";
		this.personelYasi=0;
		this.personelId=0;
		this.personelDepartman="Henüz girilmedi ";
		
	}
	


	public Personel(String personelAdi, String personelSoyadi, int personelId, int personelYasi,
			String personelDepartman) {
		this.personelAdi = personelAdi;
		this.personelSoyadi = personelSoyadi;
		setPersonelYasi(personelYasi);
		setPersonelId(personelId);
		this.personelDepartman = personelDepartman;
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
	public int getPersonelId() {
		return personelId;
	}
	public void setPersonelId(int personelId) {
		if(personelId<0)
		{
			this.personelId=0;
		}
		this.personelId = personelId;
	}
	public int getPersonelYasi() {
		return personelYasi;
	}
	public void setPersonelYasi(int personelYasi) {
		if(personelYasi<0)
		{
			this.personelYasi=0;
		}
		this.personelYasi = personelYasi;
	}
	
}
