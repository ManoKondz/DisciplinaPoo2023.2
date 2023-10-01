package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] gabarito = new char[10];
        char[] resposta = new char[10];
        int num, pontos, tot_ap = 0;
        double perc_ap;

        System.out.println("Digite as respostas do gabarito (A, B, C ou D):");

        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número do aluno: ");
            num = scanner.nextInt();
            pontos = 0;

            for (int j = 0; j < 10; j++) {
                System.out.print("Resposta do aluno " + num + " para a questão " + (j + 1) + ": ");
                resposta[j] = scanner.next().charAt(0);

                if (resposta[j] == gabarito[j]) {
                    pontos++;
                }
            }

            System.out.println("A nota do aluno " + num + " foi " + pontos + " pontos.");

            if (pontos >= 6) {
                tot_ap++;
            }
        }

        perc_ap = tot_ap * 100.0 / 10.0;

        System.out.println("O percentual de alunos aprovados é " + perc_ap + "%");
    }
}
