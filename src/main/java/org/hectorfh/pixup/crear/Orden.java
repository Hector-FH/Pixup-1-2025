package org.hectorfh.pixup.crear;

public class Orden
{
    private Integer id;
    private Float costo_total;
    //private fecha
    private Integer cantidad_total;
    //private estatus_envio;
    private Float costo_envio;
    private Integer usuario;

    public Orden() {
    }

    public Orden(Integer id, Float costo_total, Integer cantidad_total, Float costo_envio, Integer usuario) {
        this.id = id;
        this.costo_total = costo_total;
        this.cantidad_total = cantidad_total;
        this.costo_envio = costo_envio;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Float getCosto_total() {
        return costo_total;
    }
    public void setCosto_total(Float costo_total) {
        this.costo_total = costo_total;
    }
    public Integer getCantidad_total() {
        return cantidad_total;
    }
    public void setCantidad_total(Integer cantidad_total) {
        this.cantidad_total = cantidad_total;
    }
    public Float getCosto_envio() {
        return costo_envio;
    }
    public void setCosto_envio(Float costo_envio) {
        this.costo_envio = costo_envio;
    }
    public Integer getUsuario() {
        return usuario;
    }
    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }
}
