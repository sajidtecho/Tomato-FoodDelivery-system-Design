package strategies;

public class CreditCard implements IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid via Credit Card");
    }
}
