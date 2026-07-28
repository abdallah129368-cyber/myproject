import java.util.Scanner;

public class Bit {

    static class BitAdder {
        private long a;
        private long b;

        public BitAdder(long a, long b) {
            this.a = a;
            this.b = b;
        }

        public long add() {
            return a ^ b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        BitAdder bitAdder = new BitAdder(a, b);

        System.out.println(bitAdder.add());


    }
}
