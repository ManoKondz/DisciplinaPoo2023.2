package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] corredor = new int[25];
        int[] janela = new int[25];
        boolean achou;

        for (int i = 1; i <= 24; i++) {
            corredor[i] = 0;
            janela[i] = 0;
        }

        int op;
        String posicao;
        int num;

        do {
            System.out.println("1- Vender passagem");
            System.out.println("2- Mostrar mapa de ocupação do ônibus");
            System.out.println("3- Encerrar");
            op = scanner.nextInt();

            if (op == 1) {
                achou = false;

                for (int i = 1; i <= 24; i++) {
                    if (corredor[i] == 0 || janela[i] == 0) {
                        achou = true;
                    }
                }

                if (!achou) {
                    System.out.println("Ônibus lotado");
                } else {
                    do {
                        System.out.println("Escolha a posição (J - Janela, C - Corredor):");
                        posicao = scanner.next();

                        while (!posicao.equals("J") && !posicao.equals("C")) {
                            System.out.println("Posição inválida. Escolha J (Janela) ou C (Corredor):");
                            posicao = scanner.next();
                        }

                        System.out.println("Escolha o número da poltrona (1-24):");
                        num = scanner.nextInt();

                        while (num < 1 || num > 24) {
                            System.out.println("Número da poltrona inválido. Escolha entre 1 e 24:");
                            num = scanner.nextInt();
                        }

                        if (posicao.equals("J") && janela[num] == 1) {
                            System.out.println("Poltrona ocupada");
                        } else if (posicao.equals("C") && corredor[num] == 1) {
                            System.out.println("Poltrona ocupada");
                        } else {
                            System.out.println("Venda efetivada");
                            if (posicao.equals("J")) {
                                janela[num] = 1;
                            } else {
                                corredor[num] = 1;
                            }
                        }
                    } while (!posicao.equals("J") && !posicao.equals("C"));
                }
            } else if (op == 2) {
                System.out.println("JANELA CORREDOR");

                for (int i = 1; i <= 24; i++) {
                    if (janela[i] == 0) {
                        System.out.println(i + "- Livre (Janela)");
                    } else {
                        System.out.println(i + "- Ocupada (Janela)");
                    }

                    if (corredor[i] == 0) {
                        System.out.println(i + "- Livre (Corredor)");
                    } else {
                        System.out.println(i + "- Ocupada (Corredor)");
                    }
                }
            }
        } while (op != 3);
    }
}
