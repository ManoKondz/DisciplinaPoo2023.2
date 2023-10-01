package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String[] lojas = new String[8];
        String[] produtos = new String[4];
        double[][] precos = new double[4][8];

        Scanner scanner = new Scanner(System.in);

        for (int j = 0; j < 8; j++) {
            System.out.print("Digite o nome da loja " + (j + 1) + ": ");
            lojas[j] = scanner.next();
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.next();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("Digite o preço de " + produtos[i] + " na loja " + lojas[j] + ": ");
                precos[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Produtos com preços menores que 120:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (precos[i][j] < 120) {
                    System.out.println(produtos[i] + " na loja " + lojas[j]);
                }
            }
        }
    }
}
