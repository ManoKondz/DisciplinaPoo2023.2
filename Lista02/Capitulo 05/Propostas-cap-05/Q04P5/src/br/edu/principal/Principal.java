package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num, resu;
        Scanner prompt = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = prompt.nextInt();

        System.out.println("Tabuada do " + num + ":");

        for (int i = 0; i <= 10; i++) {
             resu = num * i;
            System.out.println(num + " × " + i + " = " + resu);
        }


	}

}
