package gleb.k.spring.dao.impl;

import gleb.k.spring.dao.AbstractDao;
import gleb.k.spring.dao.MovieDao;
import gleb.k.spring.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
