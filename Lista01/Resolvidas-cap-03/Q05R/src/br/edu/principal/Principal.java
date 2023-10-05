package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salario,perc = 15, nvsalario, aumento;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o seu salario: ");
		salario = prompt.nextDouble();
		aumento = salario * perc/100;
		nvsalario = aumento + salario;
		System.out.println("O salario é: " + nvsalario);
	}

}
