package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, cont_m2 = 0, tot = 0, cont_f1 = 0, menor_idade = 0;
        double media_idade = 0, perc = 0;
        String sexo, exp;

        idade = scanner.nextInt();

        while (idade != 0) {
            sexo = scanner.next();
            exp = scanner.next();

            if (sexo.equals("F") && exp.equals("S")) {
                if (tot == 0) {
                    menor_idade = idade;
                    tot = 1;
                } else if (idade < menor_idade) {
                    menor_idade = idade;
                }
                tot_f++;
            } else if (sexo.equals("M")) {
                tot_m++;
                if (idade > 45) {
                    cont_m1++;
                }
                if (exp.equals("S")) {
                    soma1 += idade;
                    cont_m2++;
                }
            }

            if (sexo.equals("F") && idade < 21 && exp.equals("S")) {
                cont_f1++;
            }

            idade = scanner.nextInt();
        }

        System.out.println(tot_f);
        System.out.println(tot_m);

        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência");
        } else {
            media_idade = (double) soma1 / cont_m2;
            System.out.println(media_idade);
        }

        if (tot_m == 0) {
            System.out.println("Nenhum homem");
        } else {
            perc = (double) cont_m1 * 100 / tot_m;
            System.out.println(perc);
        }

        System.out.println(cont_f1);
        System.out.println(menor_idade);
    }
}
