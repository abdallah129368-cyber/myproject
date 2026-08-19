import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String number = input.nextLine();

            int value = Integer.parseInt(number);

            System.out.println("Integer = " + value);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number.");
        }
    }
}