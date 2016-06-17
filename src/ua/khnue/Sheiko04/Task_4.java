package ua.khnue.Sheiko04;

public class Task_4 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4);
		Circle circle = new Circle(10.2);
		Square square = new Square(2.5, 3);
		
		System.out.println("Methods provided by abstract class \"Shape\" work");
		triangle.getName();
		triangle.Area();
		circle.getName();
		circle.Area();
		square.getName();
		square.Area();
		
		System.out.println("\n\n------------------------------------------\n\n");
		
		System.out.println("Methods provided by interface \"IShape\" work");
		triangle.getNameI();
		triangle.AreaI();
		circle.getNameI();
		circle.AreaI();
		square.getNameI();
		square.AreaI();
	}
}
