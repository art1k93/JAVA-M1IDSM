package ua.khnue.Sheiko08;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathsCustomTest {

	int a = 5;
	int b = 2;
	int expected, actual;
	
	@Test
	public final void testAdd() {
		expected = 7;
		actual = MathsCustom.add(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public final void testSubtract() {
		expected = 3;
		actual = MathsCustom.subtract(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public final void testDivide() {
		double expected = 2.5;
		double actual = MathsCustom.divide(a, b);
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public final void testGetRemainder() {
		expected = 1;
		actual = MathsCustom.getRemainder(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public final void testMultiply() {
		expected = 10;
		actual = MathsCustom.multiply(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public final void testInvolution() {
		double expected = 25;
		double actual = MathsCustom.involution(a, b);
		assertEquals(expected, actual, 0.001);
	}

}
