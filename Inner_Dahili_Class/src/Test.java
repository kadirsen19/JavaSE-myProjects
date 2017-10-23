
public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main");
		String [] arrayString= {"kadir","can","ahmet"};
		int [] arrayInteger= {3,5,7};
		Test.Inner1 inner1= new Test().new Inner1();
		inner1.stringDiziYaz(arrayString);
		Test.Inner1.Inner2 inner2 =new Test().new Inner1().new Inner2();
		inner2.intDiziYaz(arrayInteger);
		/* 1-Accsess levellerin bir önemi yoltur(public,protected,default,private)
		 * 2-Çerçeve sýnýf içerisinden dahili sýnýflara eriþmek için ilk
		 * önce çerçeve sýnýfý içerisinden çagýrýlmasý gerekmektedir 
		 * yukarýda gösterildigi gibi.
		 * 
		 */
		
	}
	//main class içerisine bir dahili class tanýmlýyoruz
	public class Inner1{
		private void stringDiziYaz(String[] dizi) {
			for (String elemnet : dizi) {
				System.out.println("String Dizi :"+elemnet);
			}
		}
		//Dahili class içine bir class daha dahil ettik 
		protected class Inner2{
			private void intDiziYaz(int [] dizi) {
				for (int i : dizi) {
					System.out.println("Ýnteger Dizi :"+i);
				}
				String[] deneme= {"deneme"};
				stringDiziYaz(deneme);//Dahili class içinden Üst classdaki  metoda da ulaþýlýna bilir
			}
		}
	}
}
