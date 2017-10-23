
public class Dikdortgen extends GeometrikSekil {

	private double en;
	private double boy;

	public Dikdortgen() {
		en = 0;
		boy = 0;

	}

	@Override
	public double alanHesapla() {

		return en * boy;
	}

	public Dikdortgen(double en, double boy) {

		setBoy(boy);
		setEn(en);
	}

	public double getEn() {
		return en;
	}

	public void setEn(double en) {
		if (en < 0)
			this.en = 0;
		else {
			this.en = en;
		}
	}

	public double getBoy() {
		return boy;
	}

	public void setBoy(double boy) {
		if (boy < 0)
			this.boy = 0;
		else {
			this.boy = boy;
		}
	}

}
