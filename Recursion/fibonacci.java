public class fibonacci {

    static int fibo(int n) {

        if (n == 0 || n == 1) {
            return n;

        }
        int prev = fibo(n - 1);
        int prevpr = fibo(n - 2);

        return prev + prevpr;
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(fibo(i));
        }
    }
}
