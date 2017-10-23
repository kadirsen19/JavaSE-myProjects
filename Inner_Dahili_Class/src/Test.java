
public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main");
		String [] arrayString= {"kadir","can","ahmet"};
		int [] arrayInteger= {3,5,7};
		Test.Inner1 inner1= new Test().new Inner1();
		inner1.stringDiziYaz(arrayString);
		Test.Inner1.Inner2 inner2 =new Test().new Inner1().new Inner2();
		inner2.intDiziYaz(arrayInteger);
		/* 1-Accsess levellerin bir �nemi yoltur(public,protected,default,private)
		 * 2-�er�eve s�n�f i�erisinden dahili s�n�flara eri�mek i�in ilk
		 * �nce �er�eve s�n�f� i�erisinden �ag�r�lmas� gerekmektedir 
		 * yukar�da g�sterildigi gibi.
		 * 
		 */
		
	}
	//main class i�erisine bir dahili class tan�ml�yoruz
	public class Inner1{
		private void stringDiziYaz(String[] dizi) {
			for (String elemnet : dizi) {
				System.out.println("String Dizi :"+elemnet);
			}
		}
		//Dahili class i�ine bir class daha dahil ettik 
		protected class Inner2{
			private void intDiziYaz(int [] dizi) {
				for (int i : dizi) {
					System.out.println("�nteger Dizi :"+i);
				}
				String[] deneme= {"deneme"};
				stringDiziYaz(deneme);//Dahili class i�inden �st classdaki  metoda da ula��l�na bilir
			}
		}
	}
}
