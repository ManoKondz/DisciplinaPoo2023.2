package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		   double ang = 0, alt = 0, escada = 0, radiano = 0;
	        Scanner tlcd =new Scanner(System.in);
	        ang = tlcd.nextDouble();
	        alt = tlcd.nextDouble();
	        radiano = ang * 3.14 / 180;
	        escada = alt / (Math.sin(radiano));
	        System.out.println(escada);

	}

}
