package com.practice.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.practice.ByteMath;

@RunWith(Parameterized.class)
public class ByteMathParameterizedTest {
	int a, b;
	
	public ByteMathParameterizedTest(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// creates the test data
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { {25, 5}, {4, 7}, {0, 2}, {3, 3} };
		return Arrays.asList(data);
	}

	@Test
	public void testMultiply() {
		assertEquals(a * b, ByteMath.multiply(a, b));
	}
	
	@Test
	public void testDivide() {
		assertEquals(a / b, ByteMath.divide(a, b));
	}

}
