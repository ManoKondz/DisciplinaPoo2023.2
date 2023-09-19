package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int fim, i, j, expoente, num_termos;
        double x, den, denominador, fat, s;

        Scanner scanner = new Scanner(System.in);

        num_termos = scanner.nextInt();
        x = scanner.nextDouble();

        s = 0;
        denominador = 1;

        for (i = 1; i <= num_termos; i++) {
            fim = (int) denominador;
            fat = 1;

            for (j = 1; j <= fim; j++) {
                fat *= j;
            }

            expoente = i + 1;

            if (expoente % 2 == 0) {
                s -= Math.pow(x, expoente) / fat;
            } else {
                s += Math.pow(x, expoente) / fat;
            }

            if (denominador == 4) {
                den = -1;
            } else if (denominador == 1) {
                den = 1;
            }

            if (den == 1) {
                denominador += 1;
            } else {
                denominador -= 1;
            }
        }

        System.out.println(s);
    }
}
