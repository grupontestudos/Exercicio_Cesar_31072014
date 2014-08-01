package ex05;

import interfaces.CalculoImpl;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		CalculoImpl calculoImpl = new CalculoImpl();
		
		Scanner scanner = new Scanner(System.in);
		
		double media = 0;
		
		System.out.print("Digite o nome do aluno:");
		String nome = scanner.next();
		
		System.out.print("Digite a primeira nota do aluno: ");
		double n1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota do aluno: ");
		double n2 = scanner.nextDouble();

		System.out.print("Digite a segunda nota do aluno: ");
		double n3 = scanner.nextDouble();
		
		media = ((n1 + n2 +n3) / 3);
		System.out.println("O aluno " + nome + " teve como média " + media);
	}

}
