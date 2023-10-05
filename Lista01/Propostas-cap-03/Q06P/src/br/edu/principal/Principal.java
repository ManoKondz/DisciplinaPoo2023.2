package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salariofx, vendas, comissão, salariofn;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite o seu salario: ");
		salariofx = prompt.nextDouble();
		System.out.println("Digite quanto você vendeu: ");
		vendas = prompt.nextDouble();
		comissão = vendas *4/100;
		salariofn = salariofx + comissão;
		System.out.println("O seu salario final é: " + salariofn);
	}

}
