package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int cont, num1, num2, res;
        num1 = 0;
        num2 = 1;

        System.out.println(num1);
        System.out.println(num2);

        for (cont = 3; cont <= 8; cont++) {
            res = num1 + num2;
            System.out.println(res);
            num1 = num2;
            num2 = res;
        }
    }
}
