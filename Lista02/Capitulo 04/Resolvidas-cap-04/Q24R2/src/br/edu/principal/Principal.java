package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pre, va = 0, imp, precu, des, nvp;
		String tipo, refrig;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o preço:");
		pre = prompt.nextDouble();
		System.out.print("Digite o tipo(A, L ou V): ");
		tipo = prompt.next();
		System.out.print("Digite a refrigeração(N ou S): ");
		refrig = prompt.next();
		if(refrig == "N") {
			if(tipo == "A") {
				if(pre < 15) {
					va = 2;
				}else {
					va = 5;
				}
			}
			if(tipo == "L") {
				if(pre < 10) {
					va = 1.50;
				}else {
					va = 2.50;
				}
			}
			if(tipo == "V") {
				if(pre < 30) {
					va = 3;
				}else {
					va = 2.50;
				}	
			}
		}
		else {
			if(tipo == "A") {
				va = 8;
			}
			if(tipo == "L") {
				va = 0;
			}
			if(tipo == "V") {
				va = 0;
			}
		}
		System.out.println("O valor adicional é: " + va);
		if(pre < 25) {
			imp = 5/100 * pre;
		}else {
			imp = 8/100 * pre;
		}
		System.out.println("O imposto é: " + imp);
		precu = pre + imp;
		System.out.println("O pre-custo é: " + precu);
		if (tipo != "A" && refrig != "S") {
			des = 3/100 * precu;
		}else {
			des = 0;
		}
		System.out.println("O desconto é: " + des);
		nvp = precu + va - des;
		System.out.println("O novo preço é: " + nvp);
		if(nvp <= 50) {
			System.out.println("Barato");
		}else if(nvp < 100) {
			System.out.println("Normal");
		}else {
			System.out.println("Caro");
		}
	}

}
