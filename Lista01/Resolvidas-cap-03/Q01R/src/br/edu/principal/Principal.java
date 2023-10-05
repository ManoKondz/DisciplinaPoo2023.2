package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1, n2, n3, n4, soma;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite o 1° numero: ");
		n1 = prompt.nextInt();
		System.out.println("Digite o 2° numero: ");
		n2 = prompt.nextInt();
		System.out.println("Digite o 3° numero: ");
		n3 = prompt.nextInt();
		System.out.println("Digite o 4° numero: ");
		n4 = prompt.nextInt();
		soma = n1+n2+n3+n4;
		System.out.println("A soma dos quatro numeros é: " + soma);
	}

}
