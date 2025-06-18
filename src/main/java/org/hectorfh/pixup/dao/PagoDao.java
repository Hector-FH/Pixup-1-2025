package org.hectorfh.pixup.dao;

import org.hectorfh.pixup.model.Pago;

import java.util.List;

public interface PagoDao {


    List<Pago> findAll();
    boolean save( Pago pago );
    boolean update( Pago pago );
    boolean delete( Pago pago );
    Pago findById( int id );


}
