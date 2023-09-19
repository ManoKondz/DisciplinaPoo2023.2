package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int cont, cod, numVei, numAcid;
        int maior = 0, menor = 0, cidMaior = 0, cidMenor = 0;
        int somaVei = 0, somaAcid = 0, contAcid = 0;
        double mediaVei = 0, mediaAcid = 0;

        Scanner scanner = new Scanner(System.in);

        for (cont = 1; cont <= 5; cont++) {
            cod = scanner.nextInt();
            numVei = scanner.nextInt();
            numAcid = scanner.nextInt();

            if (cont == 1) {
                maior = numAcid;
                cidMaior = cod;
                menor = numAcid;
                cidMenor = cod;
            } else {
                if (numAcid > maior) {
                    maior = numAcid;
                    cidMaior = cod;
                }
                if (numAcid < menor) {
                    menor = numAcid;
                    cidMenor = cod;
                }
            }

            somaVei += numVei;

            if (numVei < 2000) {
                somaAcid += numAcid;
                contAcid++;
            }
        }

        mediaVei = somaVei / 5.0;

        System.out.println(maior + " " + cidMaior);
        System.out.println(menor + " " + cidMenor);
        System.out.println(mediaVei);

        if (contAcid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
        } else {
            mediaAcid = somaAcid / (double) contAcid;
            System.out.println(mediaAcid);
        }
    }
}
