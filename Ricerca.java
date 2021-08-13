package algoritmiord.ric;

/**
 *
 * @author Cassio
 */
public class Ricerca {

    private static int binariaRic(int v[], int start, int n, int end) {
        if (start > end) {
            return -1;
        } else {
            int centro = (start + end) / 2;
            int c = v[centro];
            if (c == n) {
                return centro;
            } else if (n > c) {
                return binariaRic(v, centro + 1, n, end);
            } else {
                return binariaRic(v, start, n, centro - 1);
            }
        }
    }

    static int binariaRic(int v[], int n) {
        return binariaRic(v, 0, n, v.length - 1);
    }

    static int binariaIte(int v[], int start, int n, int end) {
        while (start <= end) {
            int centro = (start + end) / 2;
            int c = v[centro];
            if (c == n) {
                return centro;
            } else if (n > c) {
                start = centro + 1;
            } else {
                end = centro - 1;
            }
        }
        return -1;
    }
}
