package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double area, raio;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o raio");
		raio = prompt.nextDouble();
		area = 3.1415 * (raio*raio);
		System.out.println("O raio do circulo é:" + area);

	}

}
