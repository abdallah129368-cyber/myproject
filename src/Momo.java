import java.util.Scanner;

public class Momo {

    static class Game {
        private long a, b, k;

        public Game(long a, long b, long k) {
            this.a = a;
            this.b = b;
            this.k = k;
        }

        public String getWinner() {
            boolean memo = (a % k == 0);
            boolean momo = (b % k == 0);

            if (memo && momo)
                return "Both";
            else if (memo)
                return "Memo";
            else if (momo)
                return "Momo";
            else
                return "No One";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        Game game = new Game(a, b, k);

        System.out.println(game.getWinner());


    }
}
