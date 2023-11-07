package Controlador;

import Clases.Trabajador;

import java.util.Scanner;

public class Manejo {

    // ===== ATRIBUTOS =====
    private static Trabajador[][] Trabajadores = new Trabajador[100][5];
    private static int posicionTrabajador = 0;



    // ===== AGREGAR TRABAJADOR =====
    public static void agregarTrabajador(){
        Scanner lector  = new Scanner(System.in);

        System.out.println("\n        ----- AGREGAR TRABAJADOR -----");
        System.out.print  ("            Nombre     : ");
        String nombre   = lector.nextLine();

        System.out.print  ("            Apellido   : ");
        String apellido = lector.nextLine();

        System.out.print  ("            Rut        : ");
        String rut      = lector.nextLine();

        System.out.print  ("            Isapre     : ");
        String isapre   = lector.nextLine();

        System.out.print  ("            Afp        : ");
        String afp      = lector.nextLine();

        Clases.Trabajador nuevoTrabajador = new Trabajador( nombre  , apellido  ,
                                                            rut     , isapre    ,
                                                            afp);

        Trabajadores[posicionTrabajador][0] = nuevoTrabajador;
        posicionTrabajador++;

        System.out.println("        Trabajador agregado correctamente... ");
    }


    // ===== MOSTRAR TRABAJADORES =====
    public static void mostrarTrabajadores(){
        System.out.println    ("\n        ----- TRABAJADORES REGISTRADOS ----- ");
        for (int i = 0; i < posicionTrabajador ; i++) {
            System.out.println("            Trabajador " + (i + 1));
            System.out.println("            Nombre      : " + Trabajadores[i][0].getNombre());
            System.out.println("            Apellido    : " + Trabajadores[i][0].getApellido());
            System.out.println("            Rut         : " + Trabajadores[i][0].getRut());
            System.out.println("            Isapre      : " + Trabajadores[i][0].getIsapre());
            System.out.println("            Afp         : " + Trabajadores[i][0].getAfp());
            System.out.println("        ------------------------");
        }
    }
}
