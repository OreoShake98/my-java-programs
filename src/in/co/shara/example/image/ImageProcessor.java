package in.co.shara.example.image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageProcessor {

	public static void main(String[] args) throws IOException {
		if(args.length < 2) {
			System.out.println("Usage: <inpit-file> <output-file>");
			return;
		}
		ImageProcessor imageProcessor = new ImageProcessor();
		byte[] readData = imageProcessor.readImage(args[0]);
		imageProcessor.writeImage(args[1], readData);
	}
	
	public byte[] readImage(String fileName) throws IOException {
		File imageFile = new File(fileName);
		InputStream imageStream = new FileInputStream(imageFile);
		long fileLength = imageFile.length();
		byte[] buffer = new byte[(int)fileLength];
		int response = imageStream.read(buffer);
		imageStream.close();
		return buffer;
	}
	
	public void writeImage(String fileName,byte[] data) throws IOException {
		OutputStream imageStream = new FileOutputStream(fileName);
		imageStream.write(data);
		imageStream.flush();
		imageStream.close();
	}

}
