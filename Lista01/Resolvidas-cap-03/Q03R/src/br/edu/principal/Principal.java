package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1, p1, n2, p2, n3, p3;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite a 1° nota: ");
		n1 = prompt.nextInt();
		System.out.println("Digite a 2° nota: ");
		n2 = prompt.nextInt();
		System.out.println("Digite a 3° nota: ");
		n3 = prompt.nextInt();
		System.out.println("Digite o peso da nota 1: ");
		p1 = prompt.nextInt();
		System.out.println("Digite o peso da nota 2: ");
		p2 = prompt.nextInt();
		System.out.println("Digite o peso da nota 3: ");
		p3 = prompt.nextInt();
		int media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
		System.out.println("A media é: " + media);
		if(media >= 6) {
			System.out.println("O aluno(a) esta aprovado(a)!!");
		} else {
			System.out.println("O aluno(a) esta reprovado(a)!!");
		}
	}

}
