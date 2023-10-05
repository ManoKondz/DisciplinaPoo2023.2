package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pesokg, pesog;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite seu peso em KG: ");
		pesokg = prompt.nextDouble();
		pesog = pesokg * 1000;
		System.out.println("O peso em gramas é: " + pesog);
	}

}
