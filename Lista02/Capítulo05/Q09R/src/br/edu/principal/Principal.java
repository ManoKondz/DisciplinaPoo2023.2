package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, n1, n2, ta = 0, te = 0, tr = 0;
        double media, total_classe = 0, media_classe;

        for (cont = 1; cont <= 6; cont++) {
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            media = (n1 + n2) / 2;

            if (media <= 3) {
                tr++;
            } else if (media > 3 && media < 7) {
                te++;
            } else {
                ta++;
            }

            total_classe += media;
        }

        System.out.println(tr);
        System.out.println(te);
        System.out.println(ta);

        media_classe = total_classe / 6;
        System.out.println(media_classe);
    }
}
