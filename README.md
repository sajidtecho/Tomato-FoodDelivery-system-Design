# Tomato - System Design Implementation

Tomato is a robust food delivery system design implemented in Java. It features a modern architectural approach using several design patterns and includes a built-in AI assistant, **Chef AI**, to streamline order placement and scheduling.

## 🚀 Features

- **User & Cart Management**: Full lifecycle of user sessions and cart handling.
- **Restaurant & Menu System**: Dynamic menu management and restaurant location-based searching.
- **Multi-Type Orders**: Support for both **Delivery** and **Pickup** orders.
- **Flexible Payment Strategies**: Integrated Strategy Pattern for multiple payment methods (UPI, Credit Card, Net Banking).
- **Advanced Order Creation**: Uses Factory Pattern for immediate ("Now") and scheduled orders.
- **Chef AI Assistant**: An intelligent service that assists users in adding items and scheduling orders.

## 🛠️ Design Patterns Used

- **Strategy Pattern**: Used for the Payment system (`IPaymentStrategy`) to allow interchangeable payment methods.
- **Factory Pattern**: Used for Order creation (`IOrderFactory`) to decouple the creation logic of different order types (Scheduled vs. Now).
- **Singleton Pattern**: Used for Managers (`OrderManager`, `RestaurantManager`) to ensure centralized state management.

## 📁 Project Structure

```text
Tomato/
├── Models/             # Core entities (User, Cart, Restaurant, MenuItem, Order)
├── strategies/         # Payment strategy implementations
├── factories/          # Order factory implementations
├── manager/            # Singleton managers for restaurants and orders
├── services/           # Notification and Chef AI Assistant services
└── Tomato.java         # Orchestration / Main entry point
```

## 💻 How to Run

Ensure you have Java installed on your machine. Run the following command in the `Tomato` folder:

### Windows (PowerShell)
```powershell
javac -d . Models/*.java strategies/*.java factories/*.java manager/*.java services/*.java Tomato.java ; java Tomato
```

### Windows (CMD)
```cmd
javac -d . Models/*.java strategies/*.java factories/*.java manager/*.java services/*.java Tomato.java && java Tomato
```

## 🤖 Chef AI Assistant
The **Chef AI** is designed to provide a premium user experience:
- **Assistance**: "Chef: Hi Sajid! Adding Chicken Biryani from Royal Tandoor to your cart."
- **Scheduling**: "Chef: I'll help you schedule that DELIVERY order for 2026-05-15 20:00."

---
Developed as a demonstration of clean System Design principles in Java.
