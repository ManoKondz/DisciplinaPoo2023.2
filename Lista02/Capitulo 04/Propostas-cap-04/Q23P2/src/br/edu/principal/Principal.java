package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double cod, qnt, pre = 0, pren, desc = 0, pref;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o codigo do produto(de 1 a 40):");
		cod = prompt.nextDouble();
		System.out.print("Digite a quantidade comprada: ");
		qnt = prompt.nextDouble();
		if(cod >= 1 && cod <= 10) {
			pre = 10;
		}else if(cod >= 11 && cod <= 20) {
			pre = 15;
		}else if(cod >= 21 && cod <= 30) {
			pre = 20;
		}else if(cod >= 31 && cod <= 40) {
			pre = 30;
		}
		System.out.println("O preço desse produto é: " + pre);
		pren = pre * qnt;
		if(pren <= 250) {
			desc = pren * 5/100;
		}else if(pren >= 250 && pren <= 500) {
			desc = pren * 10/100;
		}else if(pren > 500) {
			desc = pren * 15/100;
		}
		pref = pren - desc;
		System.out.println("O preço final desse produto é:" + pref);

	}

}
