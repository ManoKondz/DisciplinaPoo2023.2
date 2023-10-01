package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[][] mat = new int[5][4];
        int lin_p = 2;
        int col_p = 1;
        int lin_i = 0;
        int col_i = 0;
        int tot = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha a matriz com 20 números (pares ou ímpares):");

        do {
            if (tot != 20) {
                System.out.print("Digite um número: ");
                int num = scanner.nextInt();
                int r = num % 2;

                if (r == 0) {
                    if (lin_p > 4) {
                        System.out.println("Sem espaço para números pares na parte superior da matriz.");
                    } else {
                        mat[lin_p][col_p] = num;
                        col_p++;
                        if (col_p > 3) {
                            lin_p += 2;
                            col_p = 1;
                        }
                    }
                } else {
                    if (lin_i > 4) {
                        System.out.println("Sem espaço para números ímpares na parte inferior da matriz.");
                    } else {
                        mat[lin_i][col_i] = num;
                        col_i++;
                        if (col_i > 3) {
                            lin_i += 2;
                            col_i = 0;
                        }
                    }
                }
                tot++;
            }
        } while (tot < 20);

        System.out.println("Matriz totalmente preenchida:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
