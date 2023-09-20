package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont_time, cont_jog, idade, qtde = 0, tot80 = 0;
        double peso, alt, media_idade, media_altura = 0.0, porc;

        for (cont_time = 1; cont_time <= 5; cont_time++) {
            media_idade = 0;
            media_altura = 0;

            for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
                idade = sc.nextInt();
                peso = sc.nextDouble();
                alt = sc.nextDouble();

                if (idade < 18) {
                    qtde++;
                }

                media_idade += idade;
                media_altura += alt;

                if (peso > 80) {
                    tot80++;
                }
            }

            media_idade /= 11;
            media_altura /= 11;

            System.out.println(media_idade);
        }

        System.out.println(qtde);
        System.out.println(media_altura);
        porc = (tot80 * 100.0) / 55;
        System.out.println(porc);
    }
}
