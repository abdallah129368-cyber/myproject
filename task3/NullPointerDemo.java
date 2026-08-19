public class NullPointerDemo {

    public static void convert(String text) {
        try {
            System.out.println(text.toUpperCase());

        } catch (NullPointerException e) {
            System.out.println("Error: String is null.");
        }
    }

    public static void main(String[] args) {
        convert(null);
    }
}