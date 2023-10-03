package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a, b, c;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite A:");
		a = prompt.nextInt();
		System.out.print("Digite B:");
		b = prompt.nextInt();
		System.out.print("Digite C:");
		c = prompt.nextInt();
		if(a > b && a > c) {
			System.out.println("O maior é:" + a);
		}else if(b > a && b > c) {
			System.out.println("O maior é:" + b);
		}else {
			System.out.println("O maior é:" + c);
		}
	}

}
