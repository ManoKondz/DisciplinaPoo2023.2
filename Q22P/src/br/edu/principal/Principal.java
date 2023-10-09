package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de lados do polígono convexo: ");
        int numeroLados = scanner.nextInt();
        
        int numeroDiagonais = (numeroLados * (numeroLados - 3)) / 2;

        System.out.println("O número de diagonais do polígono é: " + numeroDiagonais);

        scanner.close();
    }
}
