package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o número de horas extras trabalhadas: ");
        double horasExtras = scanner.nextDouble();

        double valorHoraTrabalhada = salarioMinimo / 8;
        double valorHoraExtra = salarioMinimo / 4;
        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        double quantiaHorasExtras = horasExtras * valorHoraExtra;
        double salarioReceber = salarioBruto + quantiaHorasExtras;

        System.out.println("O salário a receber é: " + salarioReceber);

    }
}

