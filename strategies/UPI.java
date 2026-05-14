package strategies;

public class UPI implements IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid via UPI");
    }
}
