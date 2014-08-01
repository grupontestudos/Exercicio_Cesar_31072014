package ex06;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double n1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double n2 = scanner.nextDouble();
		
		double aux = n1;
		n1 = n2;
		n2 = aux;
		
		System.out.println("O primeiro número é: " + n1 + " e o segundo numero é: "+n2);
	}

}
