package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double peso, pesoeng, pesoemg;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o seu peso: ");
		peso = prompt.nextDouble();
		pesoeng = peso + (peso * 0.15);
		pesoemg = peso - (peso * 0.20);
		System.out.println("O novo peso se a pessoa engordar é: " + pesoeng);
		System.out.println("O novo peso se a pessoa emagrecer é: " + pesoemg);
	}

}
