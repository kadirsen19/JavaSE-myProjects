
import java.util.ArrayList;


public class Test {

	public static void main(String[] args) 
	{
		
		String[] name= {"Kadir","CAn","AhMet"};
		String [] surname= {"�EN","Berbero�lu","Altun"};
		
		birlestir(name,surname);
	}
	
	public static void birlestir(String a[],String []b)
	{
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		for(int i=0;i<3;i++)
		{
			
			list.add((a[i]+b[i])+ " "+(int)(Math.random()*50));
			
		}
		yazd�r(list);
	}
	public static void yazd�r(ArrayList<String> list)
	{
		for (String e : list) 
		{
		System.out.println(e);	
		}
	}
	
}
