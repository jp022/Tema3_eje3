package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import apartado1.Rectangulo;

class RectanguloTest {
	float base=5, altura=10;
	Rectangulo r = new Rectangulo(base, altura);
	

	@Test
	public void areaTest() {
		double valorEsperado=50;
		double resultado=r.area();
		assertEquals(valorEsperado, resultado, 0);
	}

}
