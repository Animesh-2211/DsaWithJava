import java.util.*;

public class factorial {

    static int factorial(int n) {

        if (n == 0) {
            return 1;

        }
        // smaller work
        int fact = factorial(n - 1);

        // self work
        int ans = n * fact;
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.println(factorial(n));

    }

}
