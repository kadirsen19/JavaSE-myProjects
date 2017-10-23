
public class Dikdortgen {

	private int en;
	private int boy;
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
	public Dikdortgen() {

		this.boy = 3;
	}
	public double calculate()
	{
		return en*boy;
	}
}
