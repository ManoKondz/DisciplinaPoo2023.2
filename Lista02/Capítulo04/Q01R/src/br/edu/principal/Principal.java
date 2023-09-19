package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaTrabalho, avaliacaoSemestral, notaExame, media;

        System.out.print("Digite a nota do trabalho de laboratório: ");
        notaTrabalho = scanner.nextDouble();

        System.out.print("Digite a nota da avaliação semestral: ");
        avaliacaoSemestral = scanner.nextDouble();

        System.out.print("Digite a nota do exame final: ");
        notaExame = scanner.nextDouble();

        media = (notaTrabalho * 2 + avaliacaoSemestral * 3 + notaExame * 5) / 10;
        System.out.println("Média ponderada: " + media);

        if (media >= 8 && media <= 10) {
            System.out.println("Obteve conceito A");
        } else if (media >= 7 && media < 8) {
            System.out.println("Obteve conceito B");
        } else if (media >= 6 && media < 7) {
            System.out.println("Obteve conceito C");
        } else if (media >= 5 && media < 6) {
            System.out.println("Obteve conceito D");
        } else if (media >= 0 && media < 5) {
            System.out.println("Obteve conceito F");
        } else {
            System.out.println("Média inválida. Certifique-se de que as notas estejam dentro do intervalo de 0 a 10.");
        }
    }
}
