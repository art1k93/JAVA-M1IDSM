package ua.khnue.Sheiko04;

/**
 * Class that implements Area() and getName() methods for a triangle
 */
public class Triangle extends Shape implements IShape {
	double altitude, side;

	public Triangle(double a, double s) {
		altitude = a;
		side = s;
	}
	
	/* Methods provided by abstract class Shape */
	@Override
	public void getName() {
		System.out.println("Shape: triangle");
	}

	public void Area() {
		area = 0.5 * altitude * side;
		System.out.format("Area of a triangle is : %s\n", area);
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
