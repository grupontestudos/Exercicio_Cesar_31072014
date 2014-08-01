package ex10;

import interfaces.CalculoImpl;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		CalculoImpl calculoImpl = new CalculoImpl();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor da compra: R$ ");
		double valorCompra = scanner.nextDouble();

		double valorPrestacao = 0;
		double numeroParcela = 0;
		calculoImpl.calculaValorPrestacao(valorCompra, valorPrestacao, numeroParcela);
	}
}
