package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1, n2, n3, media;
		Scanner prompt = new Scanner(System.in);
		System.out.println();
		n1 = prompt.nextInt();
		System.out.println();
		n2 = prompt.nextInt();
		System.out.println();
		n3 = prompt.nextInt();
		media = (n1*2)+(n2*3)+(n3*5)/10;
		if ((media >= 8 && media <= 10)) {
			System.out.println("Obteve conceito A");
		}else if(media>=7 && media < 8) {
			System.out.println("Obteve conceito B");
		}else if(media>=6 && media < 7) {
			System.out.println("Obteve conceito C");
		}else if(media>=5 && media < 6) {
			System.out.println("Obteve conceito D");
		}else if(media>=0 && media < 5) {
			System.out.println("Obteve conceito E");
		}
	}

}
