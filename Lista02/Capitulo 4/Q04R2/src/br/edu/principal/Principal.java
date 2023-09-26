package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		num1 = prompt.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = prompt.nextInt();
		System.out.print("Digite o terceiro numero: ");
		num3 = prompt.nextInt();
		 if (num1 <= num2 && num1 <= num3) {
	            if (num2 <= num3) {
	                System.out.println("A ordem crecente é" + num1 + "-" + num2 + "-" + num3);
	            } else {
	                System.out.println("A ordem crecente é" + num1 + "-" + num3 + "-" + num2);
	            }
	        } else if (num2 <= num1 && num2 <= num3) {
	            if (num1 <= num3) {
	                System.out.println("A ordem crecente é" + num2 + "-" + num1 + "-" + num3);
	            } else {
	                System.out.println("A ordem crecente é" + num2 + "-" + num3 + "-" + num1);
	            }
	        } else {
	            if (num1 <= num2) {
	                System.out.println("A ordem crecente é" + num3 + "-" + num1 + "-" + num2);
	            } else {
	                System.out.println("A ordem crecente é" + num3 + "-" + num2 + "-" + num1);
	            }
	        }
	    }
	}
