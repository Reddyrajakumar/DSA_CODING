public class PaymentFactory {

    public static Payment getPayment(String paymentType) {
        if (paymentType == null || paymentType.isBlank()) {
            throw new IllegalArgumentException("Payment type cannot be null or blank.");
        }

        if (paymentType.equalsIgnoreCase("UPI")) {
            return new UPI();
        }

        if (paymentType.equalsIgnoreCase("CARD")) {
            return new Card();
        }

        throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
    }
}
