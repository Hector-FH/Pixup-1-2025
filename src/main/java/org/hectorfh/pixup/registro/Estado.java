package org.hectorfh.pixup.registro;

import org.hectorfh.pixup.util.ReadUtil;
import org.hectorfh.pixup.vista.Menu;

public class Estado extends Datos
{
    private Integer id;
    private String nombre;

    public Estado() {

    }
    public Estado(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void leerDatos()
    {
        Menu.Id();
        id = ReadUtil.getInstance().leerInt();
        Menu.nombre();
        nombre = ReadUtil.getInstance().leer();
    }
}
