
public class Test {

	public static void main(String[] args) {
		
		Kare k1 = new Kare(7);
		Kare k2= new Kare(3);

		Personel p1= new Personel(25);
		Personel p2= new Personel(22);
		
		nesneKarşılasştır(k1, k2);
		nesneKarşılasştır(p1, p2);
		
	}
	public static void nesneKarşılasştır(Karsılastır k1 ,Karsılastır k2)
	{
		System.out.println("Nesne karşılaştırması-->"+k1.karsilastir(k2));
	}

}
