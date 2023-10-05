package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);

        int tAlM50 = 0,sAlM50 = 0;

        while (true) {
            System.out.print("Digite a idade (ou um número menor ou igual a zero para encerrar): ");
            int idade = prompt.nextInt();

            if (idade <= 0) {
                break;
            }

            System.out.print("Digite a altura (em centímetros): ");
            int altura = prompt.nextInt();

            if (idade > 50) {
                tAlM50++;
                sAlM50 += altura;
            }
        }

        if (tAlM50 > 0) {
            double mediaAlturasMais50 = (double) sAlM50 / tAlM50;
            System.out.println("\nMédia das alturas das pessoas com mais de 50 anos: " + mediaAlturasMais50 + " cm");
        } else {
            System.out.println("\nNão há pessoas com mais de 50 anos para calcular a média de alturas.");
        }

	}

}
