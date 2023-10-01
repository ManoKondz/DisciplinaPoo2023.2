package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String[] nome = new String[5];
        double[][] preco = new double[5][4];
        double[][] imp = new double[5][4];
        double[] custo = new double[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            nome[i] = scanner.next();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o preço do produto " + nome[i] + " na loja " + (j + 1) + ": ");
                preco[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o custo do produto " + nome[i] + ": ");
            custo[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Nome do produto: " + nome[i]);
            System.out.println("Custo: " + custo[i]);
            for (int j = 0; j < 4; j++) {
                if (preco[i][j] <= 50) {
                    imp[i][j] = preco[i][j] * 5 / 100;
                } else if (preco[i][j] > 50 && preco[i][j] <= 100) {
                    imp[i][j] = preco[i][j] * 10 / 100;
                } else {
                    imp[i][j] = preco[i][j] * 15 / 100;
                }
                double finalPrice = preco[i][j] + imp[i][j] + custo[i];
                System.out.println("Imposto na loja " + (j + 1) + ": " + imp[i][j]);
                System.out.println("Preço na loja " + (j + 1) + ": " + preco[i][j]);
                System.out.println("Preço final na loja " + (j + 1) + ": " + finalPrice);
            }
            System.out.println();
        }
    }
}
