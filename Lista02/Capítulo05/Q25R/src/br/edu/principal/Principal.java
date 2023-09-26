package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor do ângulo:");
        double angulo = scanner.nextDouble();

        int voltas = (int) (angulo / 360);
        angulo = angulo % 360;

        if (angulo < 0) {
            angulo += 360;
        }

        if (angulo % 90 == 0 && angulo != 0) {
            System.out.println("Está em cima de algum dos eixos");
        } else if (angulo > 0 && angulo < 90) {
            System.out.println("1o Quadrante");
        } else if (angulo > 90 && angulo < 180) {
            System.out.println("2o Quadrante");
        } else if (angulo > 180 && angulo < 270) {
            System.out.println("3o Quadrante");
        } else if (angulo > 270 && angulo < 360) {
            System.out.println("4o Quadrante");
        }

        System.out.println(voltas + " volta(s) no sentido " + (angulo < 0 ? "horário" : "anti-horário"));

    }
}
