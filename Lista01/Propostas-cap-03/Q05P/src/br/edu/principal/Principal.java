package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double preço, nvpreço, Desconto;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite o preço do produto: ");
		preço = prompt.nextDouble();
		Desconto = preço * 10/100;
		nvpreço = preço - Desconto;
		System.out.print("O novo preço é: " + nvpreço);
	}

}
