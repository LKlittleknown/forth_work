package forth_work;

public class TestCIrcleWidthPrivateDataFields {

	public static void main(String[] args) {
		Circle_new2 myCircle = new Circle_new2(5.0);
		System.out.println("The area of the circle of radius " +
				myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is "
				 + Circle_new2.getNUmberOfObjects());

	}

}
