package org.hectorfh.pixup.dao.impl;

import org.hectorfh.pixup.dao.UsuarioDao;
import org.hectorfh.pixup.model.Usuario;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioDaoImplTest {

    @Test
    void getInstance() {
    }

    @Test
    void findAll() {

        List<Usuario> list = null;
        UsuarioDao usuarioDao = UsuarioDaoImpl.getInstance();
        list = usuarioDao.findAll();
        assertNotNull( list );
        assertFalse( list.isEmpty() );
        list.forEach(System.out::println);

    }


    @Test
    void save() {

        UsuarioDao usuarioDao = UsuarioDaoImpl.getInstance();
        Usuario usuario = null;
        boolean res = false;
        usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setP_apellido("Ramirez");
        usuario.setS_apellido("Perez");
        usuario.setPassword("123456");
        usuario.setEmail("Juan@gmail.com");
        res = usuarioDao.save( usuario );
        assertTrue( res );

        System.out.println( usuario );

    }

    @Test
    void update() {

        UsuarioDao usuarioDao = UsuarioDaoImpl.getInstance();
        Usuario usuario = null;
        boolean res = false;
        usuario = usuarioDao.findById(1);
        assertNotNull( usuario );
        usuario.setNombre("Juan");
        usuario.setP_apellido("Perez");
        usuario.setS_apellido("Perez");
        usuario.setPassword("654321");
        usuario.setEmail("Juan20@gmail.com");
        res = usuarioDao.update( usuario );
        assertTrue( res );

        System.out.println( usuario );

    }

    @Test
    void delete() {

        UsuarioDao usuarioDao = UsuarioDaoImpl.getInstance();
        Usuario usuario = null;
        boolean res = false;
        usuario = usuarioDao.findById(2);
        assertNotNull( usuario );
        res = usuarioDao.delete( usuario );
        assertTrue( res );

        System.out.println("Eliminado");

    }

    @Test
    void findById() {

        UsuarioDao usuarioDao = UsuarioDaoImpl.getInstance();
        Usuario usuario = null;
        usuario = usuarioDao.findById(1);
        assertNotNull( usuario );
        assertEquals(1, usuario.getId());
        assertEquals("Juan", usuario.getNombre());

        System.out.println( usuario );

    }

}