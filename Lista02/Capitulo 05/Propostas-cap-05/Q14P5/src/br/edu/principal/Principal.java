package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);

        int tO = 0,tB = 0,sIO = 0,tR = 0;
        
        

        for (int i = 1; i <= 15; i++) {
            System.out.println("Espectador " + i);
            System.out.print("Idade: ");
            int idade = prompt.nextInt();
            System.out.print("Opinião (ótimo = 3, bom = 2, regular = 1): ");
            int opiniao = prompt.nextInt();

            if (opiniao == 3) {
                tO++;
                sIO += idade;
            } else if (opiniao == 1) {
                tR++;
            } else if (opiniao == 2) {
                tB++;
            }
        }

        double mIO = (double) sIO / tO, pB = (double) tB / 15 * 100;

        System.out.println("\nResultados:");
        System.out.println("Média das idades das pessoas que responderam ótimo: " + mIO);
        System.out.println("Quantidade de pessoas que responderam regular: " + tR);
        System.out.println("Percentagem de pessoas que responderam bom: " + pB + "%");

	}

}
