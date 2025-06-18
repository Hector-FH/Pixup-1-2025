package org.hectorfh.pixup.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode (callSuper = true)
@ToString (callSuper = true)
@Entity
@Table ( name = "TBL_ORDEN")
public class Orden extends Catalogo{


    @Column( name ="COSTO_TOTAL" , nullable = false )
    private Float costo_total;

    @Column( name ="FECHA" , nullable = false )
    private String fecha;

    @Column( name ="CANTIDAD_TOTAL" , nullable = false )
    private Integer cant_total;

    @Column( name ="ESTATUS_ENVIO" , nullable = false )
    private String estatus_envio;

    @Column( name ="COSTO_ENVIO" , nullable = false )
    private Float costo_envio;

    @Column( name ="TBL_USUARIO_ID" , nullable = false )
    private Integer usuario_id;


}
