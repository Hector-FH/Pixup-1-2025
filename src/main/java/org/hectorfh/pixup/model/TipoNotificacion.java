package org.hectorfh.pixup.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "TBL_TIPO_NOTIFICACION")
public class TipoNotificacion extends Catalogo{

    @Column( name = "DESCRIPCION", nullable = false )
    private String descripcion;

    @Column( name = "RUTA_PLANTILLA", nullable = false )
    private String ruta;


}
