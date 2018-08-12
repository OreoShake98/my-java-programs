package in.co.shara.example.oops;

public interface Drive {
	public int changeGear(int gearNumber);
	public void applyBreak(int level);
	public void turnLeft();
	public void turnRight();
	public void accelerate(int level);
	public void start();
	public void stop();
	public void applyClutch(int level);
}
