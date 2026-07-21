import java.util.Scanner;

public class Data {

    static class DataType {
        private long n;
        private long k;
        private long a;

        public DataType(long n, long k, long a) {
            this.n = n;
            this.k = k;
            this.a = a;
        }

        public String getType() {
            long product = n * k;

            if (product % a != 0)
                return "double";

            long result = product / a;

            if (result <= Integer.MAX_VALUE)
                return "int";
            else
                return "long long";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();

        DataType dataType = new DataType(n, k, a);

        System.out.println(dataType.getType());


    }
}