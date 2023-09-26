package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salmin, nht, ndep, nhet, salre, vh, smes, vdep, vhe, imp = 0, sbruto, sliq, grat = 0;
		Scanner prompt = new Scanner(System.in);
		System.out.println("Digite o seu salario minimo: ");
		salmin = prompt.nextDouble();
		System.out.println("Digite o numero de horas trabalhads: ");
		nht = prompt.nextDouble();
		System.out.println("Digite o numero de dependentes: ");
		ndep = prompt.nextDouble();
		System.out.println("Digite a quantidade de horas extras feitas: ");
		nhet = prompt.nextDouble();
		vh = 1/5 * salmin;
		smes = nht * vh;
		vdep = 32 * ndep;
		vhe = nhet * (vh +(vh * 50/100));
		sbruto = smes + vdep + vhe;
		if(sbruto<200) {
			imp = 0;
		}
		if(sbruto >= 200 && sbruto <= 500) {
			imp = sbruto * 10/100;
		}
		if(sbruto > 500) {
			imp = sbruto * 20/100;
		}
		sliq = sbruto - imp;
		if(sliq <= 350) {
			grat = 100;
		}
		if(sliq > 350) {
			grat = 50;
		}
		salre = sliq + grat;
		System.out.println("O salario que você deve receber é: " + salre);
	}

}
