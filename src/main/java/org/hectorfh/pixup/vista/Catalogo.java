package org.hectorfh.pixup.vista;

import org.hectorfh.pixup.util.ReadUtil;
import org.hectorfh.pixup.vista.gestion.Func_Domicilio;
import org.hectorfh.pixup.vista.gestion.Func_Estado;
import org.hectorfh.pixup.vista.gestion.Func_Municipio;
import org.hectorfh.pixup.vista.gestion.Func_Colonia;

public class Catalogo implements Ejecutable {

    private static Catalogo catalogo;
    public Catalogo() {
    }
    public static Catalogo getInstance() {
        if (catalogo == null) {
            catalogo = new Catalogo();
        }
        return catalogo;
    }

    @Override
    public void run() {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while (flag) {
            ejecutable = null;
            Menu.tercero();
            opcion = ReadUtil.getInstance().leerInt();
            switch (opcion) {
                case 1:
                    ejecutable = Func_Estado.getInstance();
                    break;
                case 2:
                    ejecutable = Func_Municipio.getInstance();
                    break;
                case 3:
                    ejecutable = Func_Colonia.getInstance();
                    break;
                case 4:
                    ejecutable = Func_Domicilio.getInstance();
                    break;
                case 5:
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
