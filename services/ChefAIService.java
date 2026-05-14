package services;

import Models.*;
import factories.*;
import strategies.*;
import manager.*;

public class ChefAIService {
    public void assistOrder(User user, Restaurant restaurant, MenuItem item) {
        System.out.println("Chef: Hi " + user.getName() + "! Adding " + item.getName() + " from " + restaurant.getName() + " to your cart.");
        user.getCart().setRestaurant(restaurant);
        user.getCart().addToCart(item);
    }

    public void scheduleAssistance(User user, String time, String type, IPaymentStrategy strategy) {
        System.out.println("Chef: I'll help you schedule that " + type + " order for " + time + ".");
        IOrderFactory factory = new ScheduleOrderFactory(time);
        Order order = factory.createOrder((int)(Math.random()*1000), user, strategy, type);
        OrderManager.getInstance().addOrder(order);
        System.out.println("Chef: Order scheduled successfully!");
    }
}
