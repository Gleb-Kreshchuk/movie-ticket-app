package gleb.k.spring.dao;

import gleb.k.spring.model.ShoppingCart;
import gleb.k.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
