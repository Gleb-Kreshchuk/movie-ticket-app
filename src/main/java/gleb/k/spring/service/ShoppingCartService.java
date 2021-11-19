package gleb.k.spring.service;

import gleb.k.spring.model.MovieSession;
import gleb.k.spring.model.ShoppingCart;
import gleb.k.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
