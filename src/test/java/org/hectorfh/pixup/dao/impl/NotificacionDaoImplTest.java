package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.NotificacionDao;
import org.hectorfh.pixup.model.Notificacion;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotificacionDaoImplTest {

    @Test
    void getInstance() {
    }

    @Test
    void findAll() {

        List<Notificacion> list = null;
        NotificacionDao notificacionDao = NotificacionDaoImpl.getInstance();
        list = notificacionDao.findAll();
        assertNotNull( list );
        assertFalse(list.isEmpty() );
        list.forEach(System.out::println);
    }

    @Test
    void save() {

        NotificacionDao notificacionDao = NotificacionDaoImpl.getInstance();
        Notificacion notificacion = null;
        boolean res = false;
        notificacion = new Notificacion();
        notificacion.setFecha_n("2025-10-01");
        notificacion.setUsuario_id(1);
        notificacion.setTipo_not_id(1);
        res = notificacionDao.save( notificacion );
        assertTrue( res );

        System.out.println( notificacion );
    }

    @Test
    void update() {

        NotificacionDao notificacionDao = NotificacionDaoImpl.getInstance();
        Notificacion notificacion = null;
        boolean res = false;
        notificacion = notificacionDao.findById(2);
        assertNotNull(notificacion);
        notificacion.setFecha_n("2012-10-01");
        notificacion.setUsuario_id(1);
        notificacion.setTipo_not_id(1);
        res = notificacionDao.update( notificacion );
        assertTrue( res );

    }

    @Test
    void delete() {

        NotificacionDao notificacionDao = NotificacionDaoImpl.getInstance();
        Notificacion notificacion = null;
        boolean res = false;
        notificacion = notificacionDao.findById(1);
        assertNotNull(notificacion);
        res = notificacionDao.delete( notificacion );
        assertTrue( res );

        System.out.println("Eliminado");
    }

    @Test
    void findById() {

        NotificacionDao notificacionDao = NotificacionDaoImpl.getInstance();
        Notificacion notificacion = null;
        notificacion = notificacionDao.findById(2);
        assertNotNull( notificacion );
        assertEquals(2, notificacion.getId());

        System.out.print( notificacion );

    }

}