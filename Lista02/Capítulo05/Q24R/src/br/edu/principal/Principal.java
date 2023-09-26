package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pre, valor_adic = 0.0, imposto = 0.0;
        double pre_custo = 0.0, desconto = 0.0, novo_pre = 0.0;
        String tipo = "", refrig = "";
        System.out.println("Entre com o preço:");
        pre = scanner.nextDouble();
        System.out.println("Entre com o tipo:");
        tipo = scanner.next();
        System.out.println("Entre com a refrigeração:");
        refrig = scanner.next();
        if (refrig == "N") {
            if (tipo == "A") {
                if (pre < 15) {
                    valor_adic = 2.0;
                } else {
                    valor_adic = 5.0;
                }
            } else if (tipo == "L") {
                if (pre < 10) {
                    valor_adic = 1.50;
                } else {
                    valor_adic = 2.50;
                }
            } else if (tipo == "V") {
                if (pre < 30) {
                    valor_adic = 3;
                } else {
                    valor_adic = 2.5;
                }
            }
        } else {
            if (tipo == "A") {
                valor_adic = 8;
            } else if (tipo == "L") {
                valor_adic = 0;
            } else if (tipo == "V") {
                valor_adic = 0;
            }
        }
        System.out.println("O valor adicional é:" + valor_adic);
        if (pre < 25) {
            imposto = (5/100) * pre;
        } else {
            imposto =  (8/100) * pre;
        }
        System.out.println("O valor do imposto é:" + imposto);
        pre_custo = pre + imposto;
        System.out.println("O preço de custo é:" + pre_custo);
        if (tipo != "A" && refrig != "S") {
            desconto = (3/100) * pre_custo;
        } else {
            desconto = 0;
        }
        System.out.println("O valor de desconto é: " + desconto);
        novo_pre = pre_custo + valor_adic - desconto;
        System.out.println("O novo preço é: " + novo_pre);
        if (novo_pre <=50) {
            System.out.println("Barato");
        } else if (novo_pre < 100) {
            System.out.println("Normal");
        } else {
            System.out.println("Caro");
        }
    }
}
