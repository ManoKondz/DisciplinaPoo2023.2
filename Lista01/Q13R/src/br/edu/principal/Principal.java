package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Double pes, pol, medjrd, medmh;
		Scanner prompt = new Scanner(System.in);
		pes = prompt.nextDouble();
		pol = 12*pes;
		medjrd = 3*pes;
		medmh = medjrd/ 1.760;
		System.out.println("As medidas são: polegada: " + pol + "Jardas: " + medjrd + "Milha: " + medmh);  
	}

}
