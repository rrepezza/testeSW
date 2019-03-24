package br.com.repezza.testeSW;

public class ConversorTemperatura {
	
	public static double converteCelsiusParaFahrenheit(double celsius) {
		return 1.8 * celsius + 32;
	}
	
	public static double converteFahrenheitParaCelsius(double fahrenheit) {
		return (5/9) * (fahrenheit - 32);
	}
	
}
