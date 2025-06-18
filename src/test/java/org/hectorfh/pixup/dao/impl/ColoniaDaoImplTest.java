package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.ColoniaDao;
import org.hectorfh.pixup.model.Colonia;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ColoniaDaoImplTest {

    @Test
    void getInstance(){

    }

    @Test
    void findAll() {

        List<Colonia> list = null;
        ColoniaDao coloniaDao = ColoniaDaoImpl.getInstance();
        list = coloniaDao.findAll();
        assertNotNull( list );
        assertFalse( list.isEmpty() );
        list.forEach(System.out::println);

    }

    @Test
    void save() {

        ColoniaDao coloniaDao = ColoniaDaoImpl.getInstance();
        Colonia colonia = null;
        boolean res = false;
        colonia = new Colonia();
        colonia.setNombre("Colonia 2");
        colonia.setCp("15100");
        colonia.setMunicipio_id(2);
        res = coloniaDao.save( colonia );
        assertTrue( res );

        System.out.println( colonia );


    }

    @Test
    void update() {


        ColoniaDao coloniaDao = ColoniaDaoImpl.getInstance();
        Colonia colonia = null;
        boolean res = false;
        colonia = coloniaDao.findById(2);
        assertNotNull( colonia );
        colonia.setNombre("La Laguna");
        colonia.setCp("78090");
        colonia.setMunicipio_id(2);
        res = coloniaDao.update( colonia );
        assertTrue( res );

        System.out.println( colonia );

    }

    @Test
    void delete() {


        ColoniaDao coloniaDao = ColoniaDaoImpl.getInstance();
        Colonia colonia = null;
        boolean res = false;
        colonia = coloniaDao.findById(1);
        assertNotNull( colonia );
        res = coloniaDao.delete( colonia );
        assertTrue( res );

        System.out.println("Eliminado");

    }

    @Test
    void findById() {

        ColoniaDao coloniaDao = ColoniaDaoImpl.getInstance();
        Colonia colonia = null;
        colonia = coloniaDao.findById(2);
        assertNotNull( colonia );
        assertEquals(2, colonia.getId());

        System.out.println( colonia );

    }
}