package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double n1, n2, r1, r2;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o 1° numero: ");
		n1 = prompt.nextDouble();
		System.out.print("Digite o 2° numero: ");
		n2 = prompt.nextDouble();
		r1 = Math.pow(n1, n2);
		r2 = Math.pow(n2, n1);
		System.out.println("Os resultados são: " + " " + r1 + " " + r2 );
	}

}
