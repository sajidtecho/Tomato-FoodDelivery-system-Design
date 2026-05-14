package Models;

import java.util.Vector;

public class Restaurant {
    private int restaurantId;
    private String name;
    private String loc;
    private Vector<MenuItem> menu;

    public Restaurant(int restaurantId, String name, String loc) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.loc = loc;
        this.menu = new Vector<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public int getRestaurantId() { return restaurantId; }
    public String getName() { return name; }
    public String getLoc() { return loc; }
    public Vector<MenuItem> getMenu() { return menu; }
}
