package Models;

import java.util.Vector;

public class Cart {
    private Restaurant r;
    private Vector<MenuItem> items;

    public Cart() {
        this.items = new Vector<>();
    }

    public void setRestaurant(Restaurant r) {
        this.r = r;
    }

    public void addToCart(MenuItem it) {
        items.add(it);
    }

    public int totalCost() {
        int total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public Restaurant getRestaurant() { return r; }
    public Vector<MenuItem> getItems() { return items; }
}
