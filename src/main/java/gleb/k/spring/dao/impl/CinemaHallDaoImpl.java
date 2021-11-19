package gleb.k.spring.dao.impl;

import gleb.k.spring.dao.AbstractDao;
import gleb.k.spring.dao.CinemaHallDao;
import gleb.k.spring.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
