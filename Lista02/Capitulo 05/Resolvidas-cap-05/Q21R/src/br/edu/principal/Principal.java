package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, soma = 0, qtd = 0, maior = 0, menor = 0, qtd_par = 0, soma_par = 0, qtd_impar = 0;
        double media = 0, media_par = 0, perc = 0;

        num = scanner.nextInt();

        while (num != 30000) {
            if (qtd == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }

            soma += num;
            qtd++;

            if (num % 2 == 0) {
                soma_par += num;
                qtd_par++;
            } else {
                qtd_impar++;
            }

            num = scanner.nextInt();
        }

        if (qtd == 0) {
            System.out.println("Nenhum número digitado");
        } else {
            System.out.println(soma);
            System.out.println(qtd);
            media = (double) soma / qtd;
            System.out.println(media);
            System.out.println(maior);
            System.out.println(menor);

            if (qtd_par == 0) {
                System.out.println("Nenhum número par");
            } else {
                media_par = (double) soma_par / qtd_par;
                System.out.println(media_par);
            }

            perc = (double) qtd_impar * 100 / qtd;
            System.out.println(perc);
        }
    }
}
