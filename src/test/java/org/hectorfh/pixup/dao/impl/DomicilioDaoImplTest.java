package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.DomicilioDao;
import org.hectorfh.pixup.model.Domicilio;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DomicilioDaoImplTest {

    @Test
    void getInstance() {
    }

    @Test
    void findAll() {

        List<Domicilio> list = null;
        DomicilioDao domicilioDao = DomicilioDaoImpl.getInstance();
        list = domicilioDao.findAll();
        assertNotNull( list );
        assertFalse( list.isEmpty() );
        list.forEach(System.out::println);

    }

    @Test
    void save() {

        DomicilioDao domicilioDao = DomicilioDaoImpl.getInstance();
        Domicilio domicilio = null;
        boolean res = false;
        domicilio = new Domicilio();
        domicilio.setCalle("Calle 12");
        domicilio.setNum_ext("75");
        domicilio.setNum_int("4");
        domicilio.setCol_id(2);
        domicilio.setTipo_dom_id(2);
        domicilio.setUsuario_id(1);
        res = domicilioDao.save( domicilio );
        assertTrue( res );

        System.out.println( domicilio );

    }

    @Test
    void update() {

        DomicilioDao domicilioDao = DomicilioDaoImpl.getInstance();
        Domicilio domicilio = null;
        boolean res = false;
        domicilio = domicilioDao.findById(2);
        assertNotNull( domicilio );
        domicilio.setCalle("Calle 15");
        domicilio.setNum_ext("115");
        domicilio.setNum_int("4");
        domicilio.setCol_id(2);
        domicilio.setTipo_dom_id(2);
        domicilio.setUsuario_id(1);
        res = domicilioDao.update( domicilio );
        assertTrue( res );

        System.out.println( domicilio );

    }

    @Test
    void delete() {

        DomicilioDao domicilioDao = DomicilioDaoImpl.getInstance();
        Domicilio domicilio = null;
        boolean res = false;
        domicilio = domicilioDao.findById(2);
        assertNotNull( domicilio );
        res = domicilioDao.delete( domicilio );
        assertTrue( res );

        System.out.println("Eliminado");


    }

    @Test
    void findById() {

        DomicilioDao domicilioDao = DomicilioDaoImpl.getInstance();
        Domicilio domicilio = null;
        domicilio = domicilioDao.findById(2);
        assertNotNull( domicilio );
        assertEquals(2, domicilio.getId());

        System.out.println( domicilio );

    }
}