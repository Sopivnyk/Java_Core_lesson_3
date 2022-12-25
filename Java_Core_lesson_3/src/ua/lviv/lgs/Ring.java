package ua.lviv.lgs;

public class Ring {

	private double radius;
	private double diameter;
	
	
	Ring(){
		this.radius = 80;
		this.diameter = 160;
	}


	@Override
	public String toString() {
		return "Ring [radius=" + radius + ", diameter=" + diameter + "]";
	}
	
	public double RingLenght() {
		return 2*3.14*radius;
		
	}
	
	public double RingArea() {
		return 0.25 * 3.14 * diameter * diameter;
	}
	
}
