
public class Dikdortgen {

	private int en;
	private int boy;
	
	public Dikdortgen(int en, int boy) {
		super();
		this.en = en;
		this.boy = boy;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	
	public int getBoy() {
		return boy;
	}
	public void setBoy(int boy) {
		this.boy = boy;
	}
	public double  calculate()
	{
		return en*boy;
	}
}
