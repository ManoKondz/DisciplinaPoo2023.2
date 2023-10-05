package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner tlcd = new Scanner(System.in);
		double  a_degrau = 0, a_usuario = 0, qtd_degraus = 0;
		System.out.println("Entre com a_degrau:");
		a_degrau = tlcd.nextDouble();
		System.out.println("Entre com a_usuario:");
		a_usuario = tlcd.nextDouble();
		qtd_degraus = a_usuario / a_degrau;
		System.out.println("A quantidade de degraus é " + qtd_degraus);
}
}
