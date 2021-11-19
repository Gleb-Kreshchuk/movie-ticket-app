package gleb.k.spring.dao;

import gleb.k.spring.model.Role;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(String name);
}
