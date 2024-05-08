public interface PaymentHandler {
    void setNext(PaymentHandler paymentHandler);
    void handlePayment(int amount);
}
