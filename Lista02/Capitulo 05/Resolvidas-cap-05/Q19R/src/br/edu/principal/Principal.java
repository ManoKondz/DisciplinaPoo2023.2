package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, soma;

        System.out.print("Digite o valor de m: ");
        m = scanner.nextInt();

        System.out.print("Digite o valor de n: ");
        n = scanner.nextInt();

        while (m < n) {
            soma = 0;

            for (int i = m; i <= n; i++) {
                soma += i;
            }

            System.out.println("A soma dos números de " + m + " a " + n + " é: " + soma);

            System.out.print("\nDigite o valor de m: ");
            m = scanner.nextInt();

            System.out.print("Digite o valor de n: ");
            n = scanner.nextInt();
        }

    }
}

