package algoritmiord.ric;

import java.util.Random;

/**
 *
 * @author Cassio
 */
public class AlgoritmiOrdRic {

    static int v2[];

    public static void main(String[] args) {
        int v[] = {1, 2, 5, 7, 10, 15, 16, 17, 19, 22, 29, 31, 34};
        int v1[] = {2, 8, 7, 1, 5, 656, 12, 35, 4, 65, 98, 58};
        System.out.println("Ricerca binaria prima ricorsiva poi iterativa:");
        System.out.println(Ricerca.binariaRic(v, 22));
        System.out.println(Ricerca.binariaIte(v, 0, 22, v.length - 1));
        randomV();
        System.out.println();
        System.out.println("Ordinamento: ");
        for (int i : v1) {
            System.out.println(i);
        }
        System.out.println();
        Ordinamento.bubblesortRic(v1);
        for (int i : v1) {
            System.out.println(i);
        }
        /*
        System.out.println();
        stampaV2();
        Ordinamento.quicksortRic(v2);
        System.out.println();
        System.out.println();
        stampaV2();
*/    
}

    static void randomV() {
        int a = 1000;
        v2 = new int[a];
        Random r = new Random();
        for (int i = 0; i < v2.length - 1; i++) {
            v2[i] = r.nextInt(10000) + 1;
        }
    }

    static void stampaV2() {
        //stampa dell'array random divisi per 10
        for (int i = 0; i < v2.length - 1; i++) {
            System.out.print(v2[i] + " ");
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }
    }
}
