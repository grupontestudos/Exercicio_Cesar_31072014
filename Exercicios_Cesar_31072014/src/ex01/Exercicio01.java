package ex01;

import java.util.Scanner;

import interfaces.CalculoImpl;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double num2 = scanner.nextDouble();
		
		CalculoImpl calculoImpl = new CalculoImpl();
		double soma = 0;
		
		calculoImpl.SomaNumeros(num1, num2, soma);
	}
}
