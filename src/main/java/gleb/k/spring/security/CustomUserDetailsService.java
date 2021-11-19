package gleb.k.spring.security;

import gleb.k.spring.model.Role;
import gleb.k.spring.model.User;
import gleb.k.spring.service.UserService;
import java.util.Optional;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> optionalUser = userService.findByEmail(email);
        User user = optionalUser.orElseThrow(
                () -> new UsernameNotFoundException("Can't find user by email " + email));
        UserBuilder builder =
                org.springframework.security.core.userdetails.User.withUsername(email);
        builder.password(user.getPassword());
        builder.roles(user.getRoles()
                .stream()
                .map(Role::getName)
                .toArray(String[]::new));
        return builder.build();
    }
}
