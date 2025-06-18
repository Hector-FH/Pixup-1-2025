package org.hectorfh.pixup.dao;

import org.hectorfh.pixup.model.Notificacion;

import java.util.List;

public interface NotificacionDao {


    List<Notificacion> findAll();
    boolean save( Notificacion notificacion );
    boolean update( Notificacion notificacion );
    boolean delete( Notificacion notificacion );
    Notificacion findById( int id );


}
