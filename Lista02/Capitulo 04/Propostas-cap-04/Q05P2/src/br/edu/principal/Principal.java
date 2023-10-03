package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int esc, n1,n2, media, diferença, produto, divisão;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		System.out.println("1----------MEDIA. ");
		System.out.println("2----------DIFERENÇA. ");
		System.out.println("3----------PRODUTO ");
		System.out.println("4----------DIVISÃO ");
		esc = prompt.nextInt();
		if(esc == 1) {
			System.out.println("Bem vindo, vamos fazer a media.");
			System.out.print("Digite o primeiro numero: ");
			n1 = prompt.nextInt();
			System.out.print("Digite o segundo numero: ");
			n2 = prompt.nextInt();
			media = (n1+n2)/2;
			System.out.println("A media é" + media);
		}else if(esc == 2) {
			System.out.println("Bem vindo, vamos fazer a diferença");
			System.out.print("Digite o primeiro numero: ");
			n1 = prompt.nextInt();
			System.out.print("Digite o segundo numero: ");
			n2 = prompt.nextInt();
			if(n1 > n2) {
				diferença = n1 - n2;
			}else {
				diferença = n2 - n1;
			}
			System.out.println("A diferença é: " + diferença);
		}else if(esc == 3) {
			System.out.println("Bem vindo, vamos fazer o produto");
			System.out.print("Digite o primeiro numero: ");
			n1 = prompt.nextInt();
			System.out.print("Digite o segundo numero: ");
			n2 = prompt.nextInt();
			produto = n1 * n2;
			System.out.println("O produto é: " + produto);
		}else if(esc == 4) {
			System.out.println("Bem vindo, vamos fazer a divisão");
			System.out.print("Digite o primeiro numero: ");
			n1 = prompt.nextInt();
			System.out.print("Digite o segundo numero: ");
			n2 = prompt.nextInt();
			divisão = n1 / n2;
			System.out.println("A divisão é " + divisão);
		}else {
			System.out.println("Opção invalida.");
		}
	}

}
