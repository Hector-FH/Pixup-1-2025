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
@Table( name = "TBL_DOMICILIO" )
public class Domicilio extends Catalogo{

    @Column( name ="CALLE" , nullable = false )
    private String calle;

    @Column( name ="NUM_EXTERIOR" , nullable = false )
    private String num_ext;

    @Column( name ="NUM_INTERIOR" , nullable = false )
    private String num_int;

    @Column( name ="TBL_COLONIA_ID" , nullable = false )
    private Integer col_id;

    @Column( name ="TBL_TIPO_DOMICILIO_ID" , nullable = false )
    private Integer tipo_dom_id;

    @Column( name ="TBL_USUARIO_ID" , nullable = false )
    private Integer usuario_id;

}
