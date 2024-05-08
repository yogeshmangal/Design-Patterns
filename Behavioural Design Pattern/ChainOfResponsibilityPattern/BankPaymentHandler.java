public class BankPaymentHandler implements PaymentHandler {
    private PaymentHandler paymentHandler;

    @Override
    public void setNext(PaymentHandler paymentHandler) {
        this.paymentHandler = paymentHandler;
    }

    @Override
    public void handlePayment(int amount) {
        if (amount <= 500)
            System.out.println("Paid using Bank Account: $" + amount);
        else
            this.paymentHandler.handlePayment(amount);
    }
}
