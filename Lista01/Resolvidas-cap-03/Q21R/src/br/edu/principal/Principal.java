package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner tlcd = new Scanner(System.in);
		double X = 0, Y = 0, Z = 0;
		Z = tlcd.nextDouble();
		X = tlcd.nextDouble();
		Y = Math.pow(Z, 2);
		Y = Math.sqrt(Y);
		System.out.println(Y);
	}

}
