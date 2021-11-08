package forth_work;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " +
				Circle_new.numberOfObjects);
		
		Circle_new c1 = new Circle_new();
		
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + 
				") and number of Circle objects (" +
				c1.numberOfObjects + ")");
		Circle_new c2 = new Circle_new(5);
		
		c1.radius = 9;
		
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + 
				") and number of Circle objects (" + 
				c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + 
				") and number of Circle objects (" + 
				c2.numberOfObjects + ")");
		
		
	}

}
