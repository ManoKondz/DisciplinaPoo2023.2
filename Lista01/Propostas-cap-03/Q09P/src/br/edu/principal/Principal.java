package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int Bmaior, Bmenor, altura, area;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite a base maior: ");
		Bmaior = prompt.nextInt();
		System.out.print("Digite a base menor: ");
		Bmenor = prompt.nextInt();
		System.out.print("Digite a altura: ");
		altura = prompt.nextInt();
		area = ((Bmaior + Bmenor)*altura)/2;
		System.out.println("a area do trapezio é: " + area);
	}

}
