package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salario, nvsalario;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite o seu salario");
		salario = prompt.nextDouble();
		nvsalario = salario + salario * 25/100;
		System.out.println("O seu novo salario é: " + nvsalario);

	}

}
