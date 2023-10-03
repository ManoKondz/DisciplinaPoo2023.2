package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int senha;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite a senha:");
		senha = prompt.nextInt();
		if(senha == 4531) {
			System.out.println("Acesso permitido.");
		}else {
			System.out.println("Acesso negado");
		}

	}

}
