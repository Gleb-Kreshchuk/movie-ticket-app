package gleb.k.spring.service;

import gleb.k.spring.model.Role;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(String roleName);
}
