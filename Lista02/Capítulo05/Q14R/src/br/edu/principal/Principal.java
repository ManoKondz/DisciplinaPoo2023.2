package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor_inicial, juros, valor_parc, total, valor_juros;
        int num_parc, i;

        System.out.print("Digite o valor_inicial da dívida: ");
        valor_inicial = scanner.nextDouble();

        juros = 0;
        num_parc = 1;
        total = valor_inicial;
        valor_parc = valor_inicial;

        System.out.println(total);
        System.out.println(juros);
        System.out.println(num_parc);
        System.out.println(valor_parc);

        juros += 10;
        num_parc += 2;

        for (i = 1; i <= 4; i++) {
            valor_juros = valor_inicial * juros / 100;
            total = valor_inicial + valor_juros;
            valor_parc = total / num_parc;

            System.out.println(total);
            System.out.println(valor_juros);
            System.out.println(num_parc);
            System.out.println(valor_parc);

            juros += 5;
            num_parc += 3;
        }
    }
}
