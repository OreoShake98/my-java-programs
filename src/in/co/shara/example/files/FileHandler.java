package in.co.shara.example.files;
import java.io.*;

public class FileHandler {
	public static void main(String args[])throws Exception {
		if(args.length != 1) {
			System.out.println("File name missing...");
			System.out.println("Usage: FileHanlder <file-name>");
			return;
		}
		FileHandler handler = new FileHandler();
		handler.readFile(args[0]);
	}
	
	public void readFile(String fileName) throws IOException {
		  File file = new File(fileName);
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  String st;
		  while ((st = br.readLine()) != null)
		    System.out.println(st);
		  br.close();
	}
}
