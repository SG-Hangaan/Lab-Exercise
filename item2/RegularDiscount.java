package item2;

public class RegularDiscount implements DiscountType {
    @Override
    public double calculateDiscount(double amount) {
        return 0.0; // No discount for Regular
    }
}