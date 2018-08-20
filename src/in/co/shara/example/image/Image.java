package in.co.shara.example.image;

import java.awt.Color;

public class Image {
	public enum  Type { PNG, JPG, GIF };
	private byte[] data;
	private Type type;
	private String location;
	private Color[] pixelColors;
	private long numberOfPixels;
	
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public long getNumberOfPixels() {
		return numberOfPixels;
	}
	public void setNumberOfPixels(long numberOfPixels) {
		this.numberOfPixels = numberOfPixels;
	}
	public Color[] getPixelColors() {
		return pixelColors;
	}
	public void setPixelColors(Color[] pixelColors) {
		this.pixelColors = pixelColors;
	}

}
