package item4;
// PaymentProcessor class to process payments based on the payment method
public class PaymentProcessor {
    private PaymentMethod paymentMethod;
    private Order order;

    public PaymentProcessor(PaymentMethod paymentMethod, Order order) {
        this.paymentMethod = paymentMethod;
        this.order = order;
    }

    public void processPayment() {
        paymentMethod.pay(order.getAmount());
    }

    public static void main(String[] args) {
        // Create an Order object for a cash payment
        Order order = new Order(50.0, "cash");

        // Create a CashPayment object (implements PaymentMethod)
        PaymentMethod cashPaymentMethod = new CashPayment();

        // Create a PaymentProcessor for cash payments
        PaymentProcessor cashPaymentProcessor = new PaymentProcessor(cashPaymentMethod, order);

        // Process the payment
        cashPaymentProcessor.processPayment();
    }
}
