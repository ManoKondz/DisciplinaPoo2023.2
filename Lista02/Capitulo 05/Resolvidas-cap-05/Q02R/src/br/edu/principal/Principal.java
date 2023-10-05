package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int n, e, i, j;
        double fat, resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        n = scanner.nextInt();

        e = 1;
        resultado = 1;

        for (i = 1; i <= n; i++) {
            fat = 1;
            for (j = 1; j <= i; j++) {
                fat = fat * j;
            }
            resultado = resultado + 1.0 / fat;
        }

        System.out.println(resultado);
    }
}
