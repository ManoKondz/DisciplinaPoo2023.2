package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double area, base, altura;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o tamnho da base: ");
		base = prompt.nextDouble();
		System.out.print("Digite a altura: ");
		altura = prompt.nextDouble();
		area = (base * altura) / 2;
		System.out.println("A área é: " + area);
	}

}
