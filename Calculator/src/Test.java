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
		System.out.println("2-��karma");
		System.out.println("3-�arpma");
		System.out.println("4-Bolme");
		System.out.println("5-��k��");
		System.out.println();
		Scanner tara = new Scanner(System.in);
		int kullan�c�Secimi=0;
		System.out.println("Bir se�im yap�n�z:");
		kullan�c�Secimi=tara.nextInt();
		return kullan�c�Secimi;
	}
	public static void calculate(int x)
	{
		if(x != 5) 
		{
			Scanner tara = new Scanner(System.in);
			double s1=0;
			double s2=0;
			System.out.println("Birinci Say�y� giriniz:");
			s1=tara.nextDouble();
			System.out.println("�kinci Say�y� giriniz:");
			s2=tara.nextDouble();
			
				
				
				switch(x) {
				case 1:
					System.out.println(Toplama(s1,s2));
					break;
				case 2:
					System.out.println(C�karma(s1,s2));
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
	public static double C�karma(double s1,double s2)
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
