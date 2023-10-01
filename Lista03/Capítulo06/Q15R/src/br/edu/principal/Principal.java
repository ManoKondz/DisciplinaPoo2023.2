package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[5];
        boolean achou;

        System.out.println("Digite os valores do primeiro vetor (vet1):");

        for (int i = 0; i < 10; i++) {
            vet1[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor (vet2):");

        for (int i = 0; i < 5; i++) {
            vet2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            achou = false;
            System.out.println("Valor em vet1[" + i + "]: " + vet1[i]);

            for (int j = 0; j < 5; j++) {
                if (vet1[i] % vet2[j] == 0) {
                    System.out.println("Divisível por " + vet2[j] + " na posição " + j);
                    achou = true;
                }
            }

            if (!achou) {
                System.out.println("Não possui divisores no segundo vetor");
            }
        }
    }
}
