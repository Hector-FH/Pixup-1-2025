package org.hectorfh.pixup.vista.gestion;
import org.hectorfh.pixup.registro.Datos;
import org.hectorfh.pixup.registro.Municipio;
import org.hectorfh.pixup.util.ReadUtil;
import org.hectorfh.pixup.vista.Ejecutable;
import org.hectorfh.pixup.vista.Menu;
import org.hectorfh.pixup.vista.SolicitaDatos;

import java.util.ArrayList;

public class Func_Municipio implements Ejecutable
{
  private static Func_Municipio func_municipio;
    private final ArrayList<Municipio> listaMunicipos = new ArrayList<>();
    public Func_Municipio() {
    }
    public static Func_Municipio getInstance() {
        if (func_municipio == null) {
            func_municipio = new Func_Municipio();
        }
        return func_municipio;
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
                    verMunicipio();
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
        Municipio nMunicipio = new Municipio();
        ((SolicitaDatos) nMunicipio).leerDatos();
        listaMunicipos.add(nMunicipio);
        System.out.println("Municipio agregado con éxito.");
    }

    private void baja() {
        System.out.println("Ingrese el ID del Municipio que quiere dar de baja:");
        int id = ReadUtil.getInstance().leerInt();
        boolean encontrado = false;

        for (Municipio municipio : listaMunicipos) {
            if (municipio.getId() != null && municipio.getId().equals(id)) {
                listaMunicipos.remove(municipio);
                System.out.println("Municipio eliminado con éxito.");
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

        for (Municipio municipio : listaMunicipos) {
            if (municipio.getId() != null && municipio.getId().equals(id)) {
                System.out.println("Ingrese los nuevos datos:");
                ((SolicitaDatos) municipio).leerDatos(); // Solicita los nuevos datos
                System.out.println("Municipio modificado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("ID no encontrado.");
        }
    }

    private void verMunicipio() {
        if (listaMunicipos.isEmpty()) {
            System.out.println("No hay municipios registrados.");
        } else {
            System.out.println("Lista de Municipios:");
            for (Municipio municipio : listaMunicipos) {
                System.out.println("ID: " + municipio.getId() +
                        ", Nombre: " + municipio.getNombre() +
                        ", ID Estado: " + municipio.getId_estado());
            }
        }
    }
}
