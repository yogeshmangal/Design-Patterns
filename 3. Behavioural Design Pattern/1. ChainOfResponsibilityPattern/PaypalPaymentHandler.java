public class PaypalPaymentHandler implements PaymentHandler {
    private PaymentHandler paymentHandler;

    @Override
    public void setNext(PaymentHandler paymentHandler) {
        this.paymentHandler = paymentHandler;
    }

    @Override
    public void handlePayment(int amount) {
        if (amount <= 1500)
            System.out.println("Paid using PayPal: $" + amount);
        else
            System.out.println("Cannot Process the Payment for more than $1500");
    }
}
