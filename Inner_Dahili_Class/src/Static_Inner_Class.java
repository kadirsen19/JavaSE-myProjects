
public class Static_Inner_Class {

	public static  class Inner1{
		
		public   void integerGoster(String[] dizi)
		{
			for (String i : dizi) 
			{
				System.out.println("Integer-->"+i);
			}
			
		}
	}
	
	public static void main(String[] args) {
			
		String [] sayi= {"can","ahmet","kadir"};
		Inner1 inner1 = new Inner1();
		
		//inner1.integerGoster(sayi);
		inner1.integerGoster(sayi);
	}

}
