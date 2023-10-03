package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, n3, n4,media;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite a 1° nota: ");
		n1 = prompt.nextDouble();
		System.out.print("Digite a 2° nota: ");
		n2 = prompt.nextDouble();
		System.out.print("Digite a 3° nota: ");
		n3 = prompt.nextDouble();
		System.out.print("Digite a 4° nota: ");
		n4 = prompt.nextDouble();
		media = (n1 + n2 + n3 + n4) / 4;
		if(media >= 7) {
			System.out.println("Aprovado" + " " + media);
		}else {
			System.out.println("Reprovado" + " " + media);
		}
	}

}
