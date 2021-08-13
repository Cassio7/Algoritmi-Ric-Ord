package algoritmiord.ric;

/**
 *
 * @author | (• ◡•)|Cassio(❍ᴥ❍ʋ)
 */
public class Ordinamento {

    static void bubblesortIte(int v1[]) {
        for (int i = 0; i < v1.length - 1; i++) {
            for (int c = 0; c < v1.length - i - 1; c++) {
                if (v1[c] > v1[c + 1]) {
                    int temp = v1[c];
                    v1[c] = v1[c + 1];
                    v1[c + 1] = temp;
                }
            }
        }
    }

    private static void bubblesortRic(int v1[], int end) {
        if (end > 1) {
            for (int i = 0; i < end; i++) {
                if (v1[i] > v1[i + 1]) {
                    int temp = v1[i];
                    v1[i] = v1[i + 1];
                    v1[i + 1] = temp;
                }
            }
            bubblesortRic(v1, end - 1);
        }
    }

    static void bubblesortRic(int v1[]) {
        bubblesortRic(v1, v1.length - 1);
    }

    private static void quicksortRic(int v1[], int start, int end) {
        if (start < end) {
            int mid = partition(v1, start, end);
            quicksortRic(v1, start, mid - 1);
            quicksortRic(v1, mid + 1, end);
        }
    }

    static void quicksortRic(int v1[]) {
        quicksortRic(v1, 0, v1.length - 1);
    }

    private static int partition(int[] v1, int start, int end) {
        int pivot = v1[start];
        do {
            while (start < end && v1[end] >= pivot) {
                end--;
            }
            if (start < end) {
                v1[start] = v1[end];
                while (start < end && v1[start] <= pivot) {
                    start++;
                }
                if (start < end) {
                    v1[end] = v1[start];
                }
            }
        } while (start < end);
        v1[start] = pivot;
        return start;
    }

}
