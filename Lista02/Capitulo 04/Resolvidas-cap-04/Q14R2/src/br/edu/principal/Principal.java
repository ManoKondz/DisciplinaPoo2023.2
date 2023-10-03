package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal, nvsal, boni, aux;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o seu salario: ");
		sal = prompt.nextDouble();
		if(sal <= 500) {
			boni = sal*5/100;
		}else if(sal <= 1200) {
			boni = sal * 12/100;
		}else {
			boni = 0;
		}
		if(sal <= 600) {
			aux = 150;
		}else {
			aux = 100;
		}
		nvsal = sal + boni + aux;
		System.out.print("O novo salario é: " + nvsal);

	}

}
