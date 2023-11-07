package Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabajadorTest {

    @Test
    public void testGetIsapre() {
        Trabajador trabajador = new Trabajador( "Jesús"         , "Tapia"       ,
                                                "214767325"     , "ConSalud"    ,
                                                "AFP Plan Vital");
        assertEquals("ConSalud", trabajador.getIsapre());
    }


}