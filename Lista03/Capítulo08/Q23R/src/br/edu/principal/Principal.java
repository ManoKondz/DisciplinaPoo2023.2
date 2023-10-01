package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mat = new int[3][4];
        int[] vet = new int[12];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da matriz[" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        gera_vetor(mat, vet);

        System.out.println("O vetor gerado a partir da matriz é:");
        for (int i = 0; i < 12; i++) {
            System.out.println(vet[i]);
        }

        scanner.close();
    }

    public static void gera_vetor(int[][] m, int[] v) {
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                v[k] = m[i][j];
                k++;
            }
        }
    }
}
