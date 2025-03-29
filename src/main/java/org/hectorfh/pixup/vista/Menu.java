package org.hectorfh.pixup.vista;

public class Menu {

    public static void primero() {
        System.out.println("---------------------------------------------");
        System.out.println("    BIENVENIDO  ");
        System.out.println(" (1) Consola");
        System.out.println(" (2) Ventana");
        System.out.println(" (3) Salir");
        System.out.println("---------------------------------------------");
    }
    public static void segundo() {
        System.out.println("---------------------------------------------");
        System.out.println(" (1) Catalogo");
        System.out.println(" (2) Pendiente");
        System.out.println(" (3) Salir");
        System.out.println("---------------------------------------------");
    }
    public static void tercero() {
        System.out.println("---------------------------------------------");
        System.out.println(" (1) Estado");
        System.out.println(" (2) Municipio");
        System.out.println(" (3) Colonia");
        System.out.println(" (4) Domicilio");
        System.out.println(" (5) Salir");
        System.out.println("---------------------------------------------");
    }
    public static void cuarto() {
        System.out.println("---------------------------------------------");
        System.out.println(" (1) Altas");
        System.out.println(" (2) Bajas");
        System.out.println(" (3) Cambios");
        System.out.println(" (4) Ver");
        System.out.println(" (5) Salir");
        System.out.println("---------------------------------------------");
    }

    public static void opcionInvalida() {
        System.out.println("Opción invalida");
    }
    public static void Id() {
        System.out.println("Ingrese la ID");
    }
    public static void nombre() {
        System.out.println("Ingrese el Nombre");
    }
    public static void IdEstado() {
        System.out.println("Ingrese la ID del Estado");
    }
    public static void IdMunicipio(){
        System.out.println("Ingrese la ID del Municipo");
    }
    public static void cp() {
        System.out.println("Ingrese el Codigo Postal");
    }
    public static void calle(){
        System.out.println("Ingrese la calle del domicilio");
    }
    public static void numExterior(){
        System.out.println("Ingresa el Número Exterior del Domicilio");

    }
    public static void numInterior(){
        System.out.println("Ingresa el Número Interior del Domicilio");

    }
    public static void IDUsuario(){
        System.out.println("Ingrese la ID del Usuario");
    }
    public static void IDColonia(){
        System.out.println("Ingrese la ID de la Colonia");
    }
    public static void IDTipoDomicilio(){
        System.out.println("Ingrese la ID del Tipo de Domicilio ");
    }
}
