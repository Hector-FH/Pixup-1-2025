package org.hectorfh.pixup.vista.gestion;
import org.hectorfh.pixup.registro.Colonia;
import org.hectorfh.pixup.registro.Datos;
import org.hectorfh.pixup.util.ReadUtil;
import org.hectorfh.pixup.vista.Ejecutable;
import org.hectorfh.pixup.vista.Menu;
import org.hectorfh.pixup.vista.SolicitaDatos;

import java.util.ArrayList;

public class Func_Colonia implements Ejecutable {
   private static Func_Colonia func_colonia;
    private final ArrayList<Colonia> listaColonias = new ArrayList<>();
    public Func_Colonia() {
    }
    public static Func_Colonia getInstance() {
        if (func_colonia == null) {
            func_colonia= new Func_Colonia();
        }
        return func_colonia;
    }
    @Override
    public void run() {
        boolean flag = true;
        int opcion = 0;
        Datos datos = null;
        while (flag) {
            datos = null;
            Menu.cuarto();
            opcion = ReadUtil.getInstance().leerInt();
            switch (opcion) {
                case 1:
                    alta();
                    break;
                case 2:
                    baja();
                    break;
                case 3:
                    cambio();
                    break;
                case 4:
                    verColonia();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if (datos != null) {
                ((SolicitaDatos) datos).leerDatos();

            }
        }
    }

    private void alta() {
        Colonia nColonia = new Colonia();
        ((SolicitaDatos) nColonia).leerDatos();
        listaColonias.add(nColonia);
        System.out.println("Colonia agregada con éxito.");
    }

    private void baja() {
        System.out.println("Ingrese el ID de la Colonia que quiere dar de baja:");
        int id = ReadUtil.getInstance().leerInt();
        boolean encontrado = false;

        for (Colonia colonia : listaColonias) {
            if (colonia.getId() != null && colonia.getId().equals(id)) {
                listaColonias.remove(colonia);
                System.out.println("Colonia eliminada con éxito.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("ID no encontrado.");
        }
    }

    private void cambio() {
        System.out.println("Ingrese el ID del Municipio que desea modificar:");
        int id = ReadUtil.getInstance().leerInt();
        boolean encontrado = false;

        for (Colonia colonia : listaColonias) {
            if (colonia.getId() != null && colonia.getId().equals(id)) {
                System.out.println("Ingrese los nuevos datos:");
                ((SolicitaDatos) colonia).leerDatos(); // Solicita los nuevos datos
                System.out.println("Colonia modificada con éxito.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("ID no encontrado.");
        }
    }

    private void verColonia() {
        if (listaColonias.isEmpty()) {
            System.out.println("No hay colonias registradas.");
        } else {
            System.out.println("Lista de Colonias:");
            for (Colonia colonia : listaColonias) {
                System.out.println("ID: " + colonia.getId() +
                        ", Nombre: " + colonia.getNombre() +
                        ", CP: " + colonia.getCp() +
                        ", ID Municipio: " + colonia.getId_municipio());
            }
        }
    }
}
