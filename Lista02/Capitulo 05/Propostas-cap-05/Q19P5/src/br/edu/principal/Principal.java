package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);

        char tA;
        double preC, preV,lT = 0;
        int aLMais1000 = 0,aLMenos200 = 0;
       

        while (true) {
            System.out.print("Digite o tipo de ação ('F' para finalizar): ");
            tA = prompt.next().charAt(0);

            if (tA == 'F') {
                break;
            }

            System.out.print("Digite o preço de compra: ");
            preC = prompt.nextDouble();

            System.out.print("Digite o preço de venda: ");
            preV = prompt.nextDouble();

            double lucro = preV - preC;
            lT += lucro;

            if (lucro > 1000) {
                aLMais1000++;
            }

            if (lucro < 200) {
                aLMenos200++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Lucro total da empresa: R$" + lT);
        System.out.println("Quantidade de ações com lucro > R$ 1.000,00: " + aLMais1000);
        System.out.println("Quantidade de ações com lucro < R$ 200,00: " + aLMenos200);
	}

}
