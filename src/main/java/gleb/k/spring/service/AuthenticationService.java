package gleb.k.spring.service;

import gleb.k.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
