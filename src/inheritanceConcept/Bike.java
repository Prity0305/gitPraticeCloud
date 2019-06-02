package inheritanceConcept;

public class Bike {
	
	private int speed;
	private int gear;
	public Bike(int speed, int gear) {
		super();
		this.speed = speed;
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public int getGear() {
		return gear;
	}
	
	public void applyBrake(int decrement) {
		//speed = speed - decrement;
		speed -= decrement;
	}
	
	
	public void speedUp(int increment) {
		speed += increment;
	}
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", gear=" + gear + "]";
	}
	
	
	
	
	
	

}
