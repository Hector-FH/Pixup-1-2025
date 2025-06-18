package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.TDomicilioDao;
import org.hectorfh.pixup.model.TDomicilio;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TDomicilioDaoImplTest {

    @Test
    void getInstance() {
    }

    @Test
    void findAll() {

        List<TDomicilio> list = null;
        TDomicilioDao tDomicilioDao = TDomicilioDaoImpl.getInstance();
        list = tDomicilioDao.findAll();
        assertNotNull( list );
        assertFalse(list.isEmpty() );
        list.forEach(System.out::println);

    }

    @Test
    void save() {

        TDomicilioDao tDomicilioDao = TDomicilioDaoImpl.getInstance();
        TDomicilio tDomicilio = null;
        boolean res = false;
        tDomicilio = new TDomicilio();
        tDomicilio.setDescripcion("Tipo 1");
        res = tDomicilioDao.save( tDomicilio );
        assertTrue( res );

        System.out.println( tDomicilio );

    }

    @Test
    void update() {

        TDomicilioDao tDomicilioDao = TDomicilioDaoImpl.getInstance();
        TDomicilio tDomicilio = null;
        boolean res = false;
        tDomicilio = tDomicilioDao.findById(1);
        assertNotNull( tDomicilio );
        tDomicilio.setDescripcion("Tipo 2");
        res = tDomicilioDao.update( tDomicilio );
        assertTrue( res );

        System.out.println( tDomicilio );

    }

    @Test
    void delete() {

        TDomicilioDao tDomicilioDao = TDomicilioDaoImpl.getInstance();
        TDomicilio tDomicilio = null;
        boolean res = false;
        tDomicilio = tDomicilioDao.findById(1);
        assertNotNull( tDomicilio );
        res = tDomicilioDao.delete( tDomicilio );
        assertTrue( res );

        System.out.println("Eliminado");

    }

    @Test
    void findById() {

        TDomicilioDao tDomicilioDao = TDomicilioDaoImpl.getInstance();
        TDomicilio tDomicilio = null;
        tDomicilio = tDomicilioDao.findById(1);
        assertNotNull( tDomicilio );
        assertEquals(1, tDomicilio.getId());


        System.out.println( tDomicilio );

    }
}