package ua.khnue.Sheiko01;

import java.io.Console;

public class Task_1 {

	private double x; // main variable
	private double a; // raise to the a power
	private int dp; // decimal part

	Task_1() {

	}

	private void setX(double x) {
		this.x = x;
	}

	private void setA(double a) {
		this.a = a;
	}

	private void setDp(int dp) {
		this.dp = dp;
	}

	public double getX() {
		return this.x;
	}

	public double getA() {
		return this.a;
	}

	public int getDp() {
		return this.dp;
	}

	public void getValues(Console console) {
		System.out.print("x = ");
		x = Double.parseDouble(console.readLine());

		System.out.print("a = ");
		a = Double.parseDouble(console.readLine());

		System.out.print("decimal part = ");
		dp = Integer.parseInt(console.readLine());

		setX(x);
		setA(a);
		setDp(dp);
	}

	public String getFormatedY() {
		double Y, scnd_part;
		String equation_str;

		double x = getX();
		double a = getA();
		int dp = getDp();

		if (a < x) {
			equation_str = "[(1+ x^0.5) / (1+x^0.5)^2] + [1 + (x-a)^0.5]";
		} else {
			equation_str = "[(1+ x^0.5) / (1+x^0.5)^2] + [1 + (x^a)^0.5]";
		}

		scnd_part = (a >= x) ? 1 + Math.sqrt(Math.pow(x, a)) : 1 + Math.sqrt(x - a);
		if (Double.isNaN(scnd_part)) {
			throw new IllegalArgumentException("Y value can not be calculated. Second part of equation is invalid.");
		}

		Y = (1 + Math.sqrt(x)) / (Math.pow(1 + Math.sqrt(x), 2)) + scnd_part;
		if (Double.isNaN(Y)) {
			throw new IllegalArgumentException("Y value can not be calculated. First part of equation is invalid.");
		}
		String formatedY = String.format("Y(x = %." + dp + "f, a = %." + dp + "f) = %s =  %." + dp + "f", x, a,
				equation_str, Y);
		return formatedY;
	}

}
