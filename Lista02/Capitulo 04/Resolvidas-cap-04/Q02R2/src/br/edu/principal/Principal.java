package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1,n2,n3,media,exame;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		n1 = prompt.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = prompt.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3 = prompt.nextDouble();
		media = (n1+n2+n3) / 3;
		if(media>= 0 && media<3) {
			System.out.println("Reprovado");
		}else if(media >=3 && media<7) {
			System.out.println("Exame");
			exame = 12 - media;
			System.out.println("O aluno deve tirar " + exame +"para passar");
		} else if (media >= 7 && media <= 10) {
		    System.out.println("O aluno está aprovado");
		}
	}

}
