package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double pre, venda, nvpre;
        Scanner prompt = new Scanner(System.in);
        System.out.print("Digite o preço atual: ");
        pre = prompt.nextDouble();
        System.out.print("Digite a venda media mensal: ");
        venda = prompt.nextDouble();
        if(venda < 500 || pre < 30) {
            nvpre = pre + (10/100 * pre); 
        } else if((venda >= 500 && venda < 1200) || (pre >= 30 && pre < 80)){ 
            nvpre = pre + (15/100 * pre); 
        } else if(venda >= 1200 || pre >= 80) {
            nvpre = pre - (20/100 * pre); 
        } else {
            nvpre = pre; 
        }
        System.out.print("O novo preço é "+ nvpre);
    }
}
