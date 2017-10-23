import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static int i=0;
	public static void main(String[] args) throws IOException {
	
	File directory = new File ("mydir");//Directory(klas�r) olu�turur.
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

	File []fileArray = directory.listFiles();//listFiles File objesi d�ner ve bunlar�
											//bir File Array de tutarak dosyalar�m�z�n 
											//ne oldugunu yazd�rabiliriz
	
	for (File file : fileArray) {//dosyalar�m�z� yazd�r�yoruz
		i++;
		System.out.println((i)+".file -->"+" File name :"+file.getName()+" Path -->"+file.getAbsolutePath());
		
	}

	}

}