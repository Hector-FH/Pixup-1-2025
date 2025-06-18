package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.GeneroMusicalDao;
import org.hectorfh.pixup.hibernate.HibernateUtil;
import org.hectorfh.pixup.model.GeneroMusical;
import org.hibernate.Session;

import java.util.List;

public class GeneroMusicalDaoImpl implements GeneroMusicalDao {


    private static GeneroMusicalDao generoMusicalDao;

    public GeneroMusicalDaoImpl() {
    }

    public static GeneroMusicalDao getInstance() {
        if (generoMusicalDao == null)
        {
            generoMusicalDao = new GeneroMusicalDaoImpl();
        }
        return generoMusicalDao;
    }

    @Override
    public List<GeneroMusical> findAll() {

        List<GeneroMusical> generoMusicals = null;
        Session session = HibernateUtil.getSession( );
        generoMusicals = session.createQuery("From GeneroMusical", GeneroMusical.class).getResultList();
        session.close();


        return generoMusicals;
    }

    @Override
    public boolean save(GeneroMusical generoMusical) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist( generoMusical );
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public boolean update(GeneroMusical generoMusical) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.merge( generoMusical );
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public boolean delete(GeneroMusical generoMusical) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.remove( generoMusical );
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public GeneroMusical findById(int id) {

        Session session = HibernateUtil.getSession();
        GeneroMusical generoMusical = session.get(GeneroMusical.class, id);

        return generoMusical;


    }
}
