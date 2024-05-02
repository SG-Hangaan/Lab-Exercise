
package item4;
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // Credit card payment logic here
        System.out.println("You are paying using Credit Card");
    }
}