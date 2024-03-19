import java.util.*;

public class natural {

    static void pi(int n) { // n=5 so 12345,n=3 so 123
        if (n == 1) {
            System.out.print(1);
            return;
        }

        pi(n - 1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            pi(n);

        }
    }
}