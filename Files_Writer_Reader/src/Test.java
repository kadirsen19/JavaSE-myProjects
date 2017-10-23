import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("kadir");
		bw.newLine();
		bw.write("Ahmet"); 
		bw.newLine();
		bw.write("can");
		
		bw.close();
		
		FileReader fr= new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String content = null;
		
		while ((content=br.readLine())!=null) {
			
			System.out.println(content);
			
		}
		br.close();
	}
}
