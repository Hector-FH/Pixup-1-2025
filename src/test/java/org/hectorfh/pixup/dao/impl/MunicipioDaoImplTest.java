package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.MunicipioDao;
import org.hectorfh.pixup.model.Municipio;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MunicipioDaoImplTest {

    @Test
    void getInstance() {
    }

    @Test
    void findAll() {

        List<Municipio> list = null;
        MunicipioDao municipioDao = MunicipioDaoImpl.getInstance();
        list = municipioDao.findAll();
        assertNotNull( list );
        assertFalse(list.isEmpty() );
        list.forEach(System.out::println);

    }

    @Test
    void save() {

        MunicipioDao municipioDao = MunicipioDaoImpl.getInstance();
        Municipio municipio = null;
        boolean res = false;
        municipio = new Municipio();
        municipio.setNombre("Gustavo A Madero");
        municipio.setEstado_id(1);
        res = municipioDao.save( municipio );
        assertTrue( res );

        System.out.println( municipio );
    }

    @Test
    void update() {

        MunicipioDao municipioDao = MunicipioDaoImpl.getInstance();
        Municipio municipio = null;
        boolean res = false;
        municipio = municipioDao.findById(2);
        assertNotNull( municipio );
        municipio.setNombre("Municipio 2");
        municipio.setEstado_id(1);
        res = municipioDao.update( municipio );
        assertTrue( res );

        System.out.println( municipio );
    }

    @Test
    void delete() {

        MunicipioDao municipioDao = MunicipioDaoImpl.getInstance();
        Municipio municipio = null;
        boolean res = false;
        municipio = municipioDao.findById(1);
        assertNotNull( municipio );
        res = municipioDao.delete( municipio );
        assertTrue( res );

        System.out.println("Eliminado");

    }

    @Test
    void findById() {

        MunicipioDao municipioDao = MunicipioDaoImpl.getInstance();
        Municipio municipio = null;
        municipio = municipioDao.findById(2);
        assertNotNull( municipio );
        assertEquals(2, municipio.getId());

        System.out.println( municipio );

    }
}