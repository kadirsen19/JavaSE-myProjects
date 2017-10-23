import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		int secim=menu();
		calculate(secim);
	
	}


	public static int  menu()
	{
		
		System.out.println("************Menu*************");
		System.out.println("1-Toplama");
		System.out.println("2-Çýkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bolme");
		System.out.println("5-Çýkýþ");
		System.out.println();
		Scanner tara = new Scanner(System.in);
		int kullanýcýSecimi=0;
		System.out.println("Bir seçim yapýnýz:");
		kullanýcýSecimi=tara.nextInt();
		return kullanýcýSecimi;
	}
	public static void calculate(int x)
	{
		if(x != 5) 
		{
			Scanner tara = new Scanner(System.in);
			double s1=0;
			double s2=0;
			System.out.println("Birinci Sayýyý giriniz:");
			s1=tara.nextDouble();
			System.out.println("Ýkinci Sayýyý giriniz:");
			s2=tara.nextDouble();
			
				
				
				switch(x) {
				case 1:
					System.out.println(Toplama(s1,s2));
					break;
				case 2:
					System.out.println(Cýkarma(s1,s2));
					break;
				
				case 3:
					System.out.println(Carpma(s1,s2));
						break;
				case 4:
					System.out.println(Bolme(s1,s2));
					break;
				
				
			}
		}
		
		
	}
	public static double Toplama(double s1,double s2)
	{
		
		return s1+s2;
		
	}
	public static double Cýkarma(double s1,double s2)
	{
		
		return s1-s2;	
	}
	public static double Carpma(double x,double y)
	{
		
		return x*y;	
	}
	public static double Bolme(double x,double y)
	{
		
		return x/y;	
	}
}
