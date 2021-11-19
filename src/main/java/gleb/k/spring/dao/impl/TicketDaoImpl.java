package gleb.k.spring.dao.impl;

import gleb.k.spring.dao.AbstractDao;
import gleb.k.spring.dao.TicketDao;
import gleb.k.spring.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
