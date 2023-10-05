package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner tlcd = new Scanner(System.in);
		double peso_saco = 0, racao_gato1 = 0, racao_gato2 = 0, total_final = 0;
		System.out.println("Entre com peso_saco");
		peso_saco = tlcd.nextDouble();
		System.out.println("Entre com racao_gato1:");
		racao_gato1 = tlcd.nextDouble();		
		System.out.println("Entre com racao_gato2");
		racao_gato2 = tlcd.nextDouble();
		racao_gato1 = racao_gato1 / 1000;
		racao_gato2 = racao_gato2 / 1000;
		total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
		System.out.println("O total final é " + total_final);
	}
}
