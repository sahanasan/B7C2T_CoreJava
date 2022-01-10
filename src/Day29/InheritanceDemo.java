package Day29;

class Bicycle {
	int gear;
	int speed;

	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	void applyBreak(int decrement) {
		speed -= decrement;
	}

	void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

}

class MountainBike extends Bicycle {
	int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	void adjustHeight(int value) {
		seatHeight = value;
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}

}

class RoadBike extends MountainBike {
	int tirewidth;

	public RoadBike(int gear, int speed, int tirewidth) {
		super(gear, speed,tirewidth);
		this.tirewidth = tirewidth;
	}

	void adjustwidth(int value) {
		tirewidth = value;
	}

	@Override
	public String toString() {
		return "RoadBike[tirewidth=" + tirewidth + ",gear=" + gear + ",speed=" + speed + "]";

	}

}

public class InheritanceDemo {

	public static void main(String[] args) {

		MountainBike bike = new MountainBike(5, 160, 10);
		bike.speedUp(10);
		bike.applyBreak(5);
		// bike.adjustHeight(4);
		System.out.println(bike.toString());
		RoadBike bikes = new RoadBike(6, 150, 20);
		
		System.out.println(bikes.toString());
	}
}
