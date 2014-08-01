package ex03;

import java.util.Scanner;

import interfaces.Calculo;
import interfaces.CalculoImpl;

public class Exercicio03 {

	public static void main(String[] args) {
		
		CalculoImpl calculoImpl = new CalculoImpl();
		double consumoMedio = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor da distancia total: ");
		double distanciaTotal = scanner.nextDouble();
		
		System.out.print("Digite a quantidade de combustivel gasto: ");
		double combustivel = scanner.nextDouble();
		
		calculoImpl.calculaConsumoMedio(distanciaTotal, combustivel, consumoMedio);
	}
}
