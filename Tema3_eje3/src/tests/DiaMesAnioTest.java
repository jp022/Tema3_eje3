package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import apartado2.UtilidadesFecha;
import apartado3.Factorial;
import apartado4.DiaMesAnio;

class DiaMesAnioTest {

	@Test
	public void calcularDiaMesAnio() {
		int valorEsperado=28;
		int resultado=DiaMesAnio.calcularDiasMesAnio(2, 2022);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void calcularDiaMesAnio1() {
		int valorEsperado=29;
		int resultado=DiaMesAnio.calcularDiasMesAnio(2, 4);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void calcularDiaMesAnio2() {
		int valorEsperado=31;
		int resultado=DiaMesAnio.calcularDiasMesAnio(12, 4);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void calcularDiaMesAnio3() {
		int valorEsperado=30;
		int resultado=DiaMesAnio.calcularDiasMesAnio(11, 4);
		assertEquals(valorEsperado, resultado, 0);
	}

}
