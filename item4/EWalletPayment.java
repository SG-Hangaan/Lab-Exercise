
package item4;
public class EWalletPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // E-wallet payment logic here
        System.out.println("You are paying in GCash");
    }
}