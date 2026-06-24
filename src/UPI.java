public class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " processed using UPI.");
    }
}
