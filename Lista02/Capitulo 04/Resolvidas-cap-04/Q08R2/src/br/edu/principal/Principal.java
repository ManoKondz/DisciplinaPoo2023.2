package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double op, n1, n2, soma, raiz;
		Scanner prompt = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1-Somar dois numeros");
		System.out.println("2-Raiz quadrada de um numero");
		op = prompt.nextInt();
		if(op == 1) {
			System.out.print("Digite o valor do primeiro numero: ");
			n1 = prompt.nextInt();
			System.out.print("Digite o valor do segundo numero: ");
			n2 = prompt.nextInt();
			soma = n1 + n2;
			System.out.println("A soma de" + n1 + "e" + n2 + "é:" + soma);
		}
		if(op == 2) {
			System.out.println("Digite um valor: ");
			n1 = prompt.nextInt();
			raiz = Math.sqrt(n1);
			System.out.println("A raiz é: " + raiz);
		}
		if(op != 1 && op!= 2) {
			System.out.println("Opção invalida.");
		}
	}

}
