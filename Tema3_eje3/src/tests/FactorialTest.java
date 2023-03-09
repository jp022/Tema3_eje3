package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import apartado3.Factorial;

public class FactorialTest {

	@Test
	public void testRecursivo() {
		assertEquals(7034535277573963776l, Factorial.calcularFactorialRecursivo(25));
		assertEquals(0, Factorial.calcularFactorialRecursivo(0));
		assertEquals(-1, Factorial.calcularFactorialRecursivo(-1));
		assertEquals(1, Factorial.calcularFactorialRecursivo(1));
	}
	
	@Test
	public void testNormal() {
		assertEquals(1, Factorial.calcularFactorial(1));
		assertEquals(1, Factorial.calcularFactorial(-1));
		assertEquals(7034535277573963776l, Factorial.calcularFactorial(26));
		assertEquals(0, Factorial.calcularFactorial(0));
	}
	
}