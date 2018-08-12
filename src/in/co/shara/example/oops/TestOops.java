package in.co.shara.example.oops;

public class TestOops {

	public static void main(String[] args) {
		Drive car1 = new HatchBackCar();
		Drive car2 = new SedanCar();
		Maintain car3 = (Maintain) car1;
		Maintain car4 = (Maintain) car2;
		Car car5 = new HatchBackCar();
		car1.turnLeft();
		car2.turnRight();
		car3.changeBattery();
		car4.changeGearOil();
		car5.turnLeft();
	}

}
