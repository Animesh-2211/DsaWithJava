import java.util.*;

public class TUF {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != a[i]) {
                    Union.add(a[i]);
                }
                i++;

            } else if (a[i] > b[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != b[j]) {
                    Union.add(b[j]);
                }
                j++;

            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != a[i]) {
                    Union.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != a[i]) {
                Union.add(a[i]);
            }
            i++;
        }

        while (j < m) {
            if (Union.size() == 0 || Union.get(Union.size() - 1) != b[j]) {
                Union.add(b[j]);
            }
            j++;

        }

        return Union;

    }
}