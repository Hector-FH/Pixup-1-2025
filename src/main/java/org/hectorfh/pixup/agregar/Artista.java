package org.hectorfh.pixup.agregar;

public class Artista
{
    private Integer id;
    private String nombre;

    public Artista() {
    }
    public Artista(Integer id, String nombre) {
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
}
