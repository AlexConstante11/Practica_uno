package com.distribuida.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.Cliente;

@Repository
@Transactional
public class ClienteDAOImpl implements ClienteDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Cliente> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Cliente", Cliente.class).getResultList();
    }

    @Override
    @Transactional
    public Cliente findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Cliente.class, id);
    }

    @Override
    public void add(Cliente cliente) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cliente);
    }

    @Override
    @Transactional
    public void up(Cliente cliente) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cliente);
    }

    @Override
    @Transactional
    public void del(int id) {
        Session session = sessionFactory.getCurrentSession();
        Cliente cliente = session.get(Cliente.class, id);
        if (cliente != null) {
            session.delete(cliente);
        }
    }
}

