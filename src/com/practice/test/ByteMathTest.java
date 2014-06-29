package com.practice.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.practice.ByteMath;

public class ByteMathTest {

	@Test(expected = IllegalArgumentException.class)
	public void testDivideExceptionIsThrown() {
		ByteMath.divide(7, 0);
	}

	@Test
	public void testDivide() {
		assertEquals("25 / 5 must equal 5", 5, ByteMath.divide(25, 5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMultiplyExceptionIsThrown() {
		ByteMath.multiply(-25, 5);
	}

	@Test
	public void testMultiply() {
		assertEquals("25 * 5 must equal 125", 125, ByteMath.multiply(25, 5));
	}

	@Test
	public void testAdd() {
		assertEquals("25 + (-5) must equal 20", 20, ByteMath.add(25, -5));
	}

}
