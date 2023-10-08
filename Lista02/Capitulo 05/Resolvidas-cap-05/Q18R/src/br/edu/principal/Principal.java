package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num, quad, cubo, raiz;

        System.out.print("Digite um número (para encerrar, digite um número menor ou igual a 0): ");
        num = scanner.nextDouble();

        while (num > 0) {
            quad = num * num;
            cubo = num * num * num;
            raiz = Math.sqrt(num);

            System.out.println("O quadrado de " + num + " é: " + quad);
            System.out.println("O cubo de " + num + " é: " + cubo);
            System.out.println("A raiz quadrada de " + num + " é: " + raiz);

            System.out.print("\nDigite outro número (para encerrar, digite um número menor ou igual a 0): ");
            num = scanner.nextDouble();
        }

        System.out.println("Programa encerrado.");
    }
}
