package gleb.k.spring.service;

import gleb.k.spring.model.User;
import java.util.Optional;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
