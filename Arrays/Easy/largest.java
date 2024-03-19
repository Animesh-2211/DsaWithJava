import java.util.*;

public class Solution {

    static int largest(int[] arr, int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0]; // Initialize max to the first element

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if the current element is greater
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 90 };
        int n = arr.length;

        try {
            int largest = largestElement(arr, n);
            System.out.println("Largest Element: " + largest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
