
import java.util.ArrayList;


public class Test {

	public static void main(String[] args) 
	{
		
		String[] name= {"Kadir","CAn","AhMet"};
		String [] surname= {"ÞEN","Berberoðlu","Altun"};
		
		birlestir(name,surname);
	}
	
	public static void birlestir(String a[],String []b)
	{
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		for(int i=0;i<3;i++)
		{
			
			list.add((a[i]+b[i])+ " "+(int)(Math.random()*50));
			
		}
		yazdýr(list);
	}
	public static void yazdýr(ArrayList<String> list)
	{
		for (String e : list) 
		{
		System.out.println(e);	
		}
	}
	
}
