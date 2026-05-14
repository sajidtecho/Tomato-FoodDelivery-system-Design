package manager;

import Models.Restaurant;
import java.util.Vector;

public class RestaurantManager {
    private static RestaurantManager instance;
    private Vector<Restaurant> restaurants;

    private RestaurantManager() {
        restaurants = new Vector<>();
    }

    public static synchronized RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant r) {
        restaurants.add(r);
    }

    public Restaurant searchByLoc(String loc) {
        for (Restaurant r : restaurants) {
            if (r.getLoc().equalsIgnoreCase(loc)) {
                return r;
            }
        }
        return null;
    }
}
