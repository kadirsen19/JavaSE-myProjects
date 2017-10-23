
public class Test {

	public static void main(String[] args) {
		
		
		Hamburger hamburger = new Hamburger("Sade","Beyaz","Kýrmýzý Et",7.90);
		hamburger.ilaveUrun1("Kola", 2.90);
		hamburger.ilaveUrun2("patates Kýzartmasý", 3.40);
		hamburger.ilaveUrun3("Sos", 2.50);
		hamburger.ilaveUrun4("Sogan", 0.80);
		System.out.println("Toplam Ucret :"+hamburger.hamburgerBilgileri());
		System.out.println("*******Saglýklý Burger***********");
		SaglikliBurger sg= new SaglikliBurger("Beyaz",3.90);
		sg.ilaveUrun1("Kola", 2.90);
		sg.ilaveUrun2("patates Kýzartmasý", 3.40);
		sg.ilaveUrun3("Sos", 2.50);
		sg.ilaveUrun4("Sogan", 0.80);
		sg.ekleSaglikliUrun1("ton Baligi", 1.50);
		sg.ekleSaglikliUrun2("domates", 2.20);
		System.out.println("Toplam Ucret :"+sg.hamburgerBilgileri());
		System.out.println("******Baba Burger********");
		BabaBurger bg=new BabaBurger();
		System.out.println("Toplam Baba Burger Ucret :"+bg.hamburgerBilgileri());
		
	}	

}
