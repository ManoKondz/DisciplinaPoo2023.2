package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, res;
        char op;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        do {
            System.out.print("Digite a operação (+ ou *): ");
            op = scanner.next().charAt(0);
        } while (op != '+' && op != '*');

        res = calculo(num1, num2, op);
        System.out.println("O resultado da operação é: " + res);

        scanner.close();
    }

    public static double calculo(double n1, double n2, char simbolo) {
        double result;
        if (simbolo == '+') {
            result = n1 + n2;
        } else {
            result = n1 * n2;
        }
        return result;
    }
}
