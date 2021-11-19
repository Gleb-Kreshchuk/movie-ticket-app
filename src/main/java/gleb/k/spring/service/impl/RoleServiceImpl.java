package gleb.k.spring.service.impl;

import gleb.k.spring.dao.RoleDao;
import gleb.k.spring.model.Role;
import gleb.k.spring.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleDao.getRoleByName(roleName)
                .orElseThrow(() -> new RuntimeException("Can't find role " + roleName));
    }
}
