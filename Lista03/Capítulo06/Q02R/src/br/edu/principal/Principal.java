package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] qtd = new int[10];
        double[] preco = new double[10];
        int tot_geral = 0;
        int tot_vend;
        double comissao;
        int maior = 0;
        int ind = 0;

        System.out.println("Digite a quantidade e o preço de 10 produtos:");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Quantidade do produto %d: ", i + 1);
            qtd[i] = scanner.nextInt();
            System.out.printf("Preço do produto %d: ", i + 1);
            preco[i] = scanner.nextDouble();
        }

        System.out.println("Detalhes das vendas:");

        for (int i = 0; i < 10; i++) {
            tot_vend = qtd[i] * (int) preco[i];
            System.out.printf("Quantidade: %d, Preço: %.2f, Total da venda: %d%n", qtd[i], preco[i], tot_vend);
            tot_geral += tot_vend;
        }

        comissao = tot_geral * 5.0 / 100.0;

        System.out.printf("Total Geral de Vendas: %d%n", tot_geral);
        System.out.printf("Comissão: %.2f%n", comissao);

        for (int i = 0; i < 10; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = i;
            }
        }

        System.out.println("Produto com maior quantidade vendida:");
        System.out.printf("Preço: %.2f, Índice: %d%n", preco[ind], ind);
    }
}
