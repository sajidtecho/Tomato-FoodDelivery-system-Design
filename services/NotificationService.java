package services;

import Models.Order;

public class NotificationService {
    private Order order;

    public NotificationService(Order order) {
        this.order = order;
    }

    public void notifyUser() {
        System.out.println("Notifying user about order: " + order.getType());
    }
}
