public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here\
        int[] arr = new int[x];
        arr = fillArray(x, arr);
        return arr;
        // Write Your Code Here

    }

    public static int[] fillArray(int x, int[] arr) {
        if (x == 1)
            arr[0] = 1;
        else {
            arr[x - 1] = x;
            fillArray(x - 1, arr);
        }
        return arr;

    }
}