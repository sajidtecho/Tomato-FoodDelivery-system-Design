package Models;

import strategies.IPaymentStrategy;
import java.util.Vector;

public class PickupOrder extends Order {
    private String resAddress;

    public PickupOrder(int id, User user, Restaurant rst, Vector<MenuItem> items, IPaymentStrategy strategy, String resAddress) {
        super(id, user, rst, items, strategy);
        this.resAddress = resAddress;
    }

    @Override
    public String getType() {
        return "Pickup Order from: " + resAddress;
    }
}
