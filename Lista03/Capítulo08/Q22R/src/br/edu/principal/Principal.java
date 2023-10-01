package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet1 = new int[8];
        int[] vet2 = new int[8];
        int[] vet3 = new int[8];
        int cont1, cont2;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vet1[i] = scanner.nextInt();
        }

        cont1 = pares(vet1, vet2);

        if (cont1 == 0) {
            System.out.println("NENHUM PAR FOI DIGITADO");
        } else {
            System.out.println("Números pares digitados:");
            for (int i = 0; i < cont1; i++) {
                System.out.println(vet2[i]);
            }
        }

        cont2 = impares(vet1, vet3);

        if (cont2 == 0) {
            System.out.println("NENHUM ÍMPAR FOI DIGITADO");
        } else {
            System.out.println("Números ímpares digitados:");
            for (int i = 0; i < cont2; i++) {
                System.out.println(vet3[i]);
            }
        }

        scanner.close();
    }

    public static int pares(int[] v1, int[] v2) {
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            if (v1[i] % 2 == 0) {
                v2[cont] = v1[i];
                cont++;
            }
        }
        return cont;
    }

    public static int impares(int[] v1, int[] v2) {
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            if (v1[i] % 2 != 0) {
                v2[cont] = v1[i];
                cont++;
            }
        }
        return cont;
    }
}
