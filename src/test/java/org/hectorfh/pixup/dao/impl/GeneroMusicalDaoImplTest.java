package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.GeneroMusicalDao;
import org.hectorfh.pixup.model.GeneroMusical;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GeneroMusicalDaoImplTest {

    @Test
    void getInstance() {
    }


    @Test
    void findAll() {

        List<GeneroMusical> list = null;
        GeneroMusicalDao generoMusicalDao = GeneroMusicalDaoImpl.getInstance();
        list = generoMusicalDao.findAll();
        assertNotNull( list );
        assertFalse(list.isEmpty() );
        list.forEach(System.out::println);
    }

    @Test
    void save() {

        GeneroMusicalDao generoMusicalDao = GeneroMusicalDaoImpl.getInstance();
        GeneroMusical generoMusical = null;
        boolean res = false;
        generoMusical = new GeneroMusical();
        generoMusical.setDescripcion("R&B");
        res = generoMusicalDao.save( generoMusical );
        assertTrue( res );

        System.out.println( generoMusical );
    }

    @Test
    void update() {

        GeneroMusicalDao generoMusicalDao = GeneroMusicalDaoImpl.getInstance();
        GeneroMusical generoMusical = null;
        boolean res = false;
        generoMusical = generoMusicalDao.findById(1);
        assertNotNull(generoMusical);
        generoMusical.setDescripcion("Cumbia");
        res = generoMusicalDao.update( generoMusical );
        assertTrue( res );

        System.out.println( generoMusical );
    }

    @Test
    void delete() {

        GeneroMusicalDao generoMusicalDao = GeneroMusicalDaoImpl.getInstance();
        GeneroMusical generoMusical = null;
        boolean res = false;
        generoMusical = generoMusicalDao.findById(2);
        assertNotNull(generoMusical);
        res = generoMusicalDao.delete( generoMusical );
        assertTrue( res );

        System.out.println("Eliminado");
    }

    @Test
    void findById() {

        GeneroMusicalDao generoMusicalDao = GeneroMusicalDaoImpl.getInstance();
        GeneroMusical generoMusical = null;
        generoMusical = generoMusicalDao.findById(1);
        assertNotNull( generoMusical );
        assertEquals(1, generoMusical.getId());

        System.out.print( generoMusical );

    }

}