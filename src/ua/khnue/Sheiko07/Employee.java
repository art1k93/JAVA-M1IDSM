package ua.khnue.Sheiko07;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 867261210678767823L;
	
	String lastName;
	double rawSalary, withheld, netSalary;
	final static double TAX_PERCENT = 0.22; // % ЕСВ

	public Employee(String ln, double s) {
		lastName = ln;
		rawSalary = s;
		setWithheld();
		setNetSalary();
	}
	
	public void setWithheld() {
		withheld = rawSalary * TAX_PERCENT;
	}

	public void setNetSalary() {
		netSalary = rawSalary - withheld;
	}

	public String getLastName() {
		return lastName;
	}

	public double getRawSalary() {
		return rawSalary;
	}

	public double getWithheld() {
		return withheld;
	}

	public double getNetSalary() {
		return netSalary;
	}

	@Override
	public String toString() {
		return getLastName() + "\t" + getRawSalary() + "\t" + getWithheld() + "\t" + getNetSalary();
	}

}
