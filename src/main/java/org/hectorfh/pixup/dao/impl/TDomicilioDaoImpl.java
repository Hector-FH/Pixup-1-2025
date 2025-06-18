package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.TDomicilioDao;
import org.hectorfh.pixup.hibernate.HibernateUtil;
import org.hectorfh.pixup.model.TDomicilio;
import org.hibernate.Session;

import java.util.List;

public class TDomicilioDaoImpl implements TDomicilioDao {


    private static TDomicilioDao tDomicilioDao;

    public TDomicilioDaoImpl(){}

    public static TDomicilioDao getInstance(){
        if (tDomicilioDao == null)
        {
            tDomicilioDao = new TDomicilioDaoImpl();
        }
        return tDomicilioDao;
    }

    @Override
    public List<TDomicilio> findAll() {

        List<TDomicilio> tDomicilios =null;
        Session session = HibernateUtil.getSession();
        tDomicilios = session.createQuery("From TDomicilio", TDomicilio.class).getResultList();
        session.close();

        return tDomicilios;

    }

    @Override
    public boolean save(TDomicilio tDomicilio) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist( tDomicilio );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public boolean update(TDomicilio tDomicilio) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.merge( tDomicilio );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public boolean delete(TDomicilio tDomicilio) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.remove( tDomicilio );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public TDomicilio findById(int id) {

        Session session = HibernateUtil.getSession();
        TDomicilio tDomicilio = session.get(TDomicilio.class, id);

        return tDomicilio;

    }

}
