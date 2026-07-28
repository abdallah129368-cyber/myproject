import java.util.Scanner;

class Calculator {
    int calculate(int a, char op, int b) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }
}

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int i = 0;
        while (Character.isDigit(s.charAt(i))) {
            i++;
        }

        int a = Integer.parseInt(s.substring(0, i));
        char op = s.charAt(i);
        int b = Integer.parseInt(s.substring(i + 1));

        Calculator calc = new Calculator();
        System.out.println(calc.calculate(a, op, b));
    }
}
