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
@Table( name = "TBL_USUARIO" )
public class Usuario extends Catalogo{

    @Column( name ="NOMBRE" , nullable = false )
    private String nombre;

    @Column( name ="PRIMER_APELLIDO" , nullable = false )
    private String p_apellido;

    @Column( name ="SEGUNDO_APELLIDO" , nullable = false )
    private String s_apellido;

    @Column( name ="PASSWORD" , nullable = false )
    private String password;

    @Column( name ="EMAIL" , nullable = false )
    private String email;

}
