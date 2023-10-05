package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int AnoAtual = 0, AnoNascimento = 0, IdadeAtual = 0, Idade2050 = 0;
		Scanner tlcd = new Scanner(System.in);
		System.out.println("Entre com o ano atual:");
		AnoAtual = tlcd.nextInt();
		System.out.println("Entre com o seu ano de nascimento:");
		AnoNascimento = tlcd.nextInt();
		IdadeAtual = AnoAtual - AnoNascimento;
		Idade2050 = 2050 - AnoNascimento;
		System.out.printf("Sua idade no ano de %d é %d\n", AnoAtual, IdadeAtual);
		System.out.printf("Sua idade no ano de 2050 é %d", Idade2050);
		
	}

}
