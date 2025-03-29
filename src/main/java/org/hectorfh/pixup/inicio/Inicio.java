package org.hectorfh.pixup.inicio;

import org.hectorfh.pixup.util.ReadUtil;
import org.hectorfh.pixup.vista.Consola;
import org.hectorfh.pixup.vista.Ejecutable;
import org.hectorfh.pixup.vista.Menu;
import org.hectorfh.pixup.vista.Ventana;

public class Inicio {

    public Inicio() {
    }

    public static void main(String[] args) {

        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while (flag) {
            ejecutable = null;
            Menu.primero();
            opcion = ReadUtil.getInstance().leerInt();
            switch (opcion) {
                case 1:
                    ejecutable = Consola.getInstance();
                    break;
                case 2:
                    ejecutable = Ventana.getInstance();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if (ejecutable != null) {
                ejecutable.run();
            }
        }
    }
}
