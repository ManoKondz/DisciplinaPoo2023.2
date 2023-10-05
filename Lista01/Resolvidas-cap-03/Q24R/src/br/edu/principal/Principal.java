package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner tlcd = new Scanner(System.in);
        double hora;
        int h, m, conversao;

        System.out.print("Informe a hora: ");
        hora = tlcd.nextDouble();

        h = (int) hora;
        m = (int) ((hora - h) * 100);
        conversao = (h * 60) + m;

	}

}
