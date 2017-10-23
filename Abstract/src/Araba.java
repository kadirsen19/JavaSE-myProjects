
public abstract class Araba {

	private int agýrlýk ;
	private String model;
	private String renk;

	public int getAgýrlýk() {
		return agýrlýk;
	}
	public void setAgýrlýk(int agýrlýk) {
		this.agýrlýk = agýrlýk;
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
