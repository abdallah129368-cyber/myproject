import java.util.Scanner;

public class Sweep {

    static class Interval {
        private int odd;
        private int even;

        public Interval(int odd, int even) {
            this.odd = odd;
            this.even = even;
        }

        public String check() {
            if (odd + even > 0 && Math.abs(odd - even) <= 1)
                return "YES";
            else
                return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Interval interval = new Interval(a, b);

        System.out.println(interval.check());

    }
}
