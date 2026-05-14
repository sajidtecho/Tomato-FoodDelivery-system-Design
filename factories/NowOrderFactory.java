package factories;

import Models.*;
import strategies.IPaymentStrategy;

public class NowOrderFactory implements IOrderFactory {
    @Override
    public Order createOrder(int id, User user, IPaymentStrategy strategy, String type) {
        if ("DELIVERY".equalsIgnoreCase(type)) {
            return new DeliveryOrder(id, user, user.getCart().getRestaurant(), user.getCart().getItems(), strategy, user.getAddress());
        } else {
            return new PickupOrder(id, user, user.getCart().getRestaurant(), user.getCart().getItems(), strategy, user.getCart().getRestaurant().getLoc());
        }
    }
}
