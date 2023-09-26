package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int A, B, C, I;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite um valor para A: ");
		A = prompt.nextInt();
		System.out.print("Digite um valor para B: ");
		B = prompt.nextInt();
		System.out.print("Digite um valor para C: ");
		C = prompt.nextInt();
		System.out.print("Digite um valor para I (Apenas 1,2 ou 3):");
		I = prompt.nextInt();
		if(I==1) {
			if (A < B && A < C) {
                if (B < C) {
                    System.out.println("A ordem crescente dos números é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
                }
            } else if (B < A && B < C) {
                if (A < C) {
                    System.out.println("A ordem crescente dos números é: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("A ordem crescente dos números é: " + B + " - " + C + " - " + A);
                }
            } else if (C < A && C < B) {
                if (A < B) {
                    System.out.println("A ordem crescente dos números é: " + C + " - " + A + " - " + B);
                } else {
                    System.out.println("A ordem crescente dos números é: " + C + " - " + B + " - " + A);
                }
            }
        } else if (I == 2) {
        	if (A > B && A > C) {
                if (B > C) {
                    System.out.println("A ordem decrescente dos números é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem decrescente dos números é: " + A + " - " + C + " - " + B);
                }} else if (B > A && B > C) {
                    if (A > C) {
                        System.out.println("A ordem decrescente dos números é: " + B + " - " + A + " - " + C);
                    } else {
                        System.out.println("A ordem decrescente dos números é: " + B + " - " + C + " - " + A);
                    }
                } else if (C > A && C > B) {
                    if (A > B) {
                        System.out.println("A ordem decrescente dos números é: " + C + " - " + A + " - " + B);
                    } else {
                        System.out.println("A ordem decrescente dos números é: " + C + " - " + B + " - " + A);
                    }
                }
        } else if (I == 3) {
        	if(A>B && A>C) {
        		System.out.println("A ordem desejada dos números é: " + B + " - " + A + " - " + C);
        	if(B>A && B>C) {
        		System.out.println("A ordem desejada dos números é: " + A + " - " + B + " - " + C);
        	if(C>A && C>B) {
        		System.out.println("A ordem desejada dos números é: " + A + " - " + C + " - " + B);
        	}
        	}
        	}
        } else {
            System.out.println("Valor inválido para I.");
        }

		}
	}

