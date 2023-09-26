package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salb, tempo, imp, grat, sall;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite o seu salario base: ");
		salb = prompt.nextDouble();
		System.out.println("Digite as horas trabalhadas: ");
		tempo = prompt.nextDouble();
		if(salb < 200) {
			imp = 0;
		}else if(salb <= 450) {
			imp = 3/100 * salb;
		}else if(salb < 700) {
			imp = 8/100 * salb;
		}else {
			imp = 12/100 * salb;
		}
		System.out.println("O imposto é: " + imp);
		if(salb > 500) {
			if(tempo <= 3) {
				grat = 20;
			}else {
				grat = 30;
			}
		}else {
			if(tempo <= 3) {
				grat = 23;
			}else if(tempo < 6) {
				grat = 35;
			}else {
				grat = 33;
			}
		}
		System.out.println("A gratificação é: " + grat);
		sall = salb - imp + grat;
		System.out.println("O salario liquido é: " + sall);
		if(sall <= 350) {
			System.out.println("Classificação A");
		}else if(sall < 600) {
			System.out.println("Classificação B");
		}else {
			System.out.println("Classificação C");
		}
	}

}
