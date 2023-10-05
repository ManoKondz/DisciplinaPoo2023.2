package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal, salreceber, grat, imposto;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o seu salario: ");
		sal = prompt.nextDouble();
		grat = sal * 5/100;
		imposto = sal * 7/100;
		salreceber = sal + grat - imposto;
		System.out.println("Ele tem que receber: " + salreceber);
	}

}
