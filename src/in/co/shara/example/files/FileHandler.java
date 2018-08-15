package in.co.shara.example.files;
import java.io.*;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class FileHandler {

	public static void main(String args[])throws Exception {
		if(args.length == 0) {
			System.out.println("File name missing...");
			System.out.println("Usage: FileHanlder <input-file-name> <output-file-name>");
			return;
		}
		FileHandler handler = new FileHandler();
		byte[] buffer = handler.readFile(args[0]);
		System.out.println("File content is as below - ");
		for(byte data : buffer) {
			System.out.print(data + " ");
		}
		handler.writeFile(args[1], buffer,false);
	}

	public void printFile(String fileName) throws IOException {
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
		br.close();
	}

	public List<String[]> readCSVFile(String fileName) throws IOException {
		final CSVParser parser =
				new CSVParserBuilder()
				.withSeparator(',')
				.withIgnoreQuotations(true)
				.build();
		final CSVReader reader =
				new CSVReaderBuilder(new FileReader(fileName))
				.withSkipLines(1)
				.withCSVParser(parser)
				.build();
		List<String[]> myEntries = reader.readAll();	
		for(String[] myEntry : myEntries) {
			for(String field : myEntry) {
				System.out.println("Field value is " + field);
			}
		}
		reader.close();
		return myEntries;
	}

	public byte[] readFile(String fileName) throws IOException {
		File fileHandle = new File(fileName);
		int fileLength = (int) fileHandle.length();
		System.out.println("File length is " + fileLength);
		FileReader reader = new FileReader(fileHandle);
		byte[] buffer = new byte[fileLength];
		int position = 0;
		while(reader.ready()) {
			buffer[position] = (byte) reader.read();
			position++;
		}
		reader.close();
		return buffer;
	}


	public void writeFile(String fileName, byte[] data, boolean append) throws IOException {
		File fileHandle = new File(fileName);
		FileWriter writer = new FileWriter(fileHandle,append);
		int position = 0;
		while(position < data.length) {
			writer.write(data[position]);
			position++;
		}
		writer.flush();
		writer.close();
	}
}
