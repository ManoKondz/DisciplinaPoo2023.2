package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double dep, rend, total;
		int taxa;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o deposito: ");
		dep = prompt.nextDouble();
		System.out.print("Digite a taxa de juros: ");
		taxa = prompt.nextInt();
		rend = dep * taxa/100;
		total = dep + taxa;
		System.out.println("O rendimento é: " + rend);
		System.out.println("O total é: " + total);
	}
}

