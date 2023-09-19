package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int cont, codigo, nht;
        double valor, salMin, salInicial, aux, salFinal;
        String turno, categoria;

        Scanner scanner = new Scanner(System.in);

        salMin = 450;

        for (cont = 1; cont <= 10; cont++) {
            codigo = scanner.nextInt();
            nht = scanner.nextInt();
            turno = scanner.next();
            categoria = scanner.next();

            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                turno = scanner.next();
            }

            while (!categoria.equals("G") && !categoria.equals("O")) {
                categoria = scanner.next();
            }

            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = salMin * 18 / 100;
                } else {
                    valor = salMin * 15 / 100;
                }
            } else {
                if (turno.equals("N")) {
                    valor = salMin * 13 / 100;
                } else {
                    valor = salMin * 10 / 100;
                }
            }

            salInicial = nht * valor;

            if (salInicial <= 300) {
                aux = salInicial * 20 / 100;
            } else if (salInicial < 600) {
                aux = salInicial * 15 / 100;
            } else {
                aux = salInicial * 5 / 100;
            }

            salFinal = salInicial + aux;

            System.out.println(codigo + " " + nht + " " + valor + " " + salInicial + " " + aux + " " + salFinal);
        }
    }
}
