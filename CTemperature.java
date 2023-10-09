package labo1;

public class CTemperature {

	public static void main(String[] args) {
		double tCelsius;
		double tKelvin = 100;
		double tFarhenheit;

		tCelsius =  tKelvin - 273.15;
		tFarhenheit = tCelsius * 9/5 + 32;

		System.out.print(tCelsius);
		System.out.println("°C");
		System.out.print(tFarhenheit);
		System.out.print("°F");

	}
}