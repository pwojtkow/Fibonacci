package com.capgemini.fibonacci.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.capgemini.fibonacci.Fibonacci;

public class FibonacciTest {

	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	public void shouldReturnOneInputOne() {
		// given
		int n = 1;
		// when
		long fibonacciValue = Fibonacci.fib(n);
		// then
		org.junit.Assert.assertEquals(1, fibonacciValue);
	}

	@Test
	public void shouldReturnOneInputTwo() {
		// given
		int n = 2;
		// when
		long fibonacciValue = Fibonacci.fib(n);
		// then
		org.junit.Assert.assertEquals(1, fibonacciValue);
	}

	@Test
	public void shouldReturnEight() {
		// given
		int n = 6;
		// when
		long fibonacciValue = Fibonacci.fib(n);
		// then
		org.junit.Assert.assertEquals(8, fibonacciValue);
	}

	@Test
	public void shouldReturnOne() {
		// given
		int n = 0;
		// when
		long fibonacciValue = Fibonacci.fib(n);
		// then
		org.junit.Assert.assertEquals(0, fibonacciValue);
	}
	//ASK about this test coverage - Exception rule
	@Test
	public void souldThrowExceptionBelowZero() {
		expected.expect(IllegalArgumentException.class);
		expected.expectMessage("Input value below zero");
		// given
		int n = -2;
		// when
		long fibonacciValue = Fibonacci.fib(n);
	}
	//ASK about coverage of this test - Exception
	@Test
	public void shouldThrowExceptionUnder18(){
		expected.expect(IllegalArgumentException.class);
		expected.expectMessage("Input value too high");
		//given
		int n = 20;
		//when
		long fibonacciValue = Fibonacci.fib(n);
	}

}
