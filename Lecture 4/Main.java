import java.util.Scanner;

class Age {
    int years, months, days;

    Age(int n) {
        years = n / 365;
        n %= 365;
        months = n / 30;
        days = n % 30;
    }

    void display() {
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Age age = new Age(n);
        age.display();


    }
}
