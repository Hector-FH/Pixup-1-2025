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
@Table(name = "TBL_NOTIFICACION")
public class Notificacion extends Catalogo{

    @Column( name = "FECHA_NOTIFICACION", nullable = false )
    private String fecha_n;

    @Column( name= "TBL_USUARIO_ID", nullable = false )
    private  Integer usuario_id;

    @Column ( name = "TBL_TIPO_NOTIFICACION_ID", nullable = false)
    private Integer tipo_not_id;

}
