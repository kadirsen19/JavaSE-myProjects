import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Test {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos = new FileOutputStream("test.txt");
		
		byte[]byteArray="sen kadir".getBytes();//Stream ler byte oriented d�r o y�zden byte Array tna�mland�
		 
		fos.write(byteArray);//Tan�mlanan byte array'i yazd�rma i�lemi.
		fos.close();
		
		FileInputStream f�s = new FileInputStream("test.txt");//Dosyadan okuma i�lemi i�in FileInputStream
	
		int i;
		int available;
		while((i=f�s.read())!=-1)
		{
			available =f�s.available();//karakter indisini tutmak i�in (available)
			char c =(char)i;
			System.out.print("Available :"+available);
			System.out.println(c);
		}
		
		f�s.close();//T�m dosya i�lemlerinde okuma/yazma hepsinde dosya kapatma i�lemi yap�lmas� gereklidir
					//aksi halde bellekte a��k kalan dosyalar �i�meye neden olabilir.
					

	}
	
}
