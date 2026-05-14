package factories;

import Models.*;
import strategies.IPaymentStrategy;

public class ScheduleOrderFactory implements IOrderFactory {
    private String scheduleTime;

    public ScheduleOrderFactory(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    public Order createOrder(int id, User user, IPaymentStrategy strategy, String type) {
        System.out.println("Scheduling order for: " + scheduleTime);
        if ("DELIVERY".equalsIgnoreCase(type)) {
            return new DeliveryOrder(id, user, user.getCart().getRestaurant(), user.getCart().getItems(), strategy, user.getAddress());
        } else {
            return new PickupOrder(id, user, user.getCart().getRestaurant(), user.getCart().getItems(), strategy, user.getCart().getRestaurant().getLoc());
        }
    }
}
