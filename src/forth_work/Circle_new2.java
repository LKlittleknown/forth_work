package forth_work;

public class Circle_new2 {
	private double radius = 1;
	
	private static int numberOfObjects = 0;
	
	public Circle_new2() {
		numberOfObjects++;
	}
	
	public Circle_new2(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNUmberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
