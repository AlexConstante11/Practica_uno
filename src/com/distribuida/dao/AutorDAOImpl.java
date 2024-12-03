package com.distribuida.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.Autor;

@Repository
@Transactional
public class AutorDAOImpl implements AutorDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Autor> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Autor", Autor.class).getResultList();
    }

    @Override
    public Autor findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Autor.class, id);
    }

    @Override
    public void add(Autor autor) {
        Session session = sessionFactory.getCurrentSession();
        session.save(autor);
    }

    @Override
    public void up(Autor autor) {
        Session session = sessionFactory.getCurrentSession();
        session.update(autor);
    }

    @Override
    public void del(int id) {
        Session session = sessionFactory.getCurrentSession();
        Autor autor = session.get(Autor.class, id);
        if (autor != null) {
            session.delete(autor);
        }
    }
}

