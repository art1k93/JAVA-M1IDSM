package ua.khnue.Sheiko04;

/**
 * Class that implements Area() and getName() methods for a circle
 */
public class Circle extends Shape implements IShape {
	double radius;

	public Circle(double r) {
		radius = r;
	}
	
	/* Methods provided by abstract class Shape */
	@Override
	public void getName() {
		System.out.println("Shape: circle");
	}

	public void Area() {
		area = Math.PI * Math.pow(radius, 2);
		System.out.printf("Area of a circle is : %s\n", area);
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
