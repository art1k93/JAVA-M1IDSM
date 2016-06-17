package ua.khnue.Sheiko08;

public class MathsCustom {
	
	/**
	 * Addition
	 * @param a - first summand
	 * @param b - second summand
	 * @return summ
	 */
	static int add(int a, int b) {
		return a + b;
	}

	/**
	 * Substaction
	 * @param a - minuend
	 * @param b - deduction
	 * @return difference
	 */
	static int subtract(int a, int b) {
		return a - b;
	}

	/**
	 * Division
	 * @param a - dividend
	 * @param b - divisor
	 * @return quotient
	 */
	static double divide(int a, int b) {
		return (double)a / b;
	}

	/**
	 * Division with remainder
	 * @param a - dividend
	 * @param b - divisor
	 * @return remainder
	 */
	static int getRemainder(int a, int b) {
		return a % b;
	}

	/**
	 * Multiplication
	 * @param a - first multiplier
	 * @param b - second multiplier
	 * @return product
	 */
	static int multiply(int a, int b) {
		return a * b;
	}

	/**
	 * Raise to the second power
	 * @param a - factor
	 * @param b - power
	 * @return result of involution
	 */
	static double involution(int a, int b) {
		return Math.pow(a, b);
	}
}
