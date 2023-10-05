package br.du.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner tlcd = new Scanner(System.in);
		double PFab = 0, PercD = 0, PercI = 0, VlrD = 0, VlrI = 0, PFinal = 0;
		System.out.println("Entre com PFab:");
		PFab = tlcd.nextDouble();
		System.out.println("Entre com PercD:");
		PercD = tlcd.nextDouble();
		System.out.println("Entre com PercI:");
		PercI = tlcd.nextDouble();
		VlrD = (PFab * PercD) / 100;
		VlrI = (PFab * PercI) / 100;
		PFinal = PFab + VlrD + VlrI;
		System.out.println("VlrD =" + VlrD);
		System.out.println("VlrI =" + VlrI);
		System.out.println("PFinal =" + PFinal);
	}

}
