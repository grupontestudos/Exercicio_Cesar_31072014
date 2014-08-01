package ex08;

import interfaces.CalculoImpl;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		CalculoImpl calculoImpl = new CalculoImpl();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor em dolares: $ ");
		double valorDolar = scanner.nextDouble();
		
		System.out.print("Digite o preco do dolar: R$ ");
		double precoDolar = scanner.nextDouble();
		
		double valorReal = 0;
		calculoImpl.converterDolaresEmReais(valorDolar, valorReal, precoDolar);
}
}
