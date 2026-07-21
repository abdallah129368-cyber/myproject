import java.util.Scanner;

public class Ali {

    static class Puzzle {
        private long a, b, c, d;

        public Puzzle(long a, long b, long c, long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public String check() {
            if (a + b - c == d ||
                    a + b * c == d ||
                    a - b + c == d ||
                    a - b * c == d ||
                    a * b + c == d ||
                    a * b - c == d) {
                return "YES";
            }
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        Puzzle puzzle = new Puzzle(a, b, c, d);

        System.out.println(puzzle.check());

        sc.close();
    }
}