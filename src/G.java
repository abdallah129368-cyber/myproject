import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong(); // eyes
        long m = sc.nextLong(); // mouths
        long k = sc.nextLong(); // bodies

        long ans = 0;

        long first = Math.min(n / 2, k);
        ans += first;

        n -= first * 2;
        k -= first;

        long second = Math.min(Math.min(n, m), k);
        ans += second;

        System.out.println(ans);
    }
}
