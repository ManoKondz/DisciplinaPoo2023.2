package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int nota1, nota2, nota3;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite a 1° nota: ");
		nota1 = prompt.nextInt();
		System.out.println("Digite a 2° nota: ");
		nota2 = prompt.nextInt();
		System.out.println("Digite a 3° nota: ");
		nota3 = prompt.nextInt();
		int media = (nota1 + nota2 + nota3)/ 3;
		System.out.println("A media é: " + media);
	}

}
