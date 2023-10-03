package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double cest, ccrg, pt, pq, pcrg = 0, imp = 0, vt;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite o codigo de estado(varia de 1 a 5): ");
		cest = prompt.nextDouble();
		System.out.print("Digite o peso em toneladas: ");
		pt = prompt.nextDouble();
		System.out.println("Digite o codigo de carga(varia de 10 a 40): ");
		ccrg = prompt.nextDouble();
		pq = pt * 1000;
		System.out.println("O peso em quilos é: " + pq);
		if(ccrg >= 10 && ccrg <= 20) {
			pcrg = 100 * pq;
		}
		if(ccrg >= 21 && ccrg <= 30) {
			pcrg = 250 * pq;
		}
		if(ccrg >= 31 && ccrg <= 40) {
			pcrg = 340 * pq;
		}
		System.out.println("O preço da carga é: " + pcrg);
		if(cest == 1) {
			imp = 35/100 * pcrg;
		}
		if(cest == 2) {
			imp = 25/100 * pcrg;
		}
		if(cest == 3) {
			imp = 15/100 * pcrg;
		}
		if(cest == 4) {
			imp = 5/100 * pcrg;
		}
		if(cest == 5) {
			imp = 0;
		}
		System.out.println("O imposto é: " + imp);
		vt = pcrg + imp;
		System.out.println("O valor total é: " + vt);
	}

}
