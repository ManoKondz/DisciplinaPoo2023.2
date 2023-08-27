package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double salario = 2500.50, perc = 15, nvsalario = 0, aumento = 0;
		aumento = salario * perc/100;
		nvsalario = aumento + salario;
		System.out.println("O salario é: " + nvsalario);
	}

}
