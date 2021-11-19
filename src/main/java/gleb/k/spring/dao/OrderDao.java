package gleb.k.spring.dao;

import gleb.k.spring.model.Order;
import gleb.k.spring.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
