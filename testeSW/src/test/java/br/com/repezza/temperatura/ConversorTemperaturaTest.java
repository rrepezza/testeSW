package br.com.repezza.temperatura;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.repezza.temperatura.ConversorTemperatura;

public class ConversorTemperaturaTest {

	@Test
	public void testConverteCelsiusParaFahrenheit() {
		assertEquals(122.0, ConversorTemperatura.converteCelsiusParaFahrenheit(50.0), 0.0);
	}

	@Test
	public void testConverteFahrenheitParaCelsius() {
		assertEquals(10.0, ConversorTemperatura.converteFahrenheitParaCelsius(50.0), 0.0);
	}

}
