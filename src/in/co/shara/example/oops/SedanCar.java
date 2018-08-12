package in.co.shara.example.oops;

public class SedanCar extends Car {
	@Override
	public void turnLeft() {
		System.out.println("Sedan Car Turning Left");
	}

	@Override
	public void turnRight() {
		System.out.println("Sedan Car Turning Right");
	}
}
