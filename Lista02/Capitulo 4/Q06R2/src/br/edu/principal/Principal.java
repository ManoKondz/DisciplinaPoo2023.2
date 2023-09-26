package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1, r;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		n1 = prompt.nextInt();
		r = n1%2;
		if(r == 0) {
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}

	}

}
