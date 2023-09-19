package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int i, num, qtde = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o número desejado:");
        num = scanner.nextInt();
        for (i = 1; i <= num; i++) {
            if(num%i==0) {
                qtde += 1;
            }
        }
        if (qtde > 2) {
            System.out.println("Número não primo");
        } else {
            System.out.println("Número primo");
        }
    }
}
