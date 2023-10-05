package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cod, num_h, cont_m = 0, cont_f = 0;
        double sal_b, sal_l = 0.0, media_m = 0, media_f = 0;
        String sexo;

        cod = scanner.nextInt();

        while (cod != 99999) {
            sexo = scanner.next();
            num_h = scanner.nextInt();
            sal_b = num_h * 30;

            if (sexo.equals("M")) {
                sal_l = sal_b - (sal_b * 10 / 100);
                media_m += sal_l;
                cont_m++;
            } else if (sexo.equals("F")) {
                sal_l = sal_b - (sal_b * 5 / 100);
                media_f += sal_l;
                cont_f++;
            }

            System.out.println(cod);
            System.out.println(sal_b);
            System.out.println(sal_l);

            cod = scanner.nextInt();
        }

        if (cont_m == 0) {
            System.out.println("Nenhum professor do sexo masculino");
        } else {
            media_m /= cont_m;
            System.out.println(media_m);
        }

        if (cont_f == 0) {
            System.out.println("Nenhum professor do sexo feminino");
        } else {
            media_f /= cont_f;
            System.out.println(media_f);
        }
    }
}
