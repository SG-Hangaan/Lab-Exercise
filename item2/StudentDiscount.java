package item2;

public class StudentDiscount implements DiscountType {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}
