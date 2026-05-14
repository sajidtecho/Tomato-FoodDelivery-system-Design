package factories;

import Models.Order;
import Models.User;
import strategies.IPaymentStrategy;

public interface IOrderFactory {
    Order createOrder(int id, User user, IPaymentStrategy strategy, String type);
}
