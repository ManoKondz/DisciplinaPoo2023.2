package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, soma;

        do {
            System.out.print("Digite x: ");
            x = scanner.nextInt();
            System.out.print("Digite y: ");
            y = scanner.nextInt();

            if (x > y) {
                System.out.println("x deve ser menor ou igual a y. Tente novamente.");
                continue;
            }

            soma = primos(x, y);
            System.out.println("A soma dos números primos entre " + x + " e " + y + " é: " + soma);

        } while (x != y);

        scanner.close();
    }

    public static int primos(int x, int y) {
        int somatorio = 0;

        for (int i = x; i <= y; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont <= 2) {
                somatorio += i;
            }
        }

        return somatorio;
    }
}
