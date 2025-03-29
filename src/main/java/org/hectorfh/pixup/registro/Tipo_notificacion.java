package org.hectorfh.pixup.registro;

public class Tipo_notificacion
{
    private Integer id;
    private String descripcion;
    private String ruta_plantilla;

    public Tipo_notificacion() {
    }

    public Tipo_notificacion(Integer id, String descripcion, String ruta_plantilla) {
        this.id = id;
        this.descripcion = descripcion;
        this.ruta_plantilla = ruta_plantilla;
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
    public String getRuta_plantilla() {
        return ruta_plantilla;
    }
    public void setRuta_plantilla(String ruta_plantilla) {
        this.ruta_plantilla = ruta_plantilla;
    }
}
