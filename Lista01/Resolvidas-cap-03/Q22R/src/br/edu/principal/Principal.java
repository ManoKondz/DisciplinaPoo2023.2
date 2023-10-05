package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner tlcd = new Scanner(System.in);
	        double vlrSal = 0.0, vlrKw = 0.0, vlrReais = 0.0, desc = 0.0, vlrDesc = 0.0;
	        int qtdKw = 0;
	        System.out.println("Entre com vlrSal:");
	        vlrSal = tlcd.nextDouble();
	        System.out.println("Entre com qtdKw:");
	        qtdKw = tlcd.nextInt();
	        vlrKw = vlrSal / 5;
	        vlrReais = vlrKw * qtdKw;
	        desc = vlrReais * (15 / 100);
	}

}
