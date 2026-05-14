// Default package

import Models.*;
import manager.*;
import strategies.*;
import services.*;

public class Tomato {
    public static void main(String[] args) {
        // Initializing System
        RestaurantManager rm = RestaurantManager.getInstance();
        OrderManager om = OrderManager.getInstance();
        ChefAIService chef = new ChefAIService();

        // Setup Restaurant
        Restaurant res = new Restaurant(1, "Royal Tandoor", "Indiranagar");
        MenuItem biryani = new MenuItem("B1", "Chicken Biryani", 250);
        res.addMenuItem(biryani);
        rm.addRestaurant(res);

        // Setup User
        User user = new User(101, "Sajid", "HBR Layout, Bangalore");

        // AI Assistance via Devi
        System.out.println("--- Chef AI Order Assistance ---");
        chef.assistOrder(user, res, biryani);

        // Process Order via Devi (Scheduling)
        System.out.println("\n--- Chef AI Scheduling ---");
        chef.scheduleAssistance(user, "2026-05-15 20:00", "DELIVERY", new UPI());

        // List Orders in System
        System.out.println("\n--- Current Orders in System ---");
        om.listOrders();
    }
}
