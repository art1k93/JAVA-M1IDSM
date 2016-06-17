package ua.khnue.Sheiko04;

/**
 * Class that implements Area() and getName() methods for a square
 */
public class Square extends Shape implements IShape {
	double sideA, sideB;

	public Square(double a, double b) {
		sideA = a;
		sideB = b;
	}
	
	/* Methods provided by abstract class Shape */
	@Override
	public void getName() {
		System.out.println("Shape: square");
	}

	public void Area() {
		area = sideA * sideB;
		System.out.printf("Area of a square is : %s\n", area);
	}
	/* !Methods provided by abstract class Shape */
	
	
	
	/* Methods provided by interface IShape */
	public void AreaI() {
		getName();
	}
	
	public void getNameI() {
		Area();
	}
	/* !Methods provided by interface IShape */
}
