public class MultipleCatch {
    public static void main(String[] args) {

        String text = null;
        int number = 10;

        try {
            System.out.println(text.toUpperCase());

            System.out.println(number / 0);

        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred.");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred.");
        }
    }
}