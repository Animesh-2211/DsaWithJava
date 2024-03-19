//shirts

//place the element in its postion in sorted lise 

public class InsertionSort {

    static void InsertionSort(int[] a) {

        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }

    }

    public static void main(String[] args) {

        int[] a = { 8, 3, 5, 3, 5, 1 };

        InsertionSort(a);
        for (int val : a) {
            System.out.println(val + " ");
        }
    }

}
