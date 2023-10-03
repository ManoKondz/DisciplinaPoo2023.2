package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int h1,min1, h2, min2, hd, mind;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite a hora inicial:");
		System.out.print("Hora: ");
		h1 = prompt.nextInt();
		System.out.print("Minutos:");
		min1 = prompt.nextInt();
		System.out.println("Digite a hora final");
		System.out.print("Hora: ");
		h2 = prompt.nextInt();
		System.out.print("Minutos: ");
		min2 = prompt.nextInt();
		if(min1>min2) {
			min2 = min2 + 60;
			h2 = h2 - 1;
		}
		if(h1 > h2) {
			h2 = h2 + 24;
		}
		mind = min2 - min1;
		hd = h2 - h1;
		System.out.println("O jogo durou " + hd + "hora(s) e" + " " + mind + "minutos");

	}

}
