
public class Test {

	public static void main(String[] args) {
		
		Kare k1 = new Kare(7);
		Kare k2= new Kare(3);

		Personel p1= new Personel(25);
		Personel p2= new Personel(22);
		
		nesneKar��las�t�r(k1, k2);
		nesneKar��las�t�r(p1, p2);
		
	}
	public static void nesneKar��las�t�r(Kars�last�r k1 ,Kars�last�r k2)
	{
		System.out.println("Nesne kar��la�t�rmas�-->"+k1.karsilastir(k2));
	}

}
