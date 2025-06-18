package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.CancionDao;
import org.hectorfh.pixup.model.Cancion;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CancionDaoImplTest {

    @Test
    void getInstance() {
    }


    @Test
    void findAll() {

        List<Cancion> list = null;
        CancionDao cancionDao = CancionDaoImpl.getInstance();
        list = cancionDao.findAll();
        assertNotNull( list );
        assertFalse( list.isEmpty() );
        list.forEach(System.out::println);

    }

    @Test
    void save() {

        CancionDao cancionDao = CancionDaoImpl.getInstance();
        Cancion cancion = null;
        boolean res = false;
        cancion = new Cancion();
        cancion.setTitulo("Toda la vida");
        cancion.setDuracion("2:30");
        cancion.setDisco_id(1);
        res = cancionDao.save( cancion );
        assertTrue( res );

        System.out.println( cancion );


    }

    @Test
    void update() {

        CancionDao cancionDao = CancionDaoImpl.getInstance();
        Cancion cancion = null;
        boolean res = false;
        cancion = cancionDao.findById(2);
        assertNotNull( cancion );
        cancion.setTitulo("Chica de humo");
        cancion.setDuracion("4:00");
        cancion.setDisco_id(1);
        res = cancionDao.update( cancion );
        assertTrue( res );

        System.out.println( cancion );

    }

    @Test
    void delete() {


        CancionDao cancionDao = CancionDaoImpl.getInstance();
        Cancion cancion = null;
        boolean res = false;
        cancion = cancionDao.findById(1);
        assertNotNull( cancion );
        res = cancionDao.delete( cancion );
        assertTrue( res );

        System.out.println("Eliminado");

    }

    @Test
    void findById() {

        CancionDao cancionDao = CancionDaoImpl.getInstance();
        Cancion cancion = null;
        cancion = cancionDao.findById(2);
        assertNotNull( cancion );
        assertEquals(2, cancion.getId());

        System.out.println( cancion );

    }
}