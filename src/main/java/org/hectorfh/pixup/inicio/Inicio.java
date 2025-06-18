package org.hectorfh.pixup.inicio;

import org.hectorfh.pixup.util.ReadUtil;
import org.hectorfh.pixup.gui.consola.Consola;


public class Inicio {

    public Inicio() {
    }

    public static void main(String[] args) {

        System.out.println( "Inicio PixUp" );
        Consola.getInstance( ).run( );
        System.out.println( "Termino PixUp" );

        }
    }

