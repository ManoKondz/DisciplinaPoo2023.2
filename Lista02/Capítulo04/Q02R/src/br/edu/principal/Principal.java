package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media, notaExame;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média aritmética: " + media);

        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Exame");
            notaExame = 12 - media;
            System.out.println("Deve tirar nota " + notaExame + " para ser aprovado");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        }
    }
}
