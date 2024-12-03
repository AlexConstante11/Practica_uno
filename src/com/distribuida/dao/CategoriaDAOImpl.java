package com.distribuida.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.Categoria;

@Repository
@Transactional
public class CategoriaDAOImpl implements CategoriaDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Categoria> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Categoria", Categoria.class).getResultList();
    }

    @Override
    public Categoria findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Categoria.class, id);
    }

    @Override
    public void add(Categoria categoria) {
        Session session = sessionFactory.getCurrentSession();
        session.save(categoria);
    }

    @Override
    public void up(Categoria categoria) {
        Session session = sessionFactory.getCurrentSession();
        session.update(categoria);
    }

    @Override
    public void del(int id) {
        Session session = sessionFactory.getCurrentSession();
        Categoria categoria = session.get(Categoria.class, id);
        if (categoria != null) {
            session.delete(categoria);
        }
    }
}
