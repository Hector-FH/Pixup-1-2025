package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.OrdenDao;
import org.hectorfh.pixup.model.Orden;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrdenDaoImplTest {

    @Test
    void getInstance() {
    }


    @Test
    void findAll() {

        List<Orden> list = null;
        OrdenDao ordenDao = OrdenDaoImpl.getInstance();
        list = ordenDao.findAll();
        assertNotNull( list );
        assertFalse( list.isEmpty() );
        list.forEach(System.out::println);

    }


    @Test
    void save() {

        OrdenDao ordenDao = OrdenDaoImpl.getInstance();
        Orden orden = null;
        boolean res = false;
        orden = new Orden();
        orden.setCosto_total(550f);
        orden.setFecha("2025-21-04");
        orden.setCant_total(10);
        orden.setEstatus_envio("Enviado");
        orden.setCosto_envio(100f);
        orden.setUsuario_id(1);
        res = ordenDao.save( orden );
        assertTrue( res );

        System.out.println( orden );

    }

    @Test
    void update() {

        OrdenDao ordenDao = OrdenDaoImpl.getInstance();
        Orden orden = null;
        boolean res = false;
        orden = ordenDao.findById(2);
        assertNotNull( orden );
        orden.setCosto_total(700f);
        orden.setFecha("2025-21-04");
        orden.setCant_total(10);
        orden.setEstatus_envio("No Enviado");
        orden.setCosto_envio(200f);
        orden.setUsuario_id(1);
        res = ordenDao.update( orden );
        assertTrue( res );

        System.out.println( orden );

    }

    @Test
    void delete() {

        OrdenDao ordenDao = OrdenDaoImpl.getInstance();
        Orden orden = null;
        boolean res = false;
        orden = ordenDao.findById(3);
        assertNotNull( orden );
        res = ordenDao.delete( orden );
        assertTrue( res );

        System.out.println("Eliminado");

    }

    @Test
    void findById() {

        OrdenDao ordenDao = OrdenDaoImpl.getInstance();
        Orden orden = null;
        orden = ordenDao.findById(2);
        assertNotNull( orden );
        assertEquals(2, orden.getId());

        System.out.println( orden );

    }


}