package Models;

import strategies.IPaymentStrategy;
import java.util.Vector;

public abstract class Order {
    protected int id;
    protected User user;
    protected Restaurant rst;
    protected Vector<MenuItem> items;
    protected IPaymentStrategy strategy;

    public Order(int id, User user, Restaurant rst, Vector<MenuItem> items, IPaymentStrategy strategy) {
        this.id = id;
        this.user = user;
        this.rst = rst;
        this.items = items;
        this.strategy = strategy;
    }

    public abstract String getType();

    public void processPayment() {
        if (strategy != null) {
            strategy.pay();
        }
    }
}
