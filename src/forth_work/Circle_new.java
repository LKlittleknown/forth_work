package forth_work;

public class Circle_new {
	double radius;
	
	static int numberOfObjects = 0;
	
	Circle_new() {
		radius = 1;
		numberOfObjects++;
	}
	
	Circle_new(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}	
}
