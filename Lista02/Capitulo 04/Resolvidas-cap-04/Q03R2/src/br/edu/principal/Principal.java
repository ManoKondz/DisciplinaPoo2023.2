package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1, n2;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		n1 = prompt.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = prompt.nextInt();
		if(n1>n2) {
			System.out.println("O maior numero é: " + n1 );
		}else if(n2>n1) {
			System.out.println("O maior numero é: " + n2);
		}else {
			System.out.println("Os numeros são iguais");
		}
	}

}
