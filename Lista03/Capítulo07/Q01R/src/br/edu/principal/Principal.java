package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[][] mat = new int[2][2];
        int[][] resultado = new int[2][2];
        int maior = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um valor para mat[" + (i+1) + "][" + (j+1) + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        maior = mat[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = maior * mat[i][j];
            }
        }

        System.out.println("Matriz Resultante:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
