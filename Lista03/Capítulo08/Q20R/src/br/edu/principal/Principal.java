package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[12][12];

        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                System.out.print("Digite o valor da matriz[" + (x + 1) + "][" + (y + 1) + "]: ");
                matriz[x][y] = scanner.nextDouble();
            }
        }

        double m = media_aritmetica(matriz);
        System.out.println("A média aritmética da matriz é: " + m);

        scanner.close();
    }

    public static double media_aritmetica(double[][] m) {
        double soma = 0;
        int cont = 0;

        for (int i = 1; i <= 11; i++) {
            for (int j = 11; j >= (13 - i); j--) {
                soma += m[i][j];
                cont++;
            }
        }

        return soma / cont;
    }
}
