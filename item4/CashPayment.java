package item4;

// CashPayment class implementing the PaymentMethod interface
public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // Cash payment logic here
        System.out.println("You are paying in Cash");
        System.out.println("Amount paid: $" + amount);
    }
}
