import java.util.Scanner;

class Compare {
    long a, b, c, d;

    Compare(long a, long b, long c, long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void check() {
        double left = b * Math.log(a);
        double right = d * Math.log(c);

        if (left > right)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

public class Com {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        Compare obj = new Compare(a, b, c, d);
        obj.check();

    }
}