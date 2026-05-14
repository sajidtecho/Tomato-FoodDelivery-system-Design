package Models;

import strategies.IPaymentStrategy;
import java.util.Vector;

public class DeliveryOrder extends Order {
    private String address;

    public DeliveryOrder(int id, User user, Restaurant rst, Vector<MenuItem> items, IPaymentStrategy strategy, String address) {
        super(id, user, rst, items, strategy);
        this.address = address;
    }

    @Override
    public String getType() {
        return "Delivery Order to: " + address;
    }
}
