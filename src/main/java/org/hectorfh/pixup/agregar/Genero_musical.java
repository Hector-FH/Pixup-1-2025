package org.hectorfh.pixup.agregar;

public class Genero_musical
{
    private Integer id;
    private String descripcion;

    public Genero_musical() {
    }
    public Genero_musical(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
