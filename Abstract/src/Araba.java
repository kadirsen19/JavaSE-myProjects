
public abstract class Araba {

	private int ag�rl�k ;
	private String model;
	private String renk;

	public int getAg�rl�k() {
		return ag�rl�k;
	}
	public void setAg�rl�k(int ag�rl�k) {
		this.ag�rl�k = ag�rl�k;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public abstract double yakitTuketimi();
	
}
