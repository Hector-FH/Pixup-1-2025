package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.PagoDao;
import org.hectorfh.pixup.hibernate.HibernateUtil;
import org.hectorfh.pixup.model.Pago;
import org.hibernate.Session;

import java.util.List;

public class PagoDaoImpl implements PagoDao {


    private static PagoDao pagoDao;

    public PagoDaoImpl(){}

    public static PagoDao getInstance(){
        if (pagoDao == null)
        {
            pagoDao = new PagoDaoImpl();
        }
        return pagoDao;
    }

    @Override
    public List<Pago> findAll() {

        List<Pago> pagos =null;
        Session session = HibernateUtil.getSession();
        pagos = session.createQuery("From Pago", Pago.class).getResultList();
        session.close();

        return pagos;

    }

    @Override
    public boolean save(Pago pago) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.persist( pago );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public boolean update(Pago pago) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.merge( pago );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public boolean delete(Pago pago) {

        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.remove( pago );
        session.getTransaction().commit();
        session.close();

        return true;

    }

    @Override
    public Pago findById(int id) {

        Session session = HibernateUtil.getSession();
        Pago pago = session.get(Pago.class, id);

        return pago;

    }
}
