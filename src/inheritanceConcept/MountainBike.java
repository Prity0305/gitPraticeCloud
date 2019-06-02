package inheritanceConcept;

public class MountainBike extends Bike{
	private int height;

	public MountainBike(int speed, int gear, int height) {
		super(speed, gear);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return (super.toString()+" , MountainBike [height=" + height + "]");
	}
	
}
