
public abstract class Test {

	public static void main(String[] args) {
		
		Araba bmw= new BMW();
		bmw.setModel("520d");
		bmw.setRenk("Beyaz");
		bmw.setAg�rl�k(2000);
		goster(bmw);
		System.out.println("*********************");
		Araba honda = new Honda();
		honda.setModel("Civic");
		honda.setRenk("S�yah");
		honda.setAg�rl�k(1500);
		
		goster(honda);
	}

	private static void goster(Araba nesne) {
		
		System.out.println("Araba : "+nesne.getModel());
		System.out.println("Araba : "+nesne.getRenk());
		System.out.println("Araba : "+nesne.getAg�rl�k());
		System.out.println("Araba : "+nesne.yakitTuketimi());
		
	}

}
