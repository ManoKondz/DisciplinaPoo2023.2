package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double dep = 2500.89 , taxa = 25 , rend = 0 , total = 0;
		rend = dep * taxa/100;
		total = dep + taxa;
		System.out.println("O rendimento é: " + rend);
		System.out.println("O total é: " + total);
	}

}
