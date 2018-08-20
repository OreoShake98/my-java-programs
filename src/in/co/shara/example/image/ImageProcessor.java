package in.co.shara.example.image;

import java.io.File;
import java.io.FileInputStream;
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
		Image image = imageProcessor.readImage(args[0]);
		imageProcessor.writeImage(image);
		Image.Type type = image.getType();
		if(type == Image.Type.PNG)
			System.out.println(" .png file ");
		else
			System.out.println(" not a .png file");
	}

	public Image readImage(String fileName) throws IOException {
		File imageFile = new File(fileName);
		InputStream imageStream = new FileInputStream(imageFile);
		long fileLength = imageFile.length();
		byte[] buffer = new byte[(int)fileLength];
		int response = imageStream.read(buffer);
		imageStream.close();
		Image image = new Image();
		image.setData(buffer);
		if(isPNGImage(image))
			image.setType(Image.Type.PNG);
		image.setLocation(fileName);
		return image;
	}

	public void writeImage(Image image) throws IOException {
		OutputStream imageStream = new FileOutputStream(image.getLocation());
		imageStream.write(image.getData());
		imageStream.flush();
		imageStream.close();
	}

	public boolean isPNGImage(Image image) throws IOException {
		int pngSignature[] = { 137,  80,  78,  71,  13,  10,  26,  10};
		byte[] buffer = image.getData();
		for(int i = 0; i<8; i++) {
			int j = buffer[i] & 0XFF;
			if(j != pngSignature[i])
				return false;
		}
		return true;
	}
	
	public long getNumberOfPixels(Image image) {
		// logic
		// set on image the number of pixels
		return 0L;
	}
	
	public void getImageColors(Image image) {
		long pixels = getNumberOfPixels(image);
	}
}
