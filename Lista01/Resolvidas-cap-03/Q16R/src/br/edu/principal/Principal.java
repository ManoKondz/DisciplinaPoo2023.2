package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int HorasT = 0, VlrSalMin = 0, VlrHoraT = 0, VlrSalBru = 0, Imp = 0, VlrSalLiq = 0;
		Scanner tlcd = new Scanner(System.in);
		System.out.println("Entre com HorasT: ");
		HorasT = tlcd.nextInt();
		System.out.println("Entre com VlrSalMin: ");
		VlrSalMin = tlcd.nextInt();
		VlrHoraT = VlrSalMin / 2;
		VlrSalBru = VlrHoraT * HorasT;
		Imp = VlrSalBru - Imp;
		System.out.println("O valor de  VlrSalLiq: " + VlrSalLiq);
	}

}
