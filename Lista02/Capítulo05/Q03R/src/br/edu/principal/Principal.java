package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n, num, i, j;
        long fat;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            fat = 1;
            for (j = 1; j <= num; j++) {
                fat *= j;
            }

            System.out.println(fat);
        }
    }
}
