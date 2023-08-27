package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num = 8, quad = 2, cubo = 3, r2 = 0, r3 = 0, resultado1 = 0, resultado2 = 0;
		resultado1 = Math.pow(num, quad);
		resultado2 = Math.pow(num, cubo);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		System.out.println("Os resultados são " + " " + resultado1 + " " + resultado2 + " " + r2 + " " + r3 );
	}

}
