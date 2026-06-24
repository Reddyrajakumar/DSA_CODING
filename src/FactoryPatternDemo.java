public class FactoryPatternDemo {

    public static void main(String[] args) {
        Payment upiPayment = PaymentFactory.getPayment("UPI");
        upiPayment.pay(1500.00);

        Payment cardPayment = PaymentFactory.getPayment("CARD");
        cardPayment.pay(2500.00);
    }
}
