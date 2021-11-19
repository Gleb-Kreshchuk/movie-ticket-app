package gleb.k.spring.dao.impl;

import gleb.k.spring.dao.AbstractDao;
import gleb.k.spring.dao.RoleDao;
import gleb.k.spring.exception.DataProcessingException;
import gleb.k.spring.model.Role;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(String name) {
        try (Session session = factory.openSession()) {
            Query<Role> findByName = session.createQuery(
                    "FROM Role r WHERE r.name = :name", Role.class);
            findByName.setParameter("name", name);
            return findByName.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Role with name " + name + " not found", e);
        }
    }
}
