import java.util.HashMap;
import java.util.Map;

public class countfrequency {

    public static int[] countFrequency(int n, int x, int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i : nums) {
            if (!mp.containsKey(i)) {
                mp.put(i, 1);
            } else {
                mp.put(i, mp.get(i) + 1);
            }
        }

        int[] frequencyArray = new int[n];
        for (int w = 0; w < n; w++) {
            frequencyArray[w] = mp.containsKey(w + 1) ? mp.get(w + 1) : 0;
        }

        return frequencyArray;
    }

}
