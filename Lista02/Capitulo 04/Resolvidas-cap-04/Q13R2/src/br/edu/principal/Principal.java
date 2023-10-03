package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double op, sal, imp = 0, aum = 0, nvsal;
        Scanner prompt = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1 - IMPOSTO");
        System.out.println("2 - NOVO SALARIO");
        System.out.println("3 - CLASSIFICAÇÃO");
        System.out.println("DIGITE A OPÇÃO DESEJADA: ");
        op = prompt.nextDouble();
        if (op == 1) {
            System.out.print("Digite o seu salario: ");
            sal = prompt.nextDouble();
            if (sal < 500) {
                imp = sal * 5 / 100;
            }
            if (sal >= 500 && sal <= 850) {
                imp = sal * 10 / 100;
            }
            if (sal > 850) {
                imp = sal * 15 / 100;
            }
            System.out.print("O imposto que você deve pagar é " + imp);
        }
        if (op == 2) {
            System.out.print("Digite o seu salario: ");
            sal = prompt.nextDouble();
            if (sal > 1500) {
                aum = 25;
            }
            if (sal >= 750 && sal <= 1500) {
                aum = 50;
            }
            if (sal >= 450 && sal < 750) {
                aum = 75;
            }
            if (sal < 450) {
                aum = 100;
            }
            nvsal = sal + aum;
            System.out.println("O novo salario é " + nvsal);
        }
        if (op == 3) {
            System.out.print("Digite o seu salario: ");
            sal = prompt.nextDouble();
            if (sal <= 700) {
                System.out.println("Mal remunerado.");
            } else {
                System.out.println("Bem remunerado");
            }
        }
        if (op < 1 || op > 3) {
            System.out.println("Opção invalida.");
        }
    }
}
