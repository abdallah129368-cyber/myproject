import java.util.Scanner;

class TShirt {
    private double discount;
    private double priceAfterDiscount;

    public TShirt(double discount, double priceAfterDiscount) {
        this.discount = discount;
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public double getOriginalPrice() {
        return (100.0 * priceAfterDiscount) / (100.0 - discount);
    }
}

public class Winter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double p = sc.nextDouble();

        TShirt tshirt = new TShirt(x, p);
        System.out.printf("%.2f%n", tshirt.getOriginalPrice());
    }
}
