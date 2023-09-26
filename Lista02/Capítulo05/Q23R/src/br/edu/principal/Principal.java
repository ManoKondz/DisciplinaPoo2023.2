package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, qtd, tipo, valor_kw, gasto, acresc, total, tot_geral = 0;
        int qtd_cons = 0;

        sal = scanner.nextDouble();
        qtd = scanner.nextDouble();

        valor_kw = sal / 8;

        while (qtd != 0) {
            gasto = qtd * valor_kw;
            tipo = scanner.nextDouble();

            if (tipo == 1) {
                acresc = gasto * 5 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10 / 100;
            } else if (tipo == 3) {
                acresc = gasto * 15 / 100;
            } else {
                acresc = 0;
            }

            total = gasto + acresc;
            tot_geral += total;

            if (total >= 500 && total <= 1000) {
                qtd_cons++;
            }

            System.out.println(gasto);
            System.out.println(acresc);
            System.out.println(total);

            qtd = scanner.nextDouble();
        }

        System.out.println(tot_geral);
        System.out.println(qtd_cons);
    }
}
