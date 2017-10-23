import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableYazma  {

	private ObjectOutputStream write;
	
	public void dosyaAc()
	{
		try {
			FileOutputStream fileOut = new FileOutputStream("E:/personelSirializable.txt");
			write=new ObjectOutputStream(fileOut);

		} 
		
		catch (FileNotFoundException e) {
			e.toString();
			e.printStackTrace();
		}
		catch(Exception e){
			e.toString();
		}
		
	}
	public void dosyayaYaz()
	{
		
		PersonelIslemleri personel1= new PersonelIslemleri(1,"Kadir","SEN",25);
		PersonelIslemleri personel2= new PersonelIslemleri(2,"Ahmet","ALTUN",22);
		PersonelIslemleri personel3= new PersonelIslemleri(3,"Can","BERBEROGLU",23);
		
		try {
			
			write.writeObject(personel1);
			write.writeObject(personel2);
			write.writeObject(personel1);
			
		} catch (Exception e) {
			System.out.println("HataYazma-->"+e.toString());
		}
		
	}
	public void dosyaKapat()
	{
		if(write != null)
		{
			try {
				write.close();
			} catch (IOException e) {
				System.out.println("Dosya kapatma Hatasý :"+e.toString());
				e.printStackTrace();
			}
		}
	}
	
}
