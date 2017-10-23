import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Test {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos = new FileOutputStream("test.txt");
		
		byte[]byteArray="sen kadir".getBytes();//Stream ler byte oriented dýr o yüzden byte Array tnaýmlandý
		 
		fos.write(byteArray);//Tanýmlanan byte array'i yazdýrma iþlemi.
		fos.close();
		
		FileInputStream fýs = new FileInputStream("test.txt");//Dosyadan okuma iþlemi için FileInputStream
	
		int i;
		int available;
		while((i=fýs.read())!=-1)
		{
			available =fýs.available();//karakter indisini tutmak için (available)
			char c =(char)i;
			System.out.print("Available :"+available);
			System.out.println(c);
		}
		
		fýs.close();//Tüm dosya iþlemlerinde okuma/yazma hepsinde dosya kapatma iþlemi yapýlmasý gereklidir
					//aksi halde bellekte açýk kalan dosyalar þiþmeye neden olabilir.
					

	}
	
}
