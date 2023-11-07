package Clases;

public class Persona {

    // ===== ATRIBUTOS =====
    private String nombre, apellido, rut;



    // ===== CONSTRUCTOR =====
    public Persona(String nombre, String apellido, String rut) {
        this.nombre     = nombre;
        this.apellido   = apellido;
        this.rut        = rut;
    }

    public Persona() {
    }



    // ===== GETTER =====
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }
}
