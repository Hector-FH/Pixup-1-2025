package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.DisqueraDao;
import org.hectorfh.pixup.model.Disquera;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DisqueraDaoImplTest {

    @Test
    void getInstance() {
    }


    @Test
    void findAll() {

        List<Disquera> list = null;
        DisqueraDao disqueraDao = DisqueraDaoImpl.getInstance();
        list = disqueraDao.findAll();
        assertNotNull( list );
        assertFalse(list.isEmpty() );
        list.forEach(System.out::println);
    }

    @Test
    void save() {

        DisqueraDao disqueraDao = DisqueraDaoImpl.getInstance();
        Disquera disquera = null;
        boolean res = false;
        disquera = new Disquera();
        disquera.setNombre("SONY");
        res = disqueraDao.save( disquera );
        assertTrue( res );

        System.out.println( disquera );
    }

    @Test
    void update() {

        DisqueraDao disqueraDao = DisqueraDaoImpl.getInstance();
        Disquera disquera = null;
        boolean res = false;
        disquera = disqueraDao.findById(1);
        assertNotNull(disquera);
        disquera.setNombre("WARNER");
        res = disqueraDao.update( disquera );
        assertTrue( res );

        System.out.println( disquera );
    }

    @Test
    void delete() {

        DisqueraDao disqueraDao = DisqueraDaoImpl.getInstance();
        Disquera disquera = null;
        boolean res = false;
        disquera = disqueraDao.findById(2);
        assertNotNull(disquera);
        res = disqueraDao.delete( disquera );
        assertTrue( res );

        System.out.println("Eliminado");
    }

    @Test
    void findById() {

        DisqueraDao disqueraDao = DisqueraDaoImpl.getInstance();
        Disquera disquera = null;
        disquera = disqueraDao.findById(1);
        assertNotNull( disquera );
        assertEquals(1, disquera.getId());

        System.out.print( disquera );

    }
}