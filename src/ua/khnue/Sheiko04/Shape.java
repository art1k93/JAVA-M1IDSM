package ua.khnue.Sheiko04;

/**
 * Class that describes Area() and getName() methods
 */
public abstract class Shape {
	double area;

	public void getName() {
		System.out.println("Unknown shape");
	}
	
	public abstract void Area();
}
