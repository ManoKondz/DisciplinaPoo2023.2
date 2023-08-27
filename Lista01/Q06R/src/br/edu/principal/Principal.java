package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal = 2500.50, salreceber = 0, grat = 0, imposto = 0;
		grat = sal * 5/100;
		imposto = sal * 7/100;
		salreceber = sal + grat - imposto;
		System.out.println("Ele tem que receber: " + salreceber);
	}

}
