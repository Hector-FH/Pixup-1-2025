package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.CancionDao;
import org.hectorfh.pixup.hibernate.HibernateUtil;
import org.hectorfh.pixup.model.Cancion;
import org.hibernate.Session;

import java.util.List;

public class CancionDaoImpl implements CancionDao {


    private static CancionDao cancionDao;

    public CancionDaoImpl() {
    }

    public static CancionDao getInstance() {
        if (cancionDao == null)
        {
            cancionDao = new CancionDaoImpl();
        }
        return cancionDao;
    }

    @Override
    public List<Cancion> findAll() {

        List<Cancion> cancions = null;
        Session session = HibernateUtil.getSession( );
        cancions = session.createQuery("From Cancion", Cancion.class).getResultList();
        session.close();


        return cancions;
    }

    @Override
    public boolean save(Cancion cancion) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist( cancion );
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public boolean update(Cancion cancion) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.merge( cancion );
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public boolean delete(Cancion cancion) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.remove( cancion );
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public Cancion findById(int id) {

        Session session = HibernateUtil.getSession();
        Cancion cancion = session.get(Cancion.class, id);

        return cancion;


    }
}
