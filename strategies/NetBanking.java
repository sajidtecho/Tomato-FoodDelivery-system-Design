package strategies;

public class NetBanking implements IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid via Net Banking");
    }
}
