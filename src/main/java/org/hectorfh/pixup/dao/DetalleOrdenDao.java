package org.hectorfh.pixup.dao;

import org.hectorfh.pixup.model.DetalleOrden;

import java.util.List;

public interface DetalleOrdenDao {

    List<DetalleOrden> findAll();
    boolean save( DetalleOrden detalleOrden );
    boolean update( DetalleOrden detalleOrden );
    boolean delete( DetalleOrden detalleOrden );
    DetalleOrden findById( int id );

}
