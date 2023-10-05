package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		double pes ,medpol, medjrd, medmh;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite a medida em pes: ");
		pes = prompt.nextDouble();		
		medpol = pes * 12;
		medjrd =pes / 3;
		medmh = medjrd / 1.760;
		System.out.println("As medidas são");
		System.out.println("Polegadas: " + medpol);
		System.out.println("Jarda: " + medjrd);
		System.out.println("Milha: " + medmh);
		}

	}

