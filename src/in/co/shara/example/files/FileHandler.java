package in.co.shara.example.files;
import java.io.*;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class FileHandler {
	public static void main(String args[])throws Exception {
		if(args.length != 1) {
			System.out.println("File name missing...");
			System.out.println("Usage: FileHanlder <file-name>");
			return;
		}
		FileHandler handler = new FileHandler();
		handler.readCSVFile(args[0]);
	}

	public void readFile(String fileName) throws IOException {
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
}
