 
public class Test {

	public static void main(String[] args) {

		GeometrikSekil gms = new GeometrikSekil();
		Kare kare = new Kare(5);
		Dikdortgen d1 = new Dikdortgen(2, 4);
		Daire dd1 = new Daire(5);
		GeometrikSekil[] sekillerDizisi = new GeometrikSekil[4];
		sekillerDizisi[0] = gms;
		sekillerDizisi[1] = kare;
		sekillerDizisi[2] = d1;
		sekillerDizisi[3] = dd1;

		CalculateArea(sekillerDizisi);
	}

	private static void CalculateArea(GeometrikSekil[] gms2) {
		for (GeometrikSekil geciciNesne : gms2) {
			System.out.println(geciciNesne.alanHesapla());
		}
	}

}
