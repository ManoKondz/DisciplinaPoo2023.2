package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int volta, angu;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o angulo: ");
		angu = prompt.nextInt();
		if(angu > 360 || angu < -360) {
			volta = angu / 360;
			angu = angu % 360;
		}else {
			volta = 0;
		}
		if(angu == 0 || angu == 90 || angu == 180 || angu == 270 || angu == 360
                || angu == -90 || angu == -180 || angu == -270 || angu == -360) {
			System.out.println("Esta em cima de alguns dos eixos");
		}
		if((angu > 90 && angu < 180) || (angu < -180 && angu > -270)) {
			System.out.println("1° Quadrante");
		}
		if((angu > 180 && angu < 270) || (angu < -90 && angu > -180)){
            System.out.println("3o Quadrante");
		}
		if((angu > 180 && angu < 270) || (angu < -90 && angu > -180)) {
            System.out.println("3o Quadrante");
        }
		if ((angu > 270 && angu < 360) || (angu < 0 && angu > -90)) {
            System.out.println("4o Quadrante");
        }
		System.out.println(volta + " volta(s) no sentido " + (angu < 0 ? "horário" : "anti-horário"));
    
	}

}
