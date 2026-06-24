public class Card implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " processed using Card.");
    }
}
