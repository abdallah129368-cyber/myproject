public class ExceptionPropagation {

    static void method1() {
        method2();
    }

    static void method2() {
        throw new ArithmeticException("Exception propagated.");
    }

    public static void main(String[] args) {

        try {
            method1();

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}