package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[][] mat = new int[8][8];
        boolean simetria = true;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("Digite o valor para mat[" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (mat[i][j] != mat[j][i]) {
                    simetria = false;
                    break;
                }
            }
            if (!simetria) {
                break;
            }
        }

        if (simetria) {
            System.out.println("Matriz Simétrica");
        } else {
            System.out.println("Matriz Assimétrica");
        }
    }
}
