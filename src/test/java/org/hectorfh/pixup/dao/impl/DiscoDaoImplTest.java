package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.DiscoDao;
import org.hectorfh.pixup.model.Disco;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiscoDaoImplTest {

    @Test
    void getInstance() {
    }


    @Test
    void findAll() {

        List<Disco> list = null;
        DiscoDao discoDao = DiscoDaoImpl.getInstance();
        list = discoDao.findAll();
        assertNotNull( list );
        assertFalse(list.isEmpty() );
        list.forEach(System.out::println);
    }

    @Test
    void save() {

        DiscoDao discoDao = DiscoDaoImpl.getInstance();
        Disco disco = null;
        boolean res = false;
        disco = new Disco();
        disco.setTitulo("Disco 1");
        disco.setPrecio(100f);
        disco.setExistencia(10);
        disco.setDescuento(20f);
        disco.setFecha_l("2025-10-09");
        disco.setImagen("Imagen1.jpg");
        disco.setArtista_id(1);
        disco.setDisquera_id(1);
        disco.setGeneromusical_id(1);
        res = discoDao.save( disco );
        assertTrue( res );

        System.out.println( disco );
    }

    @Test
    void update() {

        DiscoDao discoDao = DiscoDaoImpl.getInstance();
        Disco disco = null;
        boolean res = false;
        disco = discoDao.findById(1);
        assertNotNull(disco);
        disco.setTitulo("Disco 2");
        disco.setPrecio(1250f);
        disco.setExistencia(30);
        disco.setDescuento(10f);
        disco.setFecha_l("2014-11-03");
        disco.setImagen("Imagen2.jpg");
        disco.setArtista_id(1);
        disco.setDisquera_id(1);
        disco.setGeneromusical_id(1);
        res = discoDao.update( disco );
        assertTrue( res );

        System.out.println( disco );
    }

    @Test
    void delete() {

        DiscoDao discoDao = DiscoDaoImpl.getInstance();
        Disco disco = null;
        boolean res = false;
        disco = discoDao.findById(2);
        assertNotNull(disco);
        res = discoDao.delete( disco );
        assertTrue( res );

        System.out.println("Eliminado");
    }

    @Test
    void findById() {

        DiscoDao discoDao = DiscoDaoImpl.getInstance();
        Disco disco = null;
        disco = discoDao.findById(1);
        assertNotNull( disco );
        assertEquals(1, disco.getId());

        System.out.print( disco );

    }

}