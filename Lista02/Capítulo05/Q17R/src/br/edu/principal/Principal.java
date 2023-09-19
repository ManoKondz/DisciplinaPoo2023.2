package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salCarlos, salJoao;
        int meses = 0;
        System.out.println("Qual o salário de Carlos?");
        salCarlos = scanner.nextDouble();
        salJoao = salCarlos / 3;
        while (salJoao < salCarlos) {
            salCarlos += (salCarlos * (2.0/100.0));
            salJoao += (salJoao * (5.0/100.0));
            meses += 1;
        }
        System.out.println("A quantidade de meses necessária será de " + meses);
    }
}
