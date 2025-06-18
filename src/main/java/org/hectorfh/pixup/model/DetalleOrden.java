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
@Table( name = "TBL_DETALLE_ORDEN")
public class DetalleOrden extends Catalogo{

    @Column( name ="ID_DISCO" , nullable = true )
    private Integer id_disco;

    @Column( name ="ID_ORDEN" , nullable = true )
    private Integer id_orden;

    @Column( name ="CANTIDAD" , nullable = false )
    private Integer cantidad;

    @Column( name ="COSTO" , nullable = false )
    private Float costo;

    @Column( name ="TBL_ORDEN_ID" , nullable = false )
    private Integer orden_id;

    @Column( name ="TBL_DISCO_ID" , nullable = false )
    private Integer disco_id;




}
