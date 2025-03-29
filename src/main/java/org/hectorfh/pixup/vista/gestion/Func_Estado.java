package org.hectorfh.pixup.vista.gestion;
import org.hectorfh.pixup.registro.Datos;
import org.hectorfh.pixup.registro.Estado;
import org.hectorfh.pixup.util.ReadUtil;
import org.hectorfh.pixup.vista.Ejecutable;
import org.hectorfh.pixup.vista.Menu;
import org.hectorfh.pixup.vista.SolicitaDatos;
import java.util.ArrayList;

public class Func_Estado implements Ejecutable {
    private static Func_Estado func_estado;
    private final ArrayList<Estado> listaEstados = new ArrayList<>();
    public Func_Estado() {
    }
    public static Func_Estado getInstance() {
        if (func_estado == null){
            func_estado = new Func_Estado();
        }
        return func_estado;
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
                    verEstado();
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
        Estado nEstado = new Estado();
        ((SolicitaDatos) nEstado).leerDatos();
        listaEstados.add(nEstado);
        System.out.println("Estado agregado con éxito.");
    }

    private void baja() {
        System.out.println("Ingrese el ID del Estado que quiere dar de baja:");
        int id = ReadUtil.getInstance().leerInt();
        boolean encontrado = false;

        for (Estado estado : listaEstados) {
            if (estado.getId() != null && estado.getId().equals(id)) {
                listaEstados.remove(estado);
                System.out.println("Estado eliminado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("ID no encontrado.");
        }
    }

    private void cambio() {
        System.out.println("Ingrese el ID del Estado que desea modificar:");
        int id = ReadUtil.getInstance().leerInt();
        boolean encontrado = false;

        for (Estado estado : listaEstados) {
            if (estado.getId() != null && estado.getId().equals(id)) {
                System.out.println("Ingrese los nuevos datos:");
                ((SolicitaDatos) estado).leerDatos(); // Solicita los nuevos datos
                System.out.println("Estado modificado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("ID no encontrado.");
        }
    }

    private void verEstado() {
        if (listaEstados.isEmpty()) {
            System.out.println("No hay estados registrados.");
        } else {
            System.out.println("Lista de Estados:");
            for (Estado estado : listaEstados) {
                System.out.println("ID: " + estado.getId() + ", Nombre: " + estado.getNombre());
            }
        }
    }
}
