package com.practice;

public class ByteMath {

	public static int divide(int numerator, int denominator) {
		if (numerator < 0 || denominator < 0) {
			throw new IllegalArgumentException("Positive numbers only");
		}
		if (denominator == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}

		int mask = 0x1;
		int quotient = 0;

		while (denominator <= numerator) {
			denominator <<= 1;
			mask <<= 1;
		}

		while (mask > 1) {
			denominator >>= 1;
			mask >>= 1;

			if (numerator >= denominator) {
				numerator -= denominator;
				quotient |= mask;
			}
		}

		return quotient;
	}

	public static int multiply(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("Positive numbers only");
		}
		int product = 0;
		while (a != 0) {
			if ((a & 1) == 1) {
				product = add(product, b);
			}
			a = a >> 1;
			b = b << 1;
		}
		return product;
	}

	public static int add(int x, int y) {
		int a, b;
		do {
			a = x & y;
			b = x ^ y;
			x = a << 1;
			y = b;
		} while (a != 0);
		return b;
	}

}
