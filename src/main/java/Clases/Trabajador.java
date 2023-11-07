package Clases;

import Clases.Persona;

public class Trabajador extends Persona {

    // ===== ATRIBUTOS =====
    private String isapre, afp;



    // ===== CONSTRUCTOR =====
    public Trabajador(  String nombre   , String apellido   ,
                        String rut      , String isapre     ,
                        String afp) {
        super(nombre, apellido, rut);
        this.isapre = isapre;
        this.afp    = afp;
    }

    public Trabajador(  String isapre   , String afp) {
        this.isapre = isapre;
        this.afp    = afp;
    }


    // ===== CONSTRUCTOR VACÍO =====
    public Trabajador(String nombre, String apellido, String rut) {
        super(nombre, apellido, rut);
    }

    public Trabajador() {
    }



    // ===== GETTER =====
    public String getIsapre() {
        return isapre;
    }

    public String getAfp() {
        return afp;
    }
}
