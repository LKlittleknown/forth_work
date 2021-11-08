package forth_work;
import java.util.*;
public class TotalArea {

	public static void main(String[] args) {
		Circle_new2[] circleArray;
		
		circleArray = createCircleArray();
	}
	
	public static Circle_new2[] createCircleArray() {
		Circle_new2[] circleArray = new Circle_new2[5];
		
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle_new2(Math.random() * 100);
		}
		
		return circleArray;
		
	}
	
	public static void printCircleArray(Circle_new2[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for(int i = 0; i < circleArray.length;i++) {
			System.out.printf("%->30f%-15f\n", circleArray[i].getRadius(),
					circleArray[i].getArea());
		}
		
		System.out.println("____________________________________");
		System.out.printf("%-30s%-15f\n", "The total area of circles is", 
				sum(circleArray));
		
	}
	
	public static double sum(Circle_new2[] circleArray) {
		double sum = 0;
		for(int i = 0; i < circleArray.length; i++) {
			sum+=circleArray[i].getArea();
		}
		return sum;
	}
	
}
