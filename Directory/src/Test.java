import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static int i=0;
	public static void main(String[] args) throws IOException {
	
	File directory = new File ("mydir");//Directory(klasör) oluşturur.
	directory.mkdir();
	
	File subdirectory = new File(directory,"subdir");
	subdirectory.mkdir();
	
	File file1 = new File(directory,"test1.txt");
	file1.createNewFile();
	
	File file2 = new File(directory,"test2.txt");
	file2.createNewFile();
	
	File file3 = new File(directory,"test3.txt");
	file3.createNewFile();
	
	File file4 = new File(directory,"test4.txt");
	file4.createNewFile();

	File []fileArray = directory.listFiles();//listFiles File objesi döner ve bunları
											//bir File Array de tutarak dosyalarımızın 
											//ne oldugunu yazdırabiliriz
	
	for (File file : fileArray) {//dosyalarımızı yazdırıyoruz
		i++;
		System.out.println((i)+".file -->"+" File name :"+file.getName()+" Path -->"+file.getAbsolutePath());
		
	}

	}

}
