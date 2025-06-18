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
@Table( name = "TBL_PAGO")
public class Pago extends Catalogo{

    @Column( name = "NUMERO_TARJETA", nullable = false )
    private String num;

    @Column( name = "FECHA", nullable = false )
    private String fecha;

    @Column( name = "TBL_ORDEN_ID", nullable = false )
    private Integer orden_id;


}
