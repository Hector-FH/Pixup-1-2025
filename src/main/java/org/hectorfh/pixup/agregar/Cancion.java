package org.hectorfh.pixup.agregar;

public class Cancion
{
    private Integer id;
    private String titulo;
    //private duracion
    private Disco disco;

    public Cancion() {
    }
    public Cancion(Integer id, String titulo, Disco disco) {
        this.id = id;
        this.titulo = titulo;
        this.disco = disco;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Disco getDisco() {
        return disco;
    }
    public void setDisco(Disco disco) {
        this.disco = disco;
    }
}
