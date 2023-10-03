package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double cp, pq, cps, pg, pt, imp = 0, vt, preg = 0;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite o codigo do produto comprado(varia de 1 a 10):");	
		cp = prompt.nextDouble();
		System.out.print("Digite o peso do produto em quilos:");
		pq = prompt.nextDouble();
		System.out.print("Digite o codido do pais de origem:");
		cps = prompt.nextDouble();
		pg = pq * 100;
		if(cp >= 1 && cp <= 4) {
			preg = 10;
		}
		if(cp >= 5 && cp <= 7) {
			preg = 25;
		}
		if(cp >= 8 && cp <= 10){
			preg = 35;
		}
		pt = pg + preg;
		System.out.println("O preço total é: " + pt);
		if(cps == 1) {
			imp = 0;
		}
		if(cps == 2) {
			imp = pt * 15/100;
		}
		if(cps == 3) {
			imp = pt * 25/100;
		}
		System.out.println("O imposto é: " + imp);
		vt = pt + imp;
		System.out.println("O valor total é: " + vt);
	}

}
