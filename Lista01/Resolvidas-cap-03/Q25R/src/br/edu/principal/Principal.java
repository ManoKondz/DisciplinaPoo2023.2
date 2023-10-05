package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner tlcd = new Scanner(System.in);
        double custo, convite, qtd;

        System.out.print("Informe o custo total: ");
        custo = tlcd.nextDouble();

        System.out.print("Informe o preço por convite: ");
        convite = tlcd.nextDouble();

        qtd = custo / convite;

	}

}
