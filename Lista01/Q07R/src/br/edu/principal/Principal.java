package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal = 2500.50, salreceber = 0, imp = 0;
		imp = sal * 10/100;
		salreceber = sal + 50 - imp;
		System.out.println("O salario a receber é: " + salreceber);
	}

}
