import java.util.Scanner;

public class Lucky {

    static class LuckyNumber {
        private int number;

        public LuckyNumber(int number) {
            this.number = number;
        }

        public String check() {
            int tens = number / 10;
            int ones = number % 10;

            if ((ones != 0 && tens % ones == 0) ||
                    (tens != 0 && ones % tens == 0)) {
                return "YES";
            }

            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LuckyNumber lucky = new LuckyNumber(n);

        System.out.println(lucky.check());

    }
}

