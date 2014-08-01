package ex04;

import interfaces.CalculoImpl;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		CalculoImpl calculoImpl = new CalculoImpl();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do vendedor: ");
		String nome = scanner.next();

		System.out.print("Digite o valor do salario fixo: R$ ");
		double salarioFixo = scanner.nextDouble();

		System.out.print("Digite o valor total das vendas do mês: R$ ");
		double valorVendasMes = scanner.nextDouble();

		double comissao = 0.15;
		double valorComissao = 0;
		double salarioFinal = (salarioFixo + (comissao * valorVendasMes));
		calculoImpl.calculaSalarioFinalMes(salarioFixo, comissao, valorVendasMes, salarioFinal, valorComissao);
		System.out.println("O vendedor " + nome + " tem o salário fixo de R$ "
				+ salarioFinal);
	}
}
