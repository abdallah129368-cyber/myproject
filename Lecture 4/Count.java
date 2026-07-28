import java.util.Scanner;

class Numbers {
    int a, b, c;

    Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getMin() {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    int getMax() {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Numbers obj = new Numbers(a, b, c);

        System.out.print(obj.getMin() + " " + obj.getMax());


    }
}