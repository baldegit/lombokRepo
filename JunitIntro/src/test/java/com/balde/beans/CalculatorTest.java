package com.balde.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals("erruer dans add()", 2, Calculator.add(1, 1));
		assertEquals("erruer dans add()", 0, Calculator.add(-1, 1));
		assertEquals("erruer dans add()", 0, Calculator.add(1, -1));
		assertEquals("erruer dans add()", -2, Calculator.add(-1, -1));
		
		assertNotEquals("erruer dans add()", -2, Calculator.add(-1, -2));
	}

	@Test
	public void testSub() {
		assertEquals("erruer dans sub()", 0, Calculator.sub(1, 1));
		assertEquals("erruer dans sub()", -2, Calculator.sub(-1, 1));
		assertEquals("erruer dans sub()", 2, Calculator.sub(1, -1));
		assertEquals("erruer dans sub()", 0, Calculator.sub(-1, -1));
		
		assertNotEquals("erruer dans add()", -2, Calculator.add(-1, -2));
	}

	@Test
	public void testMul() {
		assertEquals("erreur dans mul()", 0, Calculator.mul(0, 1));
		assertEquals("erreur dans mul()", 0, Calculator.mul(1, 0));
		assertEquals("erreur dans mul()", 8, Calculator.mul(4, 2));
		assertEquals("erreur dans mul()", -4, Calculator.mul(-4, 1));
		
		assertNotEquals("erreur dans mul()", 30, Calculator.mul(5, 5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivInt() {
		assertEquals("error in divInt()", 3, Calculator.divInt(9, 3));
		assertEquals("error in divInt()", 0, Calculator.divInt(1, 9));
		
		assertNotEquals("error in divInt()", 1, Calculator.divInt(9, 3));
		
		Calculator.divInt(9, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivReal() {
		assertEquals("error in divInt()", 0.333333, Calculator.divReal(1, 3),1e-6);
		assertEquals("error in divInt()", 0.111111, Calculator.divReal(1, 9),1e-6);
		
		Calculator.divReal(9, 0);
	}

}
