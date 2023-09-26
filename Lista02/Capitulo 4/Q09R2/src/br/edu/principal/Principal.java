package br.edu.principal;

import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
	    	 int t, d, dia, mes, ano, hora, min;
			 Scanner prompt = new Scanner(System.in);
			 System.out.print("Digite o dia: ");
			 dia = prompt.nextInt();
			 System.out.print("Digite o mes: (entre 1 a 12)");
			 mes = prompt.nextInt();
			 System.out.print("Digite o ano: ");
			 ano = prompt.nextInt();
			 if (ano == 1) {
				 System.out.println("Janeiro");
			 }
			 if(ano == 2) {
				 System.out.println("Fevereiro");
			 }
			 if(ano == 3) {
				 System.out.println("Março");
			 }
			 if(ano == 4) {
				 System.out.println("Abril");
			 }
			 if(ano == 5) {
				 System.out.println("Maio");
			 }
		     if(ano == 6) {
		    	 System.out.println("Junho");
		     }
		     if(ano == 7) {
		    	 System.out.println("Julho");
		     }
		     if(ano == 8) {
		    	 System.out.println("Agosto");
		     }
		     if(ano == 9) {
		    	 System.out.println("Setembro");
		     }
		     if(ano == 10) {
		    	 System.out.println("Outubro");
		     }
		     if(ano == 11) {
		    	 System.out.println("Novembro");
		     }
		     if(ano == 12) {
		    	 System.out.println("Dezembro");
		     }
		     System.out.println("A data atual é: " + dia + "/" + mes + "/" + ano );
		     System.out.print("Digite a hora: ");
		     hora = prompt.nextInt();
		     System.out.print("Digite os minutos: ");
		     min = prompt.nextInt();
		     System.out.println("Hora atual:" + "\n" + hora + ":" + min);
	        }
	    }

