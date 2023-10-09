package br.edu.principal;

import java.util.Scanner;
import java.lang.Math;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus formado pela escada com o chão: ");
        double anguloGraus = scanner.nextDouble();

        System.out.print("Digite a distância da escada à parede: ");
        double distanciaParede = scanner.nextDouble();

        double anguloRadianos = Math.toRadians(anguloGraus);

        double medidaEscada = distanciaParede / Math.cos(anguloRadianos);

        System.out.println("A medida da escada necessária é: " + medidaEscada);

    }
}
