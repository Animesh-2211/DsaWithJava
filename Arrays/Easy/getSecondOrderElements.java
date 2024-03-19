public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        int small = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                secondlargest = largest;
                largest = a[i];
            } else if (a[i] > secondlargest && a[i] != largest) {
                secondlargest = a[i];
            }
        }

        for (int j = 0; j < n; j++) {

            if (a[j] < small) {
                secondsmallest = small;
                small = a[j];
            } else if (a[j] < secondsmallest && a[j] != small) {
                secondsmallest = a[j];
            }

        }
        return new int[] { secondlargest, secondsmallest };

    }
}