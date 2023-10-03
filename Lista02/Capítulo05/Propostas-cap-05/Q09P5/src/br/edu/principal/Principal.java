package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner prompt = new Scanner(System.in);

	        int tdi = 0,pe90Al150 = 0,pe190 = 0, pe10e30 = 0;
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Pessoa " + i);
	            System.out.print("Idade: ");
	            int idade = prompt.nextInt();
	            System.out.print("Peso (kg): ");
	            int peso = prompt.nextInt();
	            System.out.print("Altura (cm): ");
	            int altura = prompt.nextInt();

	            tdi += idade;

	            if (peso > 90 && altura < 150) {
	                pe90Al150++;
	            }

	            if (altura > 190) {
	                pe190++;
	                if (idade >= 10 && idade <= 30) {
	                    pe10e30++;
	                }
	}
	            double mediaIdades = (double) tdi / 10;
	            double per10e30M190 = (double) pe10e30 / pe190 * 100;

	            System.out.println("\nResultados:");
	            System.out.println("Média das idades: " + mediaIdades);
	            System.out.println("Pessoas com peso > 90kg e altura < 1,50m: " + pe90Al150);
	            System.out.println("Porcentagem de pessoas entre 10 e 30 anos com mais de 1,90m: " + per10e30M190 + "%");


	        }
	       }
	}
