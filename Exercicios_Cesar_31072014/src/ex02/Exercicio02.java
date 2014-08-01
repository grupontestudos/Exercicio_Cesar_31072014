package ex02;

import interfaces.CalculoImpl;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		CalculoImpl calculoImpl = new CalculoImpl();
		double subtracao = 0;
		double divisao = 0;
		double multiplicacao = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double num2 = scanner.nextDouble();
		
		calculoImpl.SubtraiNumeros(num1, num2, subtracao);
		calculoImpl.MultiplicaNumeros(num1, num2, multiplicacao);
		calculoImpl.DivideNumeros(num1, num2, divisao);
	}
}
