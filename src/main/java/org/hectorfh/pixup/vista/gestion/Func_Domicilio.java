package org.hectorfh.pixup.vista.gestion;
import org.hectorfh.pixup.registro.Datos;
import org.hectorfh.pixup.registro.Domicilio;
import org.hectorfh.pixup.util.ReadUtil;
import org.hectorfh.pixup.vista.Ejecutable;
import org.hectorfh.pixup.vista.Menu;
import org.hectorfh.pixup.vista.SolicitaDatos;

import java.util.ArrayList;

public class Func_Domicilio implements Ejecutable
{
    private static Func_Domicilio func_domicilio;
    private final ArrayList<Domicilio> listaDomicilio = new ArrayList<>();
    public Func_Domicilio() {
    }
    public static Func_Domicilio getInstance() {
        if (func_domicilio == null){
         func_domicilio = new Func_Domicilio();
        }
        return func_domicilio;
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
                    verDomicilio();
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
        Domicilio nDomicilio = new Domicilio();
        ((SolicitaDatos) nDomicilio).leerDatos();
        listaDomicilio.add(nDomicilio);
        System.out.println("Domicilio agregado con éxito.");
    }

    private void baja() {
        System.out.println("Ingrese el ID del Domicilio que quiere dar de baja:");
        int id = ReadUtil.getInstance().leerInt();
        boolean encontrado = false;

        for (Domicilio domicilio: listaDomicilio) {
            if (domicilio.getId() != null && domicilio.getId().equals(id)) {
                listaDomicilio.remove(domicilio);
                System.out.println("Domicilio eliminada con éxito.");
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

        for (Domicilio domicilio: listaDomicilio) {
            if (domicilio.getId() != null && domicilio.getId().equals(id)) {
                System.out.println("Ingrese los nuevos datos:");
                ((SolicitaDatos) domicilio).leerDatos(); // Solicita los nuevos datos
                System.out.println("Domicilio modificado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("ID no encontrado.");
        }
    }

    private void verDomicilio() {
        if (listaDomicilio.isEmpty()) {
            System.out.println("No hay domicilios registrados.");
        } else {
            System.out.println("Lista de Domicilios:");
            for (Domicilio domicilio : listaDomicilio) {
                System.out.println("ID: " + domicilio.getId() +
                        ", Calle: " + domicilio.getCalle() +
                        ", Numero Exterior: " + domicilio.getNum_exterior() +
                        ", Numero Interior: " + domicilio.getNum_interior() +
                        ", ID Usuario: " + domicilio.getId_usuario() +
                        ", ID Colonia: " + domicilio.getId_colonia() +
                        ", Tipo domicilio: " + domicilio.getId_tipo_domicilio());
            }
        }
    }
}
