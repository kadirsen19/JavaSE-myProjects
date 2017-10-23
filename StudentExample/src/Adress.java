
public class Adress {

	private String il;
	private String ilce;
	private String mahalle;
	private int no;
	

	public Adress() {
		
	}
	public Adress(String il, String ilce, String mahalle, int no) {

		this.il = il;
		this.ilce = ilce;
		this.mahalle = mahalle;
		this.no = no;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	public String getMahalle() {
		return mahalle;
	}
	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Adress [il=" + il + ", ilce=" + ilce + ", mahalle=" + mahalle + ", no=" + no + "]";
	}
	
}