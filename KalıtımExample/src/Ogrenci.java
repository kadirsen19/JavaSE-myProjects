
public class Ogrenci extends Personel {

	private int ogrenciNo;
	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public Ogrenci(int ogrenciNo) {
		super();
		this.ogrenciNo = ogrenciNo;
	}

	public Ogrenci() {
		super();
		ogrenciNo=0;
	}

	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	@Override
	public String getKimlikBilgileri() {
		
		return super.getKimlikBilgileri()+"OgrenciNo :"+ogrenciNo;
	}

}
