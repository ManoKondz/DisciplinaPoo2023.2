package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner tlcd = new Scanner(System.in);
        double num = 0, i = 0, f = 0, a = 0;
        System.out.println("Entre com número: ");
        num = tlcd.nextDouble();
        i = (int) num;
        f = num - i;
        a = Math.round(num);
        System.out.println("A parte inteira do número é " + i);
        System.out.println("A parte fracionária do número é " + f);

	}

}
