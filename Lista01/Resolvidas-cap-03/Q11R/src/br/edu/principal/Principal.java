package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num, quad = 2, cubo = 3, r2 , r3 , resultado1, resultado2;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		num = prompt.nextDouble();
		resultado1 = Math.pow(num, quad);
		resultado2 = Math.pow(num, cubo);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		System.out.println("Os resultados são: " + " " + "\nAo quadrado: " +  resultado1 + "\nAo Cubo: " + resultado2 + "\nRaiz quadrada: " + r2 + "\nRaiz cubica " + r3 );

	}

}
