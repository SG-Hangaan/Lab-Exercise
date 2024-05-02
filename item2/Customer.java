package item2;

public class Customer {
    private String name;
    private DiscountType discountType;

    public Customer(String name, DiscountType discountType) {
        this.name = name;
        this.discountType = discountType;
    }

    public double applyDiscount(double amount) {
        double discount = discountType.calculateDiscount(amount);
        return amount - discount;
    }

    public static void main(String[] args) {
        Customer student = new Customer("Chawon", new StudentDiscount());
        Customer senior = new Customer("Ronshimon", new SeniorCitizenDiscount());
        Customer regular = new Customer("Aceron", new RegularDiscount());

        double amount = 100.0;

        System.out.println("Student Discounted Price: $" + student.applyDiscount(amount));
        System.out.println("Senior Discounted Price: $" + senior.applyDiscount(amount));
        System.out.println("Regular Price: $" + regular.applyDiscount(amount));
    }
}
