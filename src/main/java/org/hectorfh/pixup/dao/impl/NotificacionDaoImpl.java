package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.NotificacionDao;
import org.hectorfh.pixup.hibernate.HibernateUtil;
import org.hectorfh.pixup.model.Notificacion;
import org.hibernate.Session;

import java.util.List;

public class NotificacionDaoImpl implements NotificacionDao {


    private static NotificacionDao notificacionDao;

    public NotificacionDaoImpl(){}

    public static NotificacionDao getInstance(){
        if (notificacionDao == null)
        {
            notificacionDao = new NotificacionDaoImpl();
        }
        return notificacionDao;
    }

    @Override
    public List<Notificacion> findAll() {

        List<Notificacion> notificacions =null;
        Session session = HibernateUtil.getSession();
        notificacions = session.createQuery("From Notificacion", Notificacion.class).getResultList();
        session.close();

        return notificacions;

    }

    @Override
    public boolean save(Notificacion notificacion) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist( notificacion );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public boolean update(Notificacion notificacion) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.merge( notificacion );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public boolean delete(Notificacion notificacion) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.remove( notificacion );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public Notificacion findById(int id) {

        Session session = HibernateUtil.getSession();
        Notificacion notificacion = session.get(Notificacion.class, id);

        return notificacion;

    }

}
