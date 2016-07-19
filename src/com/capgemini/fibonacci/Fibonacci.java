package com.capgemini.fibonacci;

/**
 * @author PWOJTKOW
 *
 *
 *         F1 F2 F3 F4 F5 F6 F7 F8 F9 1 1 2 3 5 8 13 21 34
 * 
 *         F10 F11 F12 F13 F14 F15 F16 F17 F18 F19 55 89 144 233 377 610 987
 *         1597 2584 4181 …
 */
public class Fibonacci {

	private static final int MAX_NUMBER_OF_ELEMENT_TO_NOT_LAG_PROGRAM = 18;

	public static long fib (final int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Input value below zero");
		} else if (n > MAX_NUMBER_OF_ELEMENT_TO_NOT_LAG_PROGRAM) {
			throw new IllegalArgumentException("Input value too high");
		}
		if (n == 1 || n == 2) {
			return 1;
		} else if (n > 2) {
			return fib(n - 2) + fib(n - 1);
			}
		return 0;
	}
}
