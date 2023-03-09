package tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import apartado2.UtilidadesFecha;

class UtilidadesFechaTest {
	
	@Test
	void bisiestoTest1() {
		Boolean resultado = UtilidadesFecha.comprobarBisiesto(23);
		assertFalse(resultado);
	}

	@Test
	void bisiestoTest() {
		Boolean resultado = UtilidadesFecha.comprobarBisiesto(4);
		assertTrue(resultado);
	}

	
}
