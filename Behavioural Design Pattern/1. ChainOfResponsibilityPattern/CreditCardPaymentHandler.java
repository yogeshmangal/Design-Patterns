public class CreditCardPaymentHandler implements PaymentHandler {
    private PaymentHandler paymentHandler;

    @Override
    public void setNext(PaymentHandler paymentHandler) {
        this.paymentHandler = paymentHandler;
    }

    @Override
    public void handlePayment(int amount) {
        if (amount <= 1000)
            System.out.println("Paid using Credit Card: $" + amount);
        else
            this.paymentHandler.handlePayment(amount);
    }
}
