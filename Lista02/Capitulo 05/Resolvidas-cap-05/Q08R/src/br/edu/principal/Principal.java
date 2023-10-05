package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int num_termos = 10;
        int num2 = 1;
        int num3 = 1;
        int i = 1;

        while (i <= num_termos) {
            num2 *= 3;
            System.out.println(num2);
            i++;

            if (i <= num_termos) {
                num3 *= 4;
                System.out.println(num3);
                i++;
            }
        }
    }
}
