package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int i, anoAtual;
        double salario, novoSalario, percentual;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        salario = 1000;
        percentual = 1.5 / 100;
        novoSalario = salario + percentual * salario;

        for (i = 2007; i <= anoAtual; i++) {
            percentual = 2 * percentual;
            novoSalario = novoSalario + percentual * novoSalario;
        }

        System.out.println("Novo salário após " + anoAtual + " anos: " + novoSalario);
    }
}
