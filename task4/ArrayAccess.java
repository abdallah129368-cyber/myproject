import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter an index: ");
            int index = input.nextInt();

            System.out.println("Value = " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index.");
        }

    }
}