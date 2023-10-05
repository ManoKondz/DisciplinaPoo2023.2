package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        double preco, custo_est, imp, preco_final, adicional = 0, maior_p = 0, menor_p = 0, tot_imp = 0;
        int qtd_b = 0, qtd_n = 0, qtd_c = 0;
        String refri, categ;

        for (i = 1; i <= 12; i++) {
            preco = scanner.nextDouble();
            refri = scanner.next();
            categ = scanner.next();

            custo_est = 0;
            imp = 0;

            if (preco <= 20) {
                if (categ.equals("A")) {
                    custo_est = 2;
                } else if (categ.equals("L")) {
                    custo_est = 3;
                } else if (categ.equals("V")) {
                    custo_est = 4;
                }
            } else if (preco > 20 && preco <= 50) {
                if (refri.equals("S")) {
                    custo_est = 6;
                } else {
                    custo_est = 0;
                }
            } else if (preco > 50) {
                if (refri.equals("S")) {
                    if (categ.equals("A")) {
                        custo_est = 5;
                    } else if (categ.equals("L")) {
                        custo_est = 2;
                    } else if (categ.equals("V")) {
                        custo_est = 4;
                    }
                } else {
                    if (categ.equals("A") || categ.equals("V")) {
                        custo_est = 0;
                    } else if (categ.equals("L")) {
                        custo_est = 1;
                    }
                }
            }

            if (!categ.equals("A") && !refri.equals("S")) {
                imp = preco * 4 / 100;
            } else {
                imp = preco * 2 / 100;
            }

            preco_final = preco + custo_est + imp;

            System.out.println(custo_est);
            System.out.println(imp);
            System.out.println(preco_final);

            if (preco_final <= 20) {
                qtd_b++;
                System.out.println("Classificação Barato");
            } else if (preco_final > 20 && preco_final <= 100) {
                qtd_n++;
                System.out.println("Classificação Normal");
            } else {
                qtd_c++;
                System.out.println("Classificação Caro");
            }

            adicional += custo_est + imp;
            tot_imp += imp;

            if (i == 1) {
                maior_p = preco_final;
                menor_p = preco_final;
            } else {
                if (preco_final > maior_p) {
                    maior_p = preco_final;
                }
                if (preco_final < menor_p) {
                    menor_p = preco_final;
                }
            }
        }

        adicional /= 12;

        System.out.println(adicional);
        System.out.println(maior_p);
        System.out.println(menor_p);
        System.out.println(tot_imp);
        System.out.println(qtd_b);
        System.out.println(qtd_n);
        System.out.println(qtd_c);
    }
}
