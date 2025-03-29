package org.hectorfh.pixup.agregar;

public class Disco
{
    private Integer id;
    private String titulo;
    private Float precio;
    private Integer existencia;
    private Float descuento;
    //private fecha_lanzamiento
    private String imagen;
    private Integer disquera;
    private Integer artista;
    private Integer genero_musical;

    public Disco() {
    }
    public Disco(Integer id, String titulo, Float precio, Integer existencia, Float descuento, String imagen, Integer disquera, Integer artista, Integer genero_musical) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.existencia = existencia;
        this.descuento = descuento;
        this.imagen = imagen;
        this.disquera = disquera;
        this.artista = artista;
        this.genero_musical = genero_musical;
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
    public Float getPrecio() {
        return precio;
    }
    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    public Integer getExistencia() {
        return existencia;
    }
    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }
    public Float getDescuento() {
        return descuento;
    }
    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Integer getDisquera() {
        return disquera;
    }
    public void setDisquera(Integer disquera) {
        this.disquera = disquera;
    }
    public Integer getArtista() {
        return artista;
    }
    public void setArtista(Integer artista) {
        this.artista = artista;
    }
    public Integer getGenero_musical() {
        return genero_musical;
    }
    public void setGenero_musical(Integer genero_musical) {
        this.genero_musical = genero_musical;
    }
}
