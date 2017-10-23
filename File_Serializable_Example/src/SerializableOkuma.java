import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableOkuma {

	private ObjectInputStream read;
	public void dosyaAc()
	{
		try {
			FileInputStream fileInput= new FileInputStream("E:/personelSirializable.txt");
			
		
			read= new ObjectInputStream(fileInput);
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(Exception e){
			
			System.out.println("HataOkuma -->"+e.toString());
		}
		
	}
	public void dosyaOku() {
		
		PersonelIslemleri okuma;
		try {
			while(true)
			{
				okuma=(PersonelIslemleri) read.readObject();
				
				System.out.println	("Personel ID-->"+okuma.getPersonelId()+
									"/nPersonel Adý-->"+okuma.getPersonelAdi()+
									"/nPersonel Soyadi-->"+okuma.getPersonelSoyadi()+
									"/nPersonel Yaþý-->"+okuma.getPersonelYasi());
			
			}
			
		  
			
		} 
		catch(EOFException e) {
			return;
		}
		catch (IOException e) 
		{
			System.out.println(e.toString());
		}
		catch(ClassNotFoundException e) {
			System.out.println("dosyabulunamdý-->"+e.toString());
		}
		
		
	}
	public void dosyaKapat()
	{
		
			try {
				if(read != null)
				{
				read.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}
	
	
}
