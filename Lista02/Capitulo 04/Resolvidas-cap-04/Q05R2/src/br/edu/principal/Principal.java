package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1, n2, n3, n4;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite tres numeros em ordem crecente: ");
		n1 = prompt.nextInt();
		n2 = prompt.nextInt();
		n3 = prompt.nextInt();
		System.out.println("Digite um quarto numero fora da ordem: ");
		n4 = prompt.nextInt();
		if(n4>n3) {
			System.out.println("A ordem decrecente é " + n4 + " " + n3 + " " + n2 + " " + n1  );
		}
		if(n4>n2 && n4<n3){
			System.out.println("A ordem decrecente é " + n3 + " " + n4 + " " + n2 + " " + n1  );
		}
		if(n4>n1 && n4<n2) {
			System.out.println("A ordem decrecente é " + n3 + " " + n2 + " " + n4 + " " + n1  );
		}
		if(n4<n1) {
			System.out.println("A ordem decrecente é " + n3 + " " + n2 + " " + n1 + " " + n4  );
		}
	}

}
