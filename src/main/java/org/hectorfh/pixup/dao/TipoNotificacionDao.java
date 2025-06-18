package org.hectorfh.pixup.dao;

import org.hectorfh.pixup.model.TipoNotificacion;

import java.util.List;

public interface TipoNotificacionDao {



    List<TipoNotificacion> findAll();
    boolean save( TipoNotificacion tipoNotificacion );
    boolean update( TipoNotificacion tipoNotificacion );
    boolean delete( TipoNotificacion tipoNotificacion );
    TipoNotificacion findById( int id );

}
