import java.util.HashMap;

public class Main {
    public static int maxsubarray(int[] a, long k) {
        // Initialize variables
        long currSum = 0;
        int maxLength = 0;
        HashMap<Long, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < a.length; i++) {
            // Calculate current sum
            currSum += a[i];

            // Check if current sum is equal to k
            if (currSum == k) {
                maxLength = i + 1; // Update maximum length
            }

            // Check if there exists a previous prefix sum that makes the difference equal
            // to k
            if (map.containsKey(currSum - k)) {
                // Update maximum length if current length is greater
                maxLength = Math.max(maxLength, i - map.get(currSum - k));
            }

            // Store the current prefix sum along with its index
            if (!map.containsKey(currSum)) {
                map.put(currSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] a = { 10, 5, 2, 7, 1, 9 };
        long k = 15;
        int length = longestSubarrayWithSumK(a, k);
        System.out.println("Length of longest subarray with sum " + k + ": " + length);
    }
}
