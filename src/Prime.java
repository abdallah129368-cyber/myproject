import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x <= 1) {
            System.out.println("NO");
            return;
        }

        boolean prime = true;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
