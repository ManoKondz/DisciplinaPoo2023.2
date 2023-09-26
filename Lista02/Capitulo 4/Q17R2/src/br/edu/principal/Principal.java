package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite A: ");
		a = prompt.nextInt();
		System.out.print("Digite B: ");
		b = prompt.nextInt();
		System.out.print("Digite C: ");
		c = prompt.nextInt();
		delta = (b*b) - 4 * a * c;
		if (delta < 0 ) {
			System.out.print("Não existe raiz real");
		}
		if(delta == 0) {
			System.out.print("Existe uma raiz real");
			x1 = (-b) / (2*a);
			System.out.print("A raiz é: " + x1);
		}
		if(delta > 0) {
			System.out.println("Existe duas raizes reais");
			x1 = (-b + Math.sqrt(delta) /(2 * a));
			x2 = (-b - Math.sqrt(delta) /(2 * a));
			System.out.print("As raizes são: " + x1 + " " + x2);
		}
		
		
	}

}
