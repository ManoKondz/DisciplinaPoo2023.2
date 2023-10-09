package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário de João: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor da primeira conta: ");
        double conta1 = scanner.nextDouble();

        System.out.print("Digite o valor da segunda conta: ");
        double conta2 = scanner.nextDouble();

        double multa1 = conta1 * 0.02;
        double multa2 = conta2 * 0.02;

        double totalPago = salario - (conta1 + multa1 + conta2 + multa2);

        System.out.println("O valor restante do salário de João é: " + totalPago);

    }
}
