package gleb.k.spring.service;

import gleb.k.spring.model.Order;
import gleb.k.spring.model.ShoppingCart;
import gleb.k.spring.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
