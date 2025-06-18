package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.TipoNotificacionDao;
import org.hectorfh.pixup.hibernate.HibernateUtil;
import org.hectorfh.pixup.model.TipoNotificacion;
import org.hibernate.Session;

import java.util.List;

public class TipoNotificacionDaoImpl implements TipoNotificacionDao {


    private static TipoNotificacionDao tipoNotificacionDao;

    public TipoNotificacionDaoImpl(){}

    public static TipoNotificacionDao getInstance(){
        if (tipoNotificacionDao == null)
        {
            tipoNotificacionDao = new TipoNotificacionDaoImpl();
        }
        return tipoNotificacionDao;
    }

    @Override
    public List<TipoNotificacion> findAll() {

        List<TipoNotificacion> tipoNotificacions =null;
        Session session = HibernateUtil.getSession();
        tipoNotificacions = session.createQuery("From TipoNotificacion", TipoNotificacion.class).getResultList();
        session.close();

        return tipoNotificacions;

    }

    @Override
    public boolean save(TipoNotificacion tipoNotificacion) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist( tipoNotificacion );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public boolean update(TipoNotificacion tipoNotificacion) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.merge( tipoNotificacion );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public boolean delete(TipoNotificacion tipoNotificacion) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.remove( tipoNotificacion );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public TipoNotificacion findById(int id) {

        Session session = HibernateUtil.getSession();
        TipoNotificacion tipoNotificacion = session.get(TipoNotificacion.class, id);

        return tipoNotificacion;

    }

}
