import java.util.Scanner;

class Interval {
    int l1, r1, l2, r2;

    Interval(int l1, int r1, int l2, int r2) {
        this.l1 = l1;
        this.r1 = r1;
        this.l2 = l2;
        this.r2 = r2;
    }

    void intersection() {
        int start = Math.max(l1, l2);
        int end = Math.min(r1, r2);

        if (start <= end) {
            System.out.println(start + " " + end);
        } else {
            System.out.println(-1);
        }
    }
}

public class Inter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        Interval obj = new Interval(l1, r1, l2, r2);
        obj.intersection();


    }
}
