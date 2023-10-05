package br.du.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner tlcd = new Scanner(System.in);
		double salario = 0, cheque1  = 0, cheque2 = 0, cpmf1 = 0, cpmf2 = 0, saldo = 0;
		System.out.println("Entre com o valor de salário:");
		salario = tlcd.nextDouble();
		System.out.println("Entre com o valor de cheque1:");
		cheque1 = tlcd.nextDouble();
		System.out.println("Entre com o valor de cheque2:");
		cheque2 = tlcd.nextDouble();
		cpmf1 = cheque1 * 0.38 / 100;
		cpmf2 = cheque2 * 0.38 / 100;
		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.println("O saldo é " + saldo);

	}

}
