package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.PagoDao;
import org.hectorfh.pixup.model.Pago;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PagoDaoImplTest {

    @Test
    void getInstance() {
    }


    @Test
    void findAll() {

        List<Pago> list = null;
        PagoDao pagoDao = PagoDaoImpl.getInstance();
        list = pagoDao.findAll();
        assertNotNull( list );
        assertFalse(list.isEmpty() );
        list.forEach(System.out::println);

    }

    @Test
    void save() {

        PagoDao pagoDao = PagoDaoImpl.getInstance();
        Pago pago = null;
        boolean res = false;
        pago = new Pago();
        pago.setNum("1234");
        pago.setFecha("2025-10-01");
        pago.setOrden_id(2);
        res = pagoDao.save( pago );
        assertTrue( res );

        System.out.println( pago );

    }

    @Test
    void update() {

        PagoDao pagoDao = PagoDaoImpl.getInstance();
        Pago pago = null;
        boolean res = false;
        pago = pagoDao.findById(2);
        assertNotNull( pago );
        pago.setNum("4321");
        pago.setFecha("2014-10-01");
        pago.setOrden_id(2);
        res = pagoDao.update( pago );
        assertTrue( res );

        System.out.println( pago );

    }

    @Test
    void delete() {

        PagoDao pagoDao = PagoDaoImpl.getInstance();
        Pago pago = null;
        boolean res = false;
        pago = pagoDao.findById(3);
        assertNotNull( pago );
        res = pagoDao.delete( pago );
        assertTrue( res );

        System.out.println("Eliminado");

    }

    @Test
    void findById() {

        PagoDao pagoDao = PagoDaoImpl.getInstance();
        Pago pago = null;
        pago = pagoDao.findById(2);
        assertNotNull( pago );
        assertEquals(2, pago.getId());

        System.out.println( pago );

    }

}