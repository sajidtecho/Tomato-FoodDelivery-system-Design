package manager;

import Models.Order;
import java.util.Vector;

public class OrderManager {
    private static OrderManager instance;
    private Vector<Order> orderList;

    private OrderManager() {
        orderList = new Vector<>();
    }

    public static synchronized OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void listOrders() {
        for (Order o : orderList) {
            System.out.println("Order Info: " + o.getType());
        }
    }
}
