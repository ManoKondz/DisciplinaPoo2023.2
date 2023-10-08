package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura, area;

        do {
            System.out.print("Digite a base do triângulo (um número positivo): ");
            base = scanner.nextDouble();
        } while (base <= 0);

        do {
            System.out.print("Digite a altura do triângulo (um número positivo): ");
            altura = scanner.nextDouble();
        } while (altura <= 0);

        area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);

    }
}
