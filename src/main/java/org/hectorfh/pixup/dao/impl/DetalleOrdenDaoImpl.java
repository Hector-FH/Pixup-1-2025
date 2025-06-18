package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.DetalleOrdenDao;
import org.hectorfh.pixup.hibernate.HibernateUtil;
import org.hectorfh.pixup.model.DetalleOrden;
import org.hibernate.Session;

import java.util.List;

public class DetalleOrdenDaoImpl implements DetalleOrdenDao {

    private static DetalleOrdenDao detalleOrdenDao;

    public DetalleOrdenDaoImpl() {
    }

    public static DetalleOrdenDao getInstance() {
        if (detalleOrdenDao == null)
        {
            detalleOrdenDao = new DetalleOrdenDaoImpl();
        }
        return detalleOrdenDao;
    }

    @Override
    public List<DetalleOrden> findAll() {

        List<DetalleOrden> detalleOrdens = null;
        Session session = HibernateUtil.getSession( );
        detalleOrdens = session.createQuery("From DetalleOrden", DetalleOrden.class).getResultList();
        session.close();


        return detalleOrdens;
    }

    @Override
    public boolean save(DetalleOrden detalleOrden) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist( detalleOrden );
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public boolean update(DetalleOrden detalleOrden) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.merge( detalleOrden );
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public boolean delete(DetalleOrden detalleOrden) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.remove( detalleOrden );
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public DetalleOrden findById(int id) {

        Session session = HibernateUtil.getSession();
        DetalleOrden detalleOrden = session.get(DetalleOrden.class, id);

        return detalleOrden;


    }



}
