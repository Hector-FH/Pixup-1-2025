package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.TipoNotificacionDao;
import org.hectorfh.pixup.model.TipoNotificacion;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TipoNotificacionDaoImplTest {

    @Test
    void getInstance() {
    }

    @Test
    void findAll() {

        List<TipoNotificacion> list = null;
        TipoNotificacionDao tipoNotificacionDao = TipoNotificacionDaoImpl.getInstance();
        list = tipoNotificacionDao.findAll();
        assertNotNull( list );
        assertFalse(list.isEmpty() );
        list.forEach(System.out::println);
    }

    @Test
    void save() {

        TipoNotificacionDao tipoNotificacionDao = TipoNotificacionDaoImpl.getInstance();
        TipoNotificacion tipoNotificacion = null;
        boolean res = false;
        tipoNotificacion = new TipoNotificacion();
        tipoNotificacion.setDescripcion("Notificacion 1");
        tipoNotificacion.setRuta("Ruta 1");
        res = tipoNotificacionDao.save( tipoNotificacion );
        assertTrue( res );

        System.out.println( tipoNotificacion );
    }

    @Test
    void update() {

        TipoNotificacionDao tipoNotificacionDao = TipoNotificacionDaoImpl.getInstance();
        TipoNotificacion tipoNotificacion = null;
        boolean res = false;
        tipoNotificacion = tipoNotificacionDao.findById(1);
        assertNotNull(tipoNotificacion);
        tipoNotificacion.setDescripcion("Notificacion 2");
        tipoNotificacion.setRuta("Ruta 2");
        res = tipoNotificacionDao.update( tipoNotificacion );
        assertTrue( res );

    }

    @Test
    void delete() {

        TipoNotificacionDao tipoNotificacionDao = TipoNotificacionDaoImpl.getInstance();
        TipoNotificacion tipoNotificacion = null;
        boolean res = false;
        tipoNotificacion = tipoNotificacionDao.findById(2);
        assertNotNull(tipoNotificacion);
        res = tipoNotificacionDao.delete( tipoNotificacion );
        assertTrue( res );

        System.out.println("Eliminado");
    }

    @Test
    void findById() {

        TipoNotificacionDao tipoNotificacionDao = TipoNotificacionDaoImpl.getInstance();
        TipoNotificacion tipoNotificacion = null;
        tipoNotificacion = tipoNotificacionDao.findById(1);
        assertNotNull( tipoNotificacion );
        assertEquals(1, tipoNotificacion.getId());

        System.out.print( tipoNotificacion );

    }

}