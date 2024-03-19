import java.util.*;

public class frequent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for (int sa : arr) {

            if (!mp.containsKey(sa)) {
                mp.put(sa, 1);

            } else {
                mp.put(sa, mp.get(sa) + 1);
            }
        }
        System.out.println(mp.entrySet());

        int max = 0;
        int ans = -1;
        for (var s : mp.entrySet()) {
            if (s.getValue() > max) {
                max = s.getValue();
                ans = s.getKey();
            }

        }
        System.out.println("Max Frequency: " + max);
        System.out.println("Element with Max Frequency: " + ans);

    }

}
