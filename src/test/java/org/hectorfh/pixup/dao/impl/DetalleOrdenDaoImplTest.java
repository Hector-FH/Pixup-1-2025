package org.hectorfh.pixup.dao.impl;

import org.junit.jupiter.api.Test;

class DetalleOrdenDaoImplTest {

    @Test
    void getInstance() {
    }

/*
    @Test
    void findAll() {

        List<DetalleOrden> list = null;
        DetalleOrdenDao detalleOrdenDao = DetalleOrdenDaoImpl.getInstance();
        list = detalleOrdenDao.findAll();
        assertNotNull( list );
        assertFalse(list.isEmpty() );
        list.forEach(System.out::println);
    }

    @Test
    void save() {

        DetalleOrdenDao detalleOrdenDao = DetalleOrdenDaoImpl.getInstance();
        DetalleOrden detalleOrden = null;
        boolean res = false;
        detalleOrden = new DetalleOrden();
        detalleOrden.setId_disco(1);
        detalleOrden.setId_orden(1);
        detalleOrden.setCantidad(10);
        detalleOrden.setCosto(100f);
        detalleOrden.setOrden_id(2);
        detalleOrden.setDisco_id(1);

        res = detalleOrdenDao.save( detalleOrden );
        assertTrue( res );

        System.out.println( detalleOrden );
    }

    @Test
    void update() {

        DetalleOrdenDao detalleOrdenDao = DetalleOrdenDaoImpl.getInstance();
        DetalleOrden detalleOrden = null;
        boolean res = false;
        detalleOrden = detalleOrdenDao.findById(1);
        assertNotNull(detalleOrden);
        detalleOrden.setId_disco(1);
        detalleOrden.setId_orden(1);
        detalleOrden.setCantidad(50);
        detalleOrden.setCosto(250f);
        detalleOrden.setOrden_id(1);
        detalleOrden.setDisco_id(1);

        res = detalleOrdenDao.update( detalleOrden );
        assertTrue( res );

        System.out.println( detalleOrden );
    }

    @Test
    void delete() {

        DetalleOrdenDao detalleOrdenDao = DetalleOrdenDaoImpl.getInstance();
        DetalleOrden detalleOrden = null;
        boolean res = false;
        detalleOrden = detalleOrdenDao.findById(1);
        assertNotNull(detalleOrden);
        res = detalleOrdenDao.delete( detalleOrden );
        assertTrue( res );

        System.out.println("Eliminado");
    }

    @Test
    void findById() {

        DetalleOrdenDao detalleOrdenDao = DetalleOrdenDaoImpl.getInstance();
        DetalleOrden detalleOrden = null;
        detalleOrden = detalleOrdenDao.findById(1);
        assertNotNull( detalleOrden );
        assertEquals(1, detalleOrden.getId_orden());
        assertEquals(10, detalleOrden.getCantidad());
        System.out.print( detalleOrden );

    }
*/
}