package Vista;

import java.util.Scanner;
import Controlador.*;

public class Menu {

    // ===== MENU =====
    public static void Menu(){
        Scanner lector = new Scanner(System.in);
        String opcion;

        do{
            System.out.println("\n========================================");
            System.out.println("          Sistema de Trabajadores       ");
            System.out.println("            Jesús Tapia Martin          ");
            System.out.println("========================================");
            System.out.println("        [1] Ingresar trabajador         ");
            System.out.println("        [2] Mostrar trabajadores        ");
            System.out.println("        [3] Salir                       ");
            System.out.println("========================================");
            System.out.print  ("            Ingrese su opción  : ");
            opcion = lector.nextLine();
            System.out.println("========================================");

            switch (opcion){
                case "1":
                    Controlador.Manejo.agregarTrabajador();
                    break;

                case "2":
                    Controlador.Manejo.mostrarTrabajadores();
                    break;

                case "3":
                    System.out.println("    Hasta luego... ");
                    break;

                default:
                    System.out.println("    Ingrese una opción válida... ");
                    break;
            }
        } while (!opcion.equals("3"));
    }
}
