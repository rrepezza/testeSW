package br.com.repezza.testeSW;

public class TemperaturaCelsius {
	
	private double celsius;
	
	public TemperaturaCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converteCelsiusParaFahrenheit() {
		return 1.8 * celsius + 32;
	}
}
