package in.co.shara.example.oops;

import in.co.shara.example.oops.components.Battery;
import in.co.shara.example.oops.components.Clutch;
import in.co.shara.example.oops.components.GearTrain;

public class Car implements Drive, Maintain {
	
	private Battery battery;
	private Clutch clutch;
	private GearTrain gearTrain;

	@Override
	public void changeGearOil() {
		System.out.println("Gear Oil Changed");
	}

	@Override
	public void checkCoolent() {
		System.out.println("Coolent Checked");
	}

	@Override
	public void changeBattery() {
		System.out.println("Battery Changed");
	}

	@Override
	public int changeGear(int gearNumber) {
		System.out.println("Gear Changed to " + gearNumber);
		return gearNumber;
	}

	@Override
	public void applyBreak(int level) {
		System.out.println("Break applied at level " + level);
	}

	@Override
	public void turnLeft() {
		System.out.println("Car Turning Left");
	}

	@Override
	public void turnRight() {
		System.out.println("Car Turning Right");
	}

	@Override
	public void accelerate(int level) {
		System.out.println("Car accelerated at level " + level);
	}

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}

	@Override
	public void applyClutch(int level) {
		System.out.println("Clutch applied at level " + level);
	}

}
