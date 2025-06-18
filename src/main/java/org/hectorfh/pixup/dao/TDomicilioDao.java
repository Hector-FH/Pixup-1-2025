package org.hectorfh.pixup.dao;

import org.hectorfh.pixup.model.TDomicilio;

import java.util.List;

public interface TDomicilioDao {


    List<TDomicilio> findAll( );
    boolean save( TDomicilio tDomicilio );
    boolean update(TDomicilio tDomicilio );
    boolean delete( TDomicilio tDomicilio );
    TDomicilio findById( int id );



}
