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
@Table( name = "TBL_DISCO")
public class Disco extends Catalogo{

    @Column( name ="TITULO" , nullable = false )
    private String titulo;

    @Column( name ="PRECIO" , nullable = false )
    private Float precio;

    @Column( name ="EXISTENCIA" , nullable = false )
    private Integer existencia;

    @Column( name ="DESCUENTO" , nullable = false )
    private Float descuento;

    @Column( name ="FECHA_LANZAMIENTO" , nullable = false )
    private String fecha_l;

    @Column( name ="IMAGEN" , nullable = false )
    private String imagen;

    @Column( name ="TBL_ARTISTA_ID" , nullable = false )
    private Integer artista_id;

    @Column( name ="TBL_DISQUERA_ID" , nullable = false )
    private Integer disquera_id;

    @Column( name ="TBL_GENERO_MUSICAL_ID" , nullable = false )
    private Integer generomusical_id;
}
