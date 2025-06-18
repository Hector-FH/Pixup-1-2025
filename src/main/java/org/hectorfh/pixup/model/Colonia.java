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
@Table (name = "TBL_COLONIA")
public class Colonia extends Catalogo {

    @Column( name = "NOMBRE", nullable = false )
    private String nombre;

    @Column( name= "CP", nullable = false )
    private  String cp;

    @Column ( name = "TBL_MUNICIPIO_ID", nullable = false)
    private Integer municipio_id;

}
