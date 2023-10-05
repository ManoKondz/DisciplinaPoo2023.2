package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal, salreceber, imp;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o seu salario: ");
		sal = prompt.nextDouble();
		imp = sal * 10/100;
		salreceber = sal + 50 - imp;
		System.out.println("O salario a receber é: " + salreceber);
	}

}
