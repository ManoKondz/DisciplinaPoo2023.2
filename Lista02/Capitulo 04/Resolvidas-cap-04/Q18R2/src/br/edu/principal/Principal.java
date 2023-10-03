package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int x, y, z;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite x: ");
		x = prompt.nextInt();
		System.out.print("Digite y: ");
		y = prompt.nextInt();
		System.out.print("Digite z: ");
		z = prompt.nextInt();
		if(x < y + z && y < x + z && z < x + y) {
			if(x == y && y == z) {
				System.out.println("Triangulo equilatero.");
			}else if (x == y || x == z || y == z) {
				System.out.println("Triangulo isoceles.");
			}else if (x != y && x != z && y != z) {
				System.out.println("Triangulo escaleno");
			}else {
				System.out.println("Essas medidas não formam um triangulo.");
			}
		}
	}

}
