package br.com.repezza.temperatura;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperaturaCelsiusTest {

	@Test
	public void testConverteCelsiusParaFahrenheit() {
		double temperaturaEmCelsius = new TemperaturaCelsius(0).converteCelsiusParaFahrenheit();
		assertEquals(32.0, temperaturaEmCelsius, 0);
	}

}
