package ex09;

import interfaces.CalculoImpl;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {

		CalculoImpl calculoImpl = new CalculoImpl();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor depositado: R$ ");
		double valorDepositado = scanner.nextDouble();

		double valorRendimento = 0;
		double juro = 0;
		calculoImpl.calcularRendimentoPoupanca(valorDepositado, valorRendimento, juro);
	}
}
