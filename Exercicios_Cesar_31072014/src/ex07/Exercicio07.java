package ex07;

import java.util.Scanner;

import interfaces.CalculoImpl;

public class Exercicio07 {

	public static void main(String[] args) {
		
		CalculoImpl calculoImpl = new CalculoImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a temperatura em graus Celsius: ");
		double temperaturaCelsius = scanner.nextDouble();
		
		double temperaturaFahrenheit = 0;
		calculoImpl.converterCelsiusEmFahrenheit(temperaturaCelsius, temperaturaFahrenheit);
	}
}
