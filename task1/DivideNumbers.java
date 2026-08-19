import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int a = input.nextInt();

            System.out.print("Enter the second number: ");
            int b = input.nextInt();

            int result = a / b;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }


    }
}
